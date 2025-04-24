package com.CME.TestCases;

import com.CME.AdminPages.*;
import com.CME.BaseClass;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.*;

import static com.core_automation.utils.TestDataUtil.getValue;

public class AdminVerifyOrphanNameOfPracticeTest extends BaseTest {

    public static AdminLoginPage adminLoginPage;
    public static AdminDashboard adminDashboard;
    public static AdminManageSponsorPage adminManageSponsorPage;
    public static AdminAddSponsorPage adminAddSponsorPage;
    public static ManageNameOfPracticePage manageNameOfPracticePage;
    private static String testType;


    @BeforeClass
    @Parameters({"type"})
    public void beforeClass(String type) {
        testType = type;
        adminLoginPage = new AdminLoginPage();
        adminDashboard = new AdminDashboard();
        adminManageSponsorPage = new AdminManageSponsorPage();
        adminAddSponsorPage = new AdminAddSponsorPage();
        manageNameOfPracticePage = new ManageNameOfPracticePage();
    }

    @BeforeMethod
    public void beforeMethod() {
        BaseClass.setup();
        adminLoginPage.visitURL();
    }

    @Test(description = "Is learner practice name id displayed")
    public void verifyLearnerNameOfPractice() {
        adminLoginPage.enterUsername(getValue("users.admin.username"))
                .enterPassword(getValue("users.admin.password"))
                .clickOnLoginButton();
        Common.assertionTrue(adminDashboard.isDashboardVisible(),"Dashboard is displayed");
        adminDashboard.clickOnMenuIcon()
                .clickOnModule(getValue("admin.orphan-NameOfPractice"))
                .searchLearnerUser(getValue("learner.practiceName") + timestamp)
                .clickOnSearchIcon();
        Common.assertionTrue(manageNameOfPracticePage.isLearnerPracticeNameIsDisplayed(getValue("learner.practiceName") + timestamp),"Learner practice name Is displayed.");

    }

    @AfterMethod
    public void afterTest(){
        BaseTest.tearDown();

    }
}
