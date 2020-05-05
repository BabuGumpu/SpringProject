package com.bank.service;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 15/05/2019
 *
 */

import com.bank.model.Employees;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    public List<Employees> getAllEmployees();

    public Employees getEmployeeByID(long empID);

    public long getTotalNumberOfEmployees();
}
