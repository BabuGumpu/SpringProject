package com.bank.dao;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import com.bank.model.Branch;
import com.bank.pojo.BranchMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

@Repository
public class BranchDAOImpl implements BranchDAO {
    private static final Logger logger = LoggerFactory.getLogger(BranchDAOImpl.class);

    private EntityManager entityManager;

    @Autowired
    public BranchDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Branch> getAllBranches() {
        logger.info("::getAllBranches  Started -->");
        Query query = entityManager.createQuery("from Branch");
        List<Branch> branchList = query.getResultList();
        logger.info("::getAllBranches  End -->");
        return branchList;
    }

    @Override
    public Branch getBranchByID(long branchID) {
        logger.info("::getBranchByID  Started -->");
        Branch branch = entityManager.find(Branch.class, branchID);
        logger.info("::getBranchByID  End -->");
        return branch;
    }

    @Override
    public long getTotalNumberOfBranches() {
        logger.info("::getTotalNumberOfBranches  Started -->");
        Query query = entityManager.createQuery("from Branch");
        logger.info("::getTotalNumberOfBranches  query -->{}", query.toString());
        logger.info("::getTotalNumberOfBranches  End -->");
        return query.getResultList().size();
    }

    @Override
    public ResponseEntity<BranchMain> getBranches() {
        logger.info("::getBranches  Started -->");
        final String uri = "https://api.lloydsbank.com/open-banking/v2.2/branches";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        logger.info("::getBranches headers -->{}",headers.toString());

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        ResponseEntity<BranchMain> branchMain = restTemplate.exchange(uri, HttpMethod.GET, entity, BranchMain.class);
        //BranchMain branchMain = restTemplate.getForObject(uri, BranchMain.class);
        logger.info("::getBranches  End -->");
        return branchMain;
    }
}
