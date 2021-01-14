package com.bank.service;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import com.bank.model.Branch;
import com.bank.pojo.BranchMain;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BranchService {
    public List<Branch> getAllBranches();
    public Branch getBranchByID(long branchID);
    public long getTotalNumberOfBranches();
    ResponseEntity<BranchMain> getBranches();
    ResponseEntity<BranchMain> getBranchesByBrand(String brandName);
}
