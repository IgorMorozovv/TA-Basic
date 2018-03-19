package com.epam.test.calculator.suites.test.positive;

import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class BasicOperators extends Assert {

    Calculator calculator;

    @BeforeClass(groups = "basicOperations")
    public void beforeClass() {
	calculator = new Calculator();
    }

    @AfterClass(groups = "basicOperations")
    public void afterClass() {
    }

    @Test(groups = "basicOperations", dataProvider = "someDP")
    public void testPow(double a, double b) {

	double result = calculator.pow(a, b);
	double mathResult = Math.pow(a, b);

	assertTrue(result == mathResult);

    }

    @Test(groups = "basicOperations")
    public void testIsPositive() {

	boolean result = calculator.isNegative(0);

	assertTrue(result == false);

    }

    @Test(dataProvider = "someDP", groups = "basicOperations")
    public void sumTest(double a, double b) {

	double result = calculator.sum(a, b);
	double mathResult = a + b;
	assertEquals(result, mathResult);
    }

    @Test(dataProvider = "someDP", groups = "basicOperations")
    public void divTest(double a, double b) {

	double result = calculator.div(a, b);
	double mathResult = a / b;
	assertEquals(result, mathResult);

    }

    @Test(dataProvider = "someDP", groups = "basicOperations")
    public void multTest(double a, double b) {

	double result = calculator.mult(a, b);
	double mathResult = a * b;
	assertEquals(result, mathResult);

    }

    @DataProvider(name = "someDP")
    public Object[][] valuesForSum() {
	return new Object[][] { { 20, 3.9 }, { 3.92351654564654, 1 }, { 1, -10 }, { -1000.2, 3 }, { 0, 0 } };
    }

}
