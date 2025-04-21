package com.CME.TestCases;


import com.CME.BaseClass;
import com.CME.FrontEndPages.Homepage;
import com.CME.FrontEndPages.ManageLearnerLoginPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.core_automation.utils.TestDataUtil.getValue;

public class LearnerLoginTest extends BaseTest {

    public static Homepage homepage;
    public static ManageLearnerLoginPage manageLearnerLoginPage;


    @BeforeClass
    public void beforeClass(){

        homepage = new Homepage();
        manageLearnerLoginPage = new ManageLearnerLoginPage();

    }

    @BeforeMethod
    public void beforeMethod() {
        BaseClass.setup();
        homepage.visitHomepage();
    }

    @Test(description = "Verify that User is able to login")
    public void verifyUserIsAbleToLogin() {
        homepage.clickOnSignInButton();
        manageLearnerLoginPage.enterUsername(getValue("learner.firstName") + timestamp + "@yopmail.com")
                .clickOnLoginWithPasswordButton()
                .enterPassword(getValue("learner.password"))
                .clickOnLoginButton();
        Common.assertionTrue(manageLearnerLoginPage.isLearnerLogin(), "Learner logged in successfully");

    }

    @AfterMethod
    public void afterTest(){
        BaseTest.tearDown();

    }
}



