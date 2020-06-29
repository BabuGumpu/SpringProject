package com.bank.service;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import com.bank.dao.BranchDAO;
import com.bank.pojo.BranchMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {
    private static final Logger logger = LoggerFactory.getLogger(BranchServiceImpl.class);
    BranchDAO branchDAO;

    @Autowired
    public BranchServiceImpl(@Qualifier("branchDAOImpl") BranchDAO theBranchDAO) {
        branchDAO = theBranchDAO;
    }

    @Override
    public ResponseEntity<BranchMain> getBranches() {
        logger.info("::getBranches Started -->");
        return branchDAO.getBranches();
    }


}
