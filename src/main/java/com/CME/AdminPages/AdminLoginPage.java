package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.TestUtils;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestDataUtil.getValue;
import static com.core_automation.utils.TestUtils.clickElement;
import static com.core_automation.utils.TestUtils.enterValue;

public class AdminLoginPage extends BaseTest {

    public void visitURL(){
        driver.get(getValue("app.url"));
    }

    public AdminLoginPage enterUsername(String username){
        TestUtils.enterValue(getLocator("loginPage.usernameField"), username);
        return this;
    }

    public AdminLoginPage enterPassword(String password){
        TestUtils.enterValue((getLocator("loginPage.passwordField")), password);
        return this;
    }

    public AdminLoginPage clickOnLoginButton(){
       TestUtils.clickElement(getLocator("generic.loginButton"));
        return this;
    }
}

