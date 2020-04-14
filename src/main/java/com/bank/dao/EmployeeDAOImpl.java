package com.bank.dao;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 15/05/2019
 *
 */

import com.bank.model.Employees;

import java.util.List;
import java.util.Optional;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public <S extends Employees> S save(S s) {
        return null;
    }

    @Override
    public <S extends Employees> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Employees> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Employees> findAll() {
        return null;
    }

    @Override
    public Iterable<Employees> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Employees employees) {

    }

    @Override
    public void deleteAll(Iterable<? extends Employees> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
