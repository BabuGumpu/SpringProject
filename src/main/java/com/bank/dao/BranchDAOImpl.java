package com.bank.dao;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import com.bank.pojo.BranchMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Repository
public class BranchDAOImpl implements BranchDAO {
    private static final Logger logger = LoggerFactory.getLogger(BranchDAOImpl.class);

    @Override
    public ResponseEntity<BranchMain> getBranches() {
        logger.info("::getBranches  Started -->");
        final String uri = "https://api.lloydsbank.com/open-banking/v2.2/branches";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        logger.info("::getBranches headers -->{}",headers.toString());

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        ResponseEntity<BranchMain> branchMain = restTemplate.exchange(uri, HttpMethod.GET, entity, BranchMain.class);
        //BranchMain branchMain = restTemplate.getForObject(uri, BranchMain.class);
        logger.info("::getBranches  End -->");
        return branchMain;
    }
}
