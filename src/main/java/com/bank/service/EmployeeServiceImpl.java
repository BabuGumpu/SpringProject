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
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employees> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
