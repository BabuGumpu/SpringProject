package com.bank.dao;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import com.bank.model.Branch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
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
}
