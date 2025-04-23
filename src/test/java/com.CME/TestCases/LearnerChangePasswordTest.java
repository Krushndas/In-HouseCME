package com.CME.TestCases;

import com.CME.BaseClass;
import com.CME.FrontEndPages.Homepage;
import com.CME.FrontEndPages.ManageUsersLoginPage;
import com.CME.FrontEndPages.ManageLearnerPage;
import com.CME.FrontEndPages.ManageUsersChangePasswordPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.core_automation.utils.TestDataUtil.getValue;

public class LearnerChangePasswordTest extends BaseTest {
    public static Homepage homepage;
    public static ManageUsersLoginPage manageLearnerLoginPage;
    public static ManageLearnerPage manageLearnerPage;
    public static ManageUsersChangePasswordPage manageUsersChangePasswordPage;


    @BeforeClass
    public void beforeClass(){

        homepage = new Homepage();
        manageLearnerLoginPage = new ManageUsersLoginPage();
        manageLearnerPage = new ManageLearnerPage();
        manageUsersChangePasswordPage = new ManageUsersChangePasswordPage();
    }

    @BeforeMethod
    public void beforeMethod() {
        BaseClass.setup();
        homepage.visitHomepage();
    }

    @Test(description = "Verify that User is able to change password")
    public void verifyUserIsAbleToChangePassword() {
        homepage.clickOnSignInButton();
        manageLearnerLoginPage.enterUsername(getValue("learner.firstName") + timestamp + "@yopmail.com")
                .clickOnLoginWithPasswordButton()
                .enterPassword(getValue("learner.password"))
                .clickOnLoginButton();
        Common.assertionTrue(manageLearnerLoginPage.isUserIsLogin(), "Learner is logged in successfully");
        manageLearnerPage.clickOnEditProfileIcon()
                .clickOnChangePasswordButton();
        manageUsersChangePasswordPage.enterCurrentPassword(getValue("learner.password"))
                .enterNewPassword(getValue("learner.password"))
                .enterConfirmPassword(getValue("learner.password"))
                .clickOnSaveNewPasswordButton();
        Common.assertionTrue(manageUsersChangePasswordPage.isPasswordUpdated(),"Learner password is updated");


    }

    @AfterMethod
    public void afterTest(){
        BaseTest.tearDown();

    }
}

