package com.test.basic.junit.tests.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;

/**
 * Created by PriyabratP on 06-04-2017.
 */

public class JUnitSuite2 {

    @BeforeClass
    public static void onBeforeClass(){
        System.out.println("BeforeClass2");
    }


    @AfterClass
    public static void onAfterClass(){
        System.out.println("AfterClass2");
    }

    @Before
    public void onBeforeTest() throws ParseException {
        System.out.println("Before2");

    }

    @After
    public void onAfterTest(){
        System.out.println("After2");
    }

    @Test
    public void onTest1(){
        System.out.println("Test2");
    }
}
