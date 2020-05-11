package com.bank.service;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import com.bank.model.Branch;

import java.util.List;

public interface BranchService {
    public List<Branch> getAllBranches();

    public Branch getBranchByID(long branchID);

    public long getTotalNumberOfBranches();
}
