package com.bank;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 14/05/2019
 *
 */

import com.bank.dao.EmployeeDAOImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.bank.model"})
public class BranchApplication {
    private static final Logger logger = LoggerFactory.getLogger(BranchApplication.class);

    public static void main(String[] args) {
        logger.info("::main method started");
        SpringApplication.run(BranchApplication.class, args);
    }
}
