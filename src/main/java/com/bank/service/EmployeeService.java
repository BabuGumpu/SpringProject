package com.bank.service;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 15/05/2019
 *
 */

import com.bank.model.Employees;

import java.util.List;

public interface EmployeeService {
    List<Employees> findAll();
    long count();
}
