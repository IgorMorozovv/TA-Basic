package com.epam.test.calculator.runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.IInvokedMethodListener;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import com.epam.test.calculator.runner.listener.Listener;

public class TestRunner {
    
    private static String POSITIVE_TEST_MESSAGE = "Positive Tests Sute";
    private static String PATH_XML_SUITE = "src/com/epam/test/calculator/suites/SutePositiveTests.xml";

    private TestNG testNG = new TestNG();
    List<XmlSuite> suites = new ArrayList<XmlSuite>();
    IInvokedMethodListener adapter = new Listener();

    public static void main(String[] args) {

	TestRunner testRunner = new TestRunner();
	testRunner.run();
    }

    private void run() {

	setSuites();
	setTestNG();

	testNG.run();

    }


    @SuppressWarnings("deprecation")
    private void setTestNG() {
	testNG.setXmlSuites(suites);
	testNG.addListener(adapter);


    }

    private void setSuites() {

	XmlSuite suite = new XmlSuite();

	suite.setName(POSITIVE_TEST_MESSAGE);
	List<String> tests = new ArrayList<String>();
	tests.add(PATH_XML_SUITE);
	suite.setSuiteFiles(tests);
	suites.add(suite);

    }
}
