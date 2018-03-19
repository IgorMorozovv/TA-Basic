package com.epam.test.calculator.runner.listener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class Listener implements IInvokedMethodListener {

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
	System.out.println("������ ���������� ����� " + method.getTestMethod().getMethodName());

    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
	System.out.println("��������� ���������� " + testResult.getStatus() + "\n");

    }

}
