package com.bank.service;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import com.bank.dao.BranchDAO;
import com.bank.model.Branch;
import com.bank.pojo.BranchMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {
    private static final Logger logger = LoggerFactory.getLogger(BranchServiceImpl.class);
    BranchDAO branchDAO;

    @Autowired
    public BranchServiceImpl(@Qualifier("branchDAOImpl") BranchDAO theBranchDAO) {
        branchDAO = theBranchDAO;
    }

    @Override
    @Transactional
    public List<Branch> getAllBranches() {
        logger.info("::getAllBranches Started -->");
        return branchDAO.getAllBranches();
    }

    @Override
    @Transactional
    public Branch getBranchByID(long branchID) {
        logger.info("::getBranchByID Started -->");
        return branchDAO.getBranchByID(branchID);
    }

    @Override
    public BranchMain getBranches() {
        logger.info("::getBranches Started -->");
        return branchDAO.getBranches();
    }

    @Override
    @Transactional
    public long getTotalNumberOfBranches() {
        logger.info("::getTotalNumberOfBranches Started -->");
        return branchDAO.getTotalNumberOfBranches();
    }
}
