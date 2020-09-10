package com.bank.common;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 10/09/2020
 *
 */

import com.bank.dao.BranchDAOImpl;
import com.bank.pojo.BranchMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class CommonUtils {
    private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);

    public static String getURIByBrand(String brandName) {
        logger.info("::getURIByBrand  Started -->");
        switch (brandName) {
            case Constants.BOI:
                return Constants.BOI_BRANCH_2_2;
            case Constants.BOS:
                return Constants.BOS_BRANCH_2_2;
            case Constants.BARCLAYS:
                return Constants.BARCLAYS_BRANCH_2_2;
            case Constants.DANSKE:
                return Constants.DANSKE_BRANCH_2_2;
            case Constants.FTB:
                return Constants.FTB_BRANCH_2_2;
            case Constants.HALIFAX:
                return Constants.HALIFAX_BRANCH_2_2;
            case Constants.HSBC:
                return Constants.HSBC_BRANCH_2_2;
            case Constants.LLOYDS:
                return Constants.LLOYDS_BRANCH_2_2;
            case Constants.NATIONWIDE:
                return Constants.NATIONWIDE_BRANCH_2_2;
            case Constants.NATWEST:
                return Constants.NATWEST_BRANCH_2_2;
            case Constants.RBS:
                return Constants.RBS_BRANCH_2_2;
            case Constants.SANTANDER:
                return Constants.SANTANDER_BRANCH_2_2;
            case Constants.ULSTER:
                return Constants.ULSTER_BRANCH_2_2;
            default:
                return null;
        }
    }
}
