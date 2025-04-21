package com.CME.TestCases;

import com.CME.AdminPages.AdminDashboard;
import com.CME.AdminPages.AdminLoginPage;
import com.CME.BaseClass;
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


    @BeforeClass
    public void beforeClass(){

        adminLoginPage = new AdminLoginPage();
        adminDashboard = new AdminDashboard();

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
        Common.assertionTrue(adminDashboard.isDashboardVisible(),"Dashboard is displayed");
        adminDashboard.clickOnMenuIcon()
                .clickOnModule(getValue("admin.learner"))
                .searchLearnerUser(getValue("learner.firstName") + timestamp + "@yopmail.com")
                .clickOnSearchIcon()
                .clickOnEditIcon();

    }

//    @AfterMethod
//    public void afterTest(){
//        BaseTest.tearDown();
//
//    }
}


