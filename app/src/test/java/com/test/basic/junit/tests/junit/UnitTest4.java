package com.test.basic.junit.tests.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by PriyabratP on 05-04-2017.
 * JUnit Parametrized Test
 * Parameterized via Constructor
 */

public class UnitTest4 {

    @BeforeClass
    public static void onBeforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void onAfterClass() {
        System.out.println("AfterClass");
    }

    @Before
    public void onBeforeTest() {
        System.out.println("Before");

    }

    @After
    public void onAfterTest() {
        System.out.println("After");
    }

    @Test
    public void onTestOne() {
        System.out.println("onTestOne");
    }

    @Test
    public void onTestAnother() {
        System.out.println("onTestAnother");
    }
}
