package com.epam.test.calculator.suites.test.negative;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class TrigonometricOperators extends Assert {

    Calculator calculator;
    private static double ANGLE90 = 90;

    @BeforeSuite
    public void beforeClass() {
	System.out.println("@BeforeClass method");
	calculator = new Calculator();
    }

    @AfterClass
    public void afterClass() {
	System.out.println("@AfterClass method");
    }

   
    @Test(expectedExceptions = Exception.class)
    @SuppressWarnings("unused")
    public void testTg() {

	double result = calculator.tg(ANGLE90);
	double mathResult = Math.tan(ANGLE90);
    }

    
    @Test(expectedExceptions = Exception.class)
    @SuppressWarnings("unused")
    public void testCtg() {

	double result = calculator.ctg(Math.PI);

    }

}
