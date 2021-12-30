package com.bank.dao;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 05/05/2020
 *
 */

import com.bank.model.Employees;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List getAllEmployees() {
        logger.info("::getAllEmployees  Started -->");
        //String hql = "FROM Employees";
        //return entityManager.createQuery(hql).getResultList();
        Query query = entityManager.createQuery("from Employees", Employees.class);
        logger.info("::getAllEmployees  query -->{}", query.toString());
        logger.info("::getAllEmployees  End -->");
        return query.getResultList();
    }

    @Override
    public Employees getEmployeeByID(long empID) {
        logger.info("::getEmployeeByID  Started -->");
        Employees employees = entityManager.find(Employees.class, empID);
        logger.info("::getEmployeeByID  End -->");
        return employees;
    }

    @Override
    public long getTotalNumberOfEmployees() {
        logger.info("::getTotalNumberOfEmployees  Started -->");
        Query query = entityManager.createQuery("from employees");
        logger.info("::getTotalNumberOfEmployees  query -->{}", query.toString());
        logger.info("::getTotalNumberOfEmployees  End -->");
        return query.getResultList().size();
    }
}
