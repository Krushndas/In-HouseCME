package com.CME.TestCases;

import com.CME.AdminPages.AdminDashboard;
import com.CME.AdminPages.AdminEditLearnerPage;
import com.CME.AdminPages.AdminLoginPage;
import com.CME.BaseClass;
import com.CME.FrontEndPages.ManageLearnerPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.core_automation.utils.TestDataUtil.getValue;

public class AdminEditLearnerTest extends BaseTest {
    public static AdminLoginPage adminLoginPage;
    public static AdminDashboard adminDashboard;
    public static ManageLearnerPage manageLearnerPage;
    public static AdminEditLearnerPage adminEditLearnerPage;


    @BeforeClass
    public void beforeClass(){

        adminLoginPage = new AdminLoginPage();
        adminDashboard = new AdminDashboard();
        manageLearnerPage = new ManageLearnerPage();
        adminEditLearnerPage = new AdminEditLearnerPage();


    }

    @BeforeMethod
    public void beforeMethod() {
        BaseClass.setup();
        adminLoginPage.visitURL();
    }

    @Test(description = "Verify that Admin is able to edit learner")
    public void verifyAdminIsAbleToEditLearner() throws InterruptedException {
        adminLoginPage.enterUsername(getValue("users.admin.username"))
                .enterPassword(getValue("users.admin.password"))
                .clickOnLoginButton();
        Common.assertionTrue(adminDashboard.isDashboardVisible(),"Dashboard is displayed");
        adminDashboard.clickOnMenuIcon()
                .clickOnModule(getValue("admin.learner"))
                .searchLearnerUser(getValue("learner.firstName") + timestamp + "@yopmail.com")
                .clickOnSearchIcon()
                .clickOnEducatorEditIcon();
        manageLearnerPage.enterFirstName(getValue("adminLearner.edit.firstName"))
                .enterMiddleName(getValue("learner.middleName"))
                .enterLastName(getValue("learner.lastName"))
                .selectSuffix(getValue("learner.suffix"))
                .enterMobileNumber(String.valueOf(timestamp))
                .enterBackupEmail(getValue("learner.backupEmail") + timestamp + "@yopmail.com")
                .enterWorkEmail(getValue("adminLearner.edit.firstName")+ timestamp +"@yopmail.com")
                .enterAddress(getValue("learner.address"))
                .enterCity(getValue("learner.city"))
                .selectState(getValue("learner.state"))
                .enterZip(getValue("learner.zip"))
                .enterExpertise(getValue("learner.experties"))
                .selectDegree(getValue("learner.degree"))
                .selectBoardCertificate(getValue("learner.boardCertification"))
                .clickOnAdminAddPracticeButton()
                .enterNameOfPractice(getValue("learner.practiceName"))
                .enterPracticeAddress(getValue("learner.address"))
                .enterPracticeAddress1((getValue("learner.address2")))
                .enterPracticeCity(getValue("learner.city"))
                .selectPracticeState(getValue("learner.state"))
                .enterPracticeZip(getValue("learner.zip"))
                .enterPracticePhoneNumber(getValue("learner.phoneNumber"))
                .enterPracticeExtension(getValue("learner.extension"))
                .enterPracticeFax(getValue("learner.phoneNumber"))
                .clickOnUpdateLearnerButton();
        adminEditLearnerPage.clickOnClearFilterButton();
        adminDashboard.searchLearnerUser(getValue("adminLearner.edit.firstName")+ timestamp +"@yopmail.com")
                .clickOnSearchIcon();
        Common.assertionTrue(adminEditLearnerPage.isUpdatedLearnerDisplayed(getValue("adminLearner.edit.firstName")+ timestamp +"@yopmail.com"),"Updated Learner Name Is displayed.");


    }

//    @AfterMethod
//    public void afterTest(){
//        BaseTest.tearDown();
//
//    }
}


