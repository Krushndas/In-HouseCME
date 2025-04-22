package com.CME.FrontEndPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestUtils.isElementDisplayed;

public class ManageLearnerLoginPage extends BaseTest {

    public ManageLearnerLoginPage enterUsername(String email){
        TestUtils.enterValue(getLocator("login.email"), email);
        return this;
    }

    public ManageLearnerLoginPage clickOnLoginWithPasswordButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(getLocator("login.loginWithPasswordButton"));
        return this;
    }
    public ManageLearnerLoginPage enterPassword(String password){
        TestUtils.enterValue(getLocator("login.password"), password);
        return this;
    }

    public ManageLearnerLoginPage clickOnLoginButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(getLocator("generic.loginButton"));
        return this;
    }
    public boolean isUserIsLogin(){
        return isElementDisplayed(getLocator("learner.loginToastMessage"));
    }

}
