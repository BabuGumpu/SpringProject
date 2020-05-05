package com.bank.dao;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 14/05/2019
 *
 */

import com.bank.model.Employees;

import java.util.List;

public interface EmployeeDAO {

    List<Employees> getAllEmployees();

    Employees getEmployeeByID(long empID);

    long getTotalNumberOfEmployees();

}
