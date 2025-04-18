package com.CME.TestCases;

import com.CME.AdminPages.AdminDashboard;
import com.CME.AdminPages.AdminLoginPage;
import com.CME.BaseClass;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.*;
import static com.core_automation.utils.TestDataUtil.getValue;

public class AdminLoginPageTest extends BaseTest {

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

    @Test(description = "Verify that User is able to login")
    public void verifyUserIsAbleToLogin() {
        adminLoginPage.enterUsername(getValue("users.admin.username"))
                .enterPassword(getValue("users.admin.password"))
                .clickOnLoginButton();
        Common.assertionTrue(adminDashboard.isDashboardVisible(),"Dashboard is displayed");
    }

    @AfterMethod
    public void afterTest(){
        BaseTest.tearDown();

    }
}


