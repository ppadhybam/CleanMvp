package com.priyabrat.cleanmvp.demo;

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

    public static int add(int a, int b) {
        return a + b;
    }

    public boolean isEvenNumber(int number){
        if(number%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
