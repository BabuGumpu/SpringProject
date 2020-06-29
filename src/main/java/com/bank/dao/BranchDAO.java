package com.bank.dao;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import com.bank.model.Branch;
import com.bank.pojo.BranchMain;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BranchDAO {
    List<Branch> getAllBranches();
    Branch getBranchByID(long branchID);
    ResponseEntity<BranchMain> getBranches();
    long getTotalNumberOfBranches();
}
