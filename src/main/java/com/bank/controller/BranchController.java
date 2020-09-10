package com.bank.controller;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import com.bank.pojo.BranchMain;
import com.bank.service.BranchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping(path = "/branch")
public class BranchController {

    private static final Logger logger = LoggerFactory.getLogger(BranchController.class);
    private BranchService branchService;

    @Autowired
    public BranchController(BranchService theBranchService) {
        branchService = theBranchService;
    }

    @RequestMapping(value = "/branches", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<BranchMain> getBranches() {
        logger.info("::getBranches  Started -->");
        // This returns a JSON or XML with the users
        logger.info("::getBranches  size -->{}", branchService.getBranches());
        return branchService.getBranches();
    }

    @RequestMapping(value = "/branches/brand/{brandName}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<BranchMain> getBranchesByBrand(String brandName) {
        logger.info("::getBranchesByBrand  Started -->");
        // This returns a JSON or XML with the users
        logger.info("::getBranchesByBrand  size -->{}", branchService.getBranches());
        return branchService.getBranchesByBrand(brandName);
    }
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
