package com.bank.dao;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import com.bank.pojo.BranchMain;
import org.springframework.http.ResponseEntity;

public interface BranchDAO {
    ResponseEntity<BranchMain> getBranches();
}
