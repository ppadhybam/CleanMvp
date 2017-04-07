package com.test.basic.junit.tests.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by PriyabratP on 05-04-2017.
 */

public class UnitTestLifeCycle {

    private static String name = "Default";

    @BeforeClass
    public static void beforeClassExec(){
        System.out.println("beforeClassExec");
        name = "Priyabrat";
    }

    @AfterClass
    public static void afterClassExec(){
        System.out.println("afterClassExec");
    }

    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @Test
    public void testOne(){
        System.out.println("testOne"+name);
        /*ArrayList<String> list = new ArrayList<String>();
        assertNotNull(list);*/
    }

    @Test//(expected = NullPointerException.class)
    public void testTwo(){
        System.out.println("testTwo");
    }
}
