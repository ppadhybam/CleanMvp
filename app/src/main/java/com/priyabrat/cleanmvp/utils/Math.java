package com.priyabrat.cleanmvp.utils;

/**
 * Created by PriyabratP on 05-04-2017.
 */

public class Math {

    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
}
