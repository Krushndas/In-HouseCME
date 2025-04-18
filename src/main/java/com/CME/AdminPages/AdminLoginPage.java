package com.CME.AdminPages;

import com.core_automation.base.BaseTest;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestDataUtil.getValue;
import static com.core_automation.utils.TestUtils.clickElement;
import static com.core_automation.utils.TestUtils.enterValue;

public class AdminLoginPage extends BaseTest {

    public void visitURL(){
        driver.get(getValue("app.url"));
    }

    public AdminLoginPage enterUsername(String username){
        enterValue(getLocator("loginPage.usernameField"), username);
        return this;
    }

    public AdminLoginPage enterPassword(String password){
        enterValue((getLocator("loginPage.passwordField")), password);
        return this;
    }

    public AdminLoginPage clickOnLoginButton(){
        clickElement(getLocator("loginPage.loginButton"));
        return this;
    }
}

