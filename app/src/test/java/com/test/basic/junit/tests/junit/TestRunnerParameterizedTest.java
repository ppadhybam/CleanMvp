package com.test.basic.junit.tests.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by PriyabratP on 06-04-2017.
 */

public class TestRunnerParameterizedTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(UnitTestParameterizedTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
