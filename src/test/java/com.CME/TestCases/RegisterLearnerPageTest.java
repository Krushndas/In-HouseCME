package com.CME.TestCases;

import com.CME.BaseClass;
import com.CME.FrontEndPages.Homepage;
import com.CME.FrontEndPages.ManageLearnerPage;
import com.CME.FrontEndPages.RegisterLearnerPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.core_automation.utils.TestDataUtil.getValue;


public class RegisterLearnerPageTest extends BaseTest {

    public static Homepage homePage;
    public static RegisterLearnerPage registerLearnerPage;
    public static ManageLearnerPage manageLearnerPage;


    @BeforeClass
    public void beforeClass(){

        homePage = new Homepage();
        registerLearnerPage = new RegisterLearnerPage();
        manageLearnerPage = new ManageLearnerPage();

    }

    @BeforeMethod
    public void beforeMethod() {
        BaseClass.setup();
        homePage.visitHomepage();
    }

    @Test(description = "Register as learner test")
    public void verifyRegisterAsLearner() throws InterruptedException {
        homePage.clickOnRegisterButton();
        homePage.clickOnRegisterAsLearnerButton();
        registerLearnerPage.enterFirstName(getValue("learner.firstName"))
        .enterLastName(getValue("learner.lastName"))
                .enterWorkEmail(getValue("learner.firstName")+ timestamp +"@yopmail.com")
                .enterMobileNumber(String.valueOf(timestamp))
                .enterPassword(getValue("learner.password"))
                .clickOnLearnerRegisterButton();
        Common.assertionTrue(registerLearnerPage.isLearnerDashboardVisible(),"Learner Dashboard is displayed");
        manageLearnerPage.clickOnLearnerMyDashboardButton()
                .clickOnEditProfileButton()
                .enterMiddleName(getValue("learner.middleName"))
                .selectDegree(getValue("learner.degree"))
                .clickOnSaveAndContinueButton()
                .selectGroup(getValue("learner.group"))
                .clickOnSaveAndUpdateButton();
        Common.assertionTrue(manageLearnerPage.isLearnerProfileUpdated(),"Learner profile is updated");


    }

//    @AfterMethod
//    public void afterTest(){
//        BaseTest.tearDown();
//
//    }
}




