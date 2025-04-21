package com.CME.FrontEndPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestDataUtil.getValue;

public class Homepage extends BaseTest {

    public void visitHomepage(){
        driver.get(getValue("app.homepageURL"));
    }

    public void clickOnRegisterButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("homePage.registerButton")));
        TestUtils.clickElement(getLocator("homePage.registerButton"));
    }

    public void clickOnRegisterAsLearnerButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("signUp.registerAsLearner")));
        TestUtils.clickElement(getLocator("signUp.registerAsLearner"));
    }

    public void clickOnSignInButton(){
        TestUtils.clickElement(getLocator("homepage.signInButton"));

    }





}
