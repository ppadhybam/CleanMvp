package com.test.basic.junit.tests.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by PriyabratP on 06-04-2017.
 */
@RunWith(value = Suite.class)
@Suite.SuiteClasses({
        JUnitSuite1.class,
        JUnitSuite2.class
        }
)
public class UnitTestSuites {
}
