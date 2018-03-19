package com.epam.test.calculator.suites.test.negative;

import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class BasicOperators extends Assert {  

    Calculator calculator;

    @BeforeSuite
    public void beforeClass() {
	System.out.println("@BeforeClass method");
	calculator = new Calculator();
    }

    @AfterClass
    public void afterClass() {
    }

    
    @Test(expectedExceptions = NumberFormatException.class)
    @SuppressWarnings("unused")
    public void exeptionDivisionByZeroLongTest() {

	long result = calculator.div(2L, 0L);

    }

    @Test(expectedExceptions = Exception.class)
    @SuppressWarnings("unused")
    public void exeptionDivisionByZeroDoubleTest() {

	double result = calculator.div(2D, 0D);

    }

    @Test()
    @SuppressWarnings("unused")
    public void exeptionSqrtNegativeNumber() {

	double result = calculator.sqrt(-1111.111);

    }

}
