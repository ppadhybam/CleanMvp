package com.test.basic.junit.tests.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by PriyabratP on 05-04-2017.
 * Expected Exception Test
 */

public class UnitTest2 {

    @BeforeClass
    public static void onBeforeClass(){
        System.out.println("BeforeClass");
    }


    @AfterClass
    public static void onAfterClass(){
        System.out.println("AfterClass");
    }

    @Before
    public void onBeforeTest() {
        System.out.println("Before");
    }

    @After
    public void onAfterTest(){
        System.out.println("After");
    }

    @Test
    public void testExpectedExceptionUsingAnnotation(){
        System.out.println("testExpectedExceptionUsingAnnotation");
        try{
            int result = 10/0;
            //fail();
        }catch (ArithmeticException e){
            assertThat(e.toString(),is("/ by zero"));
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testExpectedExceptionUsingTryCatch(){
        System.out.println("testExpectedExceptionUsingTryCatch");
        int result = 10/0;
    }
}
