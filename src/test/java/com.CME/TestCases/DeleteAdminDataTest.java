package com.CME.TestCases;

import com.CME.AdminPages.AdminDashboard;
import com.CME.AdminPages.AdminEditLearnerPage;
import com.CME.AdminPages.AdminLoginPage;
import com.CME.AdminPages.ManageDataDeletion;
import com.CME.BaseClass;
import com.CME.FrontEndPages.ManageLearnerPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.core_automation.utils.TestDataUtil.getValue;

public class DeleteAdminDataTest extends BaseTest {

    public static AdminLoginPage adminLoginPage;
    public static AdminDashboard adminDashboard;
    public static ManageLearnerPage manageLearnerPage;
    public static AdminEditLearnerPage adminEditLearnerPage;
    public static ManageDataDeletion manageDataDeletion;


    @BeforeClass
    public void beforeClass(){

        adminLoginPage = new AdminLoginPage();
        adminDashboard = new AdminDashboard();
        manageLearnerPage = new ManageLearnerPage();
        adminEditLearnerPage = new AdminEditLearnerPage();
        manageDataDeletion = new ManageDataDeletion();


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
                .searchLearnerUser("Aayush1@yopmail.com")
                .clickOnSearchIcon();
        manageDataDeletion.clickOnDeleteButton("Aayush1@yopmail.com")
                .clickOnDeleteOption();
        Common.assertionTrue(manageDataDeletion.isRecordIsDeleted(getValue("delete.learnerValidationMessage")), "Learner record is deleted successfully");
        manageDataDeletion.clickAdminOnMenuIcon();
        adminDashboard.clickOnModule(getValue("admin.educator"))
                .searchLearnerUser("Automation1745313348@yopmail.com")
                .clickOnSearchIcon();
        manageDataDeletion.clickOnDeleteButton("Automation1745313348@yopmail.com")
                .clickOnDeleteOption();
        Common.assertionTrue(manageDataDeletion.isRecordIsDeleted(getValue("delete.learnerValidationMessage")), "educator record is deleted successfully");
        manageDataDeletion.clickAdminOnMenuIcon();
        adminDashboard.clickOnModule(getValue("admin.sponsor"))
                .searchLearnerUser("https://Test1745406582.com")
                .clickOnSearchIcon();
        manageDataDeletion.clickOnDeleteButton("https://Test1745406582.com")
                .clickOnDeleteOption();
        Common.assertionTrue(manageDataDeletion.isRecordIsDeleted(getValue("delete.learnerValidationMessage")), "sponsor record is deleted successfully");
        manageDataDeletion.clickAdminOnMenuIcon();
        adminDashboard.clickOnModule(getValue("admin.group"))
                .searchLearnerUser("Automation_Group1746784235")
                .clickOnSearchIcon();
        manageDataDeletion.clickOnDeleteButton("Automation_Group1746784235")
                .clickOnDeleteOption();
        Common.assertionTrue(manageDataDeletion.isRecordIsDeleted(getValue("delete.learnerValidationMessage")), "Group record is deleted successfully");
        manageDataDeletion.clickAdminOnMenuIcon();
        adminDashboard.clickOnModule(getValue("admin.customerSupport"))
                .searchLearnerUser("AutomationL1746788148@yopmail.com")
                .clickOnSearchIcon();
        manageDataDeletion.clickOnDeleteButton("AutomationL1746788148@yopmail.com")
                .clickOnDeleteOption();
        Common.assertionTrue(manageDataDeletion.isRecordIsDeleted(getValue("delete.learnerValidationMessage")), "Customer support record is deleted successfully");
        manageDataDeletion.clickAdminOnMenuIcon();
        adminDashboard.clickOnModule(getValue("admin.program"))
                .clickOnModule(getValue("admin.liveProgram"))
                .searchLearnerUser("Automation Live Program Test1746788971")
                .clickOnSearchIcon();
        manageDataDeletion.clickOnDeleteButton("Automation Live Program Test1746788971")
                .clickOnDeleteOption();
        Common.assertionTrue(manageDataDeletion.isRecordIsDeleted(getValue("delete.learnerValidationMessage")), "live program record is deleted successfully");
        manageDataDeletion.clickAdminOnMenuIcon();
        adminDashboard.clickOnModule(getValue("admin.program"))
                .clickOnModule(getValue("admin.onDemandProgram"))
                .searchLearnerUser("Automation On Demand Program Test1746788971")
                .clickOnSearchIcon();
        manageDataDeletion.clickOnDeleteButton("Automation On Demand Program Test1746788971")
                .clickOnDeleteOption();
        Common.assertionTrue(manageDataDeletion.isRecordIsDeleted(getValue("delete.learnerValidationMessage")), "on demand program record is deleted successfully");


    }

//    @AfterMethod
//    public void afterTest(){
//        BaseTest.tearDown();
//
//    }
}

