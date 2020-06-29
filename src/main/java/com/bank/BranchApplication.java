package com.bank;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 14/05/2019
 *
 */

import com.bank.pojo.BranchMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EntityScan(basePackages = {"com.bank.model"})
public class BranchApplication {
    private static final Logger logger = LoggerFactory.getLogger(BranchApplication.class);

    public static void main(String[] args) {
        logger.info("::main method started");
        SpringApplication.run(BranchApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            BranchMain quote = restTemplate.getForObject(
                    "https://api.lloydsbank.com/open-banking/v2.2/branches", BranchMain.class);
            logger.info(quote.toString());
        };
    }
}
