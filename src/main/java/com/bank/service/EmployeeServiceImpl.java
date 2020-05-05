package com.bank.service;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 05/05/2020
 *
 */

import com.bank.dao.EmployeeDAO;
import com.bank.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;
    @Override
    public List<Employees> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employees getEmployeeByID(long empID) {
        return employeeDAO.getEmployeeByID(empID);
    }

    @Override
    public long getTotalNumberOfEmployees() {
        return employeeDAO.getTotalNumberOfEmployees();
    }
}
