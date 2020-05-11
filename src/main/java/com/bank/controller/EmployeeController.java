package com.bank.controller;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 14/05/2019
 *
 */

import com.bank.model.Employees;
import com.bank.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeService employeeService;

    @GetMapping(path = "/all")
    @ResponseBody
    public Iterable<Employees> getAllEmployees() {
        logger.info("::getAllEmployees  Started -->");
        // This returns a JSON or XML with the users
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "/test")
    @ResponseBody
    public String getTest(){
        logger.info("::getTest  Started -->");
        return "Testing";
    }

    @GetMapping(path = "/count")
    @ResponseBody
    public Long getCount(){
        logger.info("::getTCount  Started -->");
        return employeeService.getTotalNumberOfEmployees();
    }
}
