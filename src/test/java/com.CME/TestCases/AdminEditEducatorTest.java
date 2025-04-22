package com.CME.TestCases;

import com.CME.AdminPages.AdminDashboard;
import com.CME.AdminPages.AdminEditLearnerPage;
import com.CME.AdminPages.AdminLoginPage;
import com.CME.AdminPages.AdminManageEducatorPage;
import com.CME.BaseClass;
import com.CME.FrontEndPages.ManageLearnerPage;
import com.CME.FrontEndPages.ManageRegisterEducatorPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.core_automation.utils.TestDataUtil.getValue;

public class AdminEditEducatorTest extends BaseTest {
    public static AdminLoginPage adminLoginPage;
    public static AdminDashboard adminDashboard;
    public static ManageLearnerPage manageLearnerPage;
    public static AdminEditLearnerPage adminEditLearnerPage;
    public static ManageRegisterEducatorPage manageRegisterEducatorPage;
    public static AdminManageEducatorPage adminManageEducatorPage;


    @BeforeClass
    public void beforeClass() {

        adminLoginPage = new AdminLoginPage();
        adminDashboard = new AdminDashboard();
        manageLearnerPage = new ManageLearnerPage();
        adminEditLearnerPage = new AdminEditLearnerPage();
        manageRegisterEducatorPage = new ManageRegisterEducatorPage();
        adminManageEducatorPage = new AdminManageEducatorPage();

    }

    @BeforeMethod
    public void beforeMethod() {
        BaseClass.setup();
        adminLoginPage.visitURL();
    }

    @Test(description = "Verify that UAdmin is able to edit learner")
    public void verifyAdminIsAbleToEditLearner() throws InterruptedException {
        adminLoginPage.enterUsername(getValue("users.admin.username"))
                .enterPassword(getValue("users.admin.password"))
                .clickOnLoginButton();
        Common.assertionTrue(adminDashboard.isDashboardVisible(), "Dashboard is displayed");
        adminDashboard.clickOnMenuIcon()
                .clickOnModule(getValue("admin.educator"))
                .searchLearnerUser(getValue("educator.firstName") + timestamp + "@yopmail.com")
                .clickOnSearchIcon()
                .clickOnEducatorEditIcon();
        manageRegisterEducatorPage.enterFirstName(getValue("educator.firstName"))
                .enterMiddleName(getValue("educator.middleName"))
                .enterLastName(getValue("educator.lastName"))
                .selectDateOfBirth()
                .selectSuffix(getValue("educator.suffix"))
                .selectDegree(getValue("educator.degree"))
                .enterMobileNumber(String.valueOf(timestamp))
                .enterWorkPhoneNumber(String.valueOf(timestamp));
        adminManageEducatorPage.enterWorkEmail(getValue("adminEducator.edit.firstName") + timestamp + "@yopmail.com");
        manageRegisterEducatorPage.clickOnOPTCheckbox()
                .enterPassword(getValue("educator.password"))
                 .enterConfirmPassword(getValue("educator.password"))
                .uploadHeadShot()
                .uploadCV()
                .uploadDrivingLicenseID();
                //.clickOnNextButton()
        adminManageEducatorPage.clickOnEntityButton();
        manageRegisterEducatorPage.enterSSN(getValue("educator.SSN"))
                .enterBankRoutingNumber(getValue("educator.bankRoutingNumber"))
                .enterBankAccountNumber(getValue("educator.bankAccountNumber"))
                .uploadW9()
                .enterAddress(getValue("educator.address"))
                .enterAddress2(getValue("educator.address2"))
                .selectState(getValue("educator.state"))
                .enterCity(getValue("educator.city"))
                .enterZip(getValue("educator.zip"));
        adminManageEducatorPage.clickOnSubmitButton();
        adminManageEducatorPage.clickOnClearFilterButton();
        adminDashboard.searchLearnerUser(getValue("adminEducator.edit.firstName") + timestamp + "@yopmail.com")
                .clickOnSearchIcon();
        Common.assertionTrue(adminManageEducatorPage.isUpdatedLearnerDisplayed(getValue("adminEducator.edit.firstName") + timestamp + "@yopmail.com"), "Updated Educator name is displayed");



    }


//    @AfterMethod
//    public void afterTest(){
//        BaseTest.tearDown();
//
//    }


}

