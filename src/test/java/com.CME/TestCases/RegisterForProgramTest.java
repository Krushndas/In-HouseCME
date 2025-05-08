package com.CME.TestCases;

import com.CME.BaseClass;
import com.CME.FrontEndPages.Homepage;
import com.CME.FrontEndPages.ManageRegisterProgramPage;
import com.CME.FrontEndPages.ManageUsersLoginPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.core_automation.utils.TestDataUtil.getValue;

public class RegisterForProgramTest extends BaseTest {

    public static Homepage homepage;
    public static ManageUsersLoginPage manageUsersLoginPage;
    public static ManageRegisterProgramPage manageRegisterProgramPage;


    @BeforeClass
    public void beforeClass(){

        homepage = new Homepage();
        manageUsersLoginPage = new ManageUsersLoginPage();
        manageRegisterProgramPage = new ManageRegisterProgramPage();
    }

    @BeforeMethod
    public void beforeMethod() {
        BaseClass.setup();
        homepage.visitHomepage();
    }

    @Test(description = "Verify that User is able to register for the program")
    public void verifyLiveProgramRegistration() throws InterruptedException {
        homepage.clickOnSignInButton();
        manageUsersLoginPage.enterUsername(getValue("learner.firstName")+ timestamp +"@yopmail.com")
                .clickOnLoginWithPasswordButton()
                .enterPassword(getValue("learner.password"))
                .clickOnLoginButton();
        Common.assertionTrue(manageUsersLoginPage.isUserIsLogin(), "Educator is logged in successfully");
        manageRegisterProgramPage.
                clickOnRegisterLiveProgramButton()
                .clickOnContinewBrowsingButton()
                .clickOnRegisterOnDemandProgramButton()
                .clickOnViewMyProgramButton();


    }

//    @AfterMethod
//    public void afterTest(){
//        BaseTest.tearDown();
//
//    }
}


