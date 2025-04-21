package com.CME.TestCases;

import com.CME.BaseClass;
import com.CME.FrontEndPages.Homepage;
import com.CME.FrontEndPages.ManageLearnerPage;
import com.CME.FrontEndPages.ManageRegisterLearnerPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.core_automation.utils.TestDataUtil.getValue;


public class RegisterLearnerPageTest extends BaseTest {

    public static Homepage homePage;
    public static ManageRegisterLearnerPage registerLearnerPage;
    public static ManageLearnerPage manageLearnerPage;


    @BeforeClass
    public void beforeClass(){
        homePage = new Homepage();
        registerLearnerPage = new ManageRegisterLearnerPage();
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
//        manageLearnerPage.clickOnLearnerMyDashboardButton()
//                .clickOnEditProfileButton()
//                .enterFirstName(getValue("learner.firstName"))
//                .enterMiddleName(getValue("learner.middleName"))
//                .enterLastName(getValue("learner.lastName"))
//                .selectSuffix(getValue("learner.suffix"))
//                .enterMobileNumber(String.valueOf(timestamp))
//                .enterBackupEmail(getValue("learner.backupEmail") + timestamp + "@yopmail.com")
//                .enterWorkEmail(getValue("learner.firstName")+ timestamp +"@yopmail.com")
//                .enterAddress(getValue("learner.address"))
//                .enterCity(getValue("learner.city"))
//                .selectState(getValue("learner.state"))
//                .enterZip(getValue("learner.zip"))
//                .enterExpertise(getValue("learner.experties"))
//                .selectDegree(getValue("learner.degree"))
//                .selectBoardCertificate(getValue("learner.boardCertification"))
//                .clickOnSaveAndContinueButton()
//                //.selectGroup(getValue("learner.group"))
//                .clickOnSaveAndUpdateButton()
//                .clickOnAddPracticeButton()
//                .enterNameOfPractice(getValue("learner.practiceName"))
//                .enterPracticeAddress(getValue("learner.address"))
//                .enterPracticeAddress1((getValue("learner.address2")))
//                .enterPracticeCity(getValue("learner.city"))
//                .selectPracticeState(getValue("learner.state"))
//                .enterPracticeZip(getValue("learner.zip"))
//                .enterPracticePhoneNumber(getValue("learner.phoneNumber"))
//                .enterPracticeExtension(getValue("learner.extension"))
//                .enterPracticeFax(getValue("learner.phoneNumber"))
//                .clickOnSaveAndUpdateButton();
//        Common.assertionTrue(manageLearnerPage.isLearnerProfileUpdated(),"Learner profile is updated");

    }

    @AfterMethod
    public void afterTest(){
        BaseTest.tearDown();

    }
}




