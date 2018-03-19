package com.epam.test.calculator.suites.test.positive;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class TrigonometricOperators extends Assert {

  
    Calculator calculator;

    static double PI = 180;

    @BeforeSuite
    public void beforeClass() {
	System.out.println("@BeforeClass method");
	calculator = new Calculator();
    }

    @AfterClass
    public void afterClass() {
	System.out.println("@AfterClass method");
    }

    @DataProvider(name = "someDP")
    public Object[][] valuesForSum() {
	return new Object[][] { { PI }, { 0 }, { -PI }, { PI / 2 }, { -PI / 2 }, { -33.33 } };
    }

    @Test(groups = "trigonomer", dataProvider = "someDP")
    public void testSin(double angle) {

	double result = calculator.sin(angle);
	double mathResult = Math.sin(angle);
	assertTrue(result == mathResult);

    }

    @Test(groups = "trigonomer", dataProvider = "someDP")
    public void testCos(double angle) {

	double result = calculator.cos(angle);
	double mathResult = Math.cos(angle);
	assertTrue(result == mathResult);

    }

    @Test(groups = "trigonomer", dataProvider = "someDP")
    public void testTg(double angle) {

	double result = calculator.tg(angle);
	double mathResult = Math.tan(angle);

	assertTrue(result == mathResult);

    }

    @Test(groups = "trigonomer", dataProvider = "someDP")
    public void testCtg(double angle) {

	double result = calculator.ctg(angle);
	double mathResult = 1 / Math.tan(angle);

	assertTrue(result == mathResult);

    }

}
