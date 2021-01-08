package com.bank.service;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import com.bank.pojo.BranchMain;
import org.springframework.http.ResponseEntity;

public interface BranchService {

    ResponseEntity<BranchMain> getBranches();
    ResponseEntity<BranchMain> getBranchesByBrand(String brandName);
}
