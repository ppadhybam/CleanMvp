package com.test.basic.junit.tests.junit;

import com.priyabrat.cleanmvp.demo.Math;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by PriyabratP on 05-04-2017.
 */

@RunWith(value = Parameterized.class) // Step1
public class UnitTestParameterizedTest {

    private final int num;
    private final boolean status;

    private static Math math;

    public UnitTestParameterizedTest(int num, boolean status) { // Step3
        this.num = num;
        this.status = status;
    }

    @Parameterized.Parameters // Step2
    public static Collection getParameters() {
        Object[][] data = new Object[][]{{2, true}, {3, false}, {4, true}, {5, false}};
        return Arrays.asList(data);
    }

    @BeforeClass
    public static void onBeforeClass(){
        System.out.println("onBeforeClass");
        math = new Math();
    }

    @AfterClass
    public static void onAfterClass(){
        System.out.println("onAfterClass");
    }

    @Before
    public void onBefore(){
        System.out.println("onBefore");
    }

    @After
    public void onAfter(){
        System.out.println("onAfter");
    }

    @Test
    public void testTheGivenNumbersAreEvenOrNotUsingParametrizedTest(){
        System.out.println("testTheGivenNumbersAreEvenOrNotUsingParametrizedTest");
        Assert.assertEquals(status,math.isEvenNumber(num));
    }
}
