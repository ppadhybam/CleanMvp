package com.test.basic.junit.tests.junit;

import com.priyabrat.cleanmvp.demo.Math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PriyabratP on 05-04-2017.
 */


public class UnitTestFirst {

    @Before
    public void before(){
    }

    @Test
    public void additionTestForMathClass(){
        Math math = new Math();
        assertEquals(0,math.evaluate("1+1"));
    }
}
