package com.test.basic.junit.tests.junit;


import com.priyabrat.cleanmvp.demo.Person;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;

/**
 * Created by PriyabratP on 05-04-2017.
 *
 * Basic Annotations
 */

public class UnitTest1 {

    private static SimpleDateFormat simpleDateFormat;
    private Person person;

    @BeforeClass
    public static void onBeforeClass(){
        System.out.println("BeforeClass");
        simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
    }


    @AfterClass
    public static void onAfterClass(){
        simpleDateFormat = null;
        System.out.println("AfterClass");
    }

    @Before
    public void onBeforeTest() throws ParseException {
        person = new Person("Priyabrat Padhy",simpleDateFormat.parse("23-04-1991"));
        System.out.println("Before");

    }

    @After
    public void onAfterTest(){
        person = null;
        System.out.println("After");
    }

    @Test
    public void onTest1(){
        System.out.println("Test1");
        assertEquals(27,person.getAge());
    }
}
