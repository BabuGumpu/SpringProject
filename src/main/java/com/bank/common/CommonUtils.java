package com.bank.common;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 10/09/2020
 *
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonUtils {
    private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);

    private CommonUtils() {
        throw new IllegalStateException("CommonUtils class");
    }

    public static String getURIByBrand(String brandName) {
        logger.info("::getURIByBrand  Started brandName -->{}", brandName);
        String result;
        switch (brandName) {
            case "BOI":
                return Constants.BOI_BRANCH_2_2;
            case Constants.BOS:
                return Constants.BOS_BRANCH_2_2;
            case Constants.BARCLAYS:
                result = Constants.BARCLAYS_BRANCH_2_2;
                break;
            case Constants.DANSKE:
                result = Constants.DANSKE_BRANCH_2_2;
                break;
            case Constants.FTB:
                result = Constants.FTB_BRANCH_2_2;
                break;
            case Constants.HALIFAX:
                result = Constants.HALIFAX_BRANCH_2_2;
                break;
            case Constants.HSBC:
                result = Constants.HSBC_BRANCH_2_2;
                break;
            case Constants.LLOYDS:
                result = Constants.LLOYDS_BRANCH_2_2;
                break;
            case Constants.NATIONWIDE:
                result = Constants.NATIONWIDE_BRANCH_2_2;
                break;
            case Constants.NATWEST:
                result = Constants.NATWEST_BRANCH_2_2;
                break;
            case Constants.RBS:
                result = Constants.RBS_BRANCH_2_2;
                break;
            case Constants.SANTANDER:
                result = Constants.SANTANDER_BRANCH_2_2;
                break;
            case Constants.ULSTER:
                result = Constants.ULSTER_BRANCH_2_2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + brandName);
        }
        logger.info("::getURIByBrand  Completed result -->{}", result);
        return result;
    }
}
