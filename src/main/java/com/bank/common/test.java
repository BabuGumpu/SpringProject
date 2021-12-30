package com.bank.common;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 22/06/2021
 *
 */

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String args[]) {
        String str1 = "1a10a100zqwes1000";
        String[] str2 = str1.replaceAll("\\D+", ",").split(",");
        long result = 0;
        for (int i = 0; i < str2.length; i++) {
            int temp = Integer.parseInt(str2[i]);
            result = result + temp;
            System.out.println(result);
        }
        System.out.println(result);

    }
}
