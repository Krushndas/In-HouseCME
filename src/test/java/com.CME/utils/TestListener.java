package com.CME.utils;

import com.aventstack.extentreports.Status;
import com.core_automation.utils.ExtentManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.core_automation.base.BaseTest.driver;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        ExtentManager.getInstance();
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentManager.createTest(result.getMethod().getMethodName());
        ExtentManager.logInfo("Starting test: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentManager.logInfo("Test passed: " + result.getMethod().getMethodName());
        ExtentManager.getTest().pass("Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        ExtentManager.getTest().log(Status.FAIL, "Test failed: " + result.getThrowable());
        ExtentManager.getTest().addScreenCaptureFromBase64String(base64Screenshot, "Failure Screenshot");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentManager.logInfo("Test skipped: " + result.getMethod().getMethodName());
        ExtentManager.getTest().skip(result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentManager.flush();
    }
}


