package com.bank.service;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import com.bank.pojo.BranchMain;
import org.springframework.http.ResponseEntity;

public interface BranchService {


    public ResponseEntity<BranchMain> getBranches();

}
