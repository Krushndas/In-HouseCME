package com.CME.TestCases;

import com.CME.AdminPages.AdminDashboard;
import com.CME.AdminPages.AdminLoginPage;
import com.CME.AdminPages.ManageNeedSomeHelpPage;
import com.CME.BaseClass;
import com.CME.FrontEndPages.Homepage;
import com.CME.FrontEndPages.ManageUsersLoginPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.*;

import static com.core_automation.utils.TestDataUtil.getValue;

public class AdminVerifyNeedSomeHelpRequestTest extends BaseTest {

    public static Homepage homepage;
    public static ManageUsersLoginPage manageUsersLoginPage;
    public static ManageNeedSomeHelpPage manageNeedSomeHelpPage;
    public static AdminLoginPage adminLoginPage;
    public static AdminDashboard adminDashboard;


    @BeforeClass
    public void beforeClass(){

        homepage = new Homepage();
        manageUsersLoginPage = new ManageUsersLoginPage();
        manageNeedSomeHelpPage = new ManageNeedSomeHelpPage();
        adminLoginPage = new AdminLoginPage();
        adminDashboard = new AdminDashboard();


    }
    @BeforeMethod
    public void setup() {
        BaseClass.setup(); // Launch browser
    }

    @Test(description = "Verify Learner is able to send need help request")
    public void verifyUserIsAbleToLogin() {
        homepage.visitHomepage();
        homepage.clickOnSignInButton();
        manageUsersLoginPage.enterUsername(getValue("learner.firstName") + timestamp + "@yopmail.com")
                .clickOnLoginWithPasswordButton()
                .enterPassword(getValue("learner.password"))
                .clickOnLoginButton();
        Common.assertionTrue(manageUsersLoginPage.isUserIsLogin(), "Learner is logged in successfully");
        manageNeedSomeHelpPage.clickOnNeedHelpSomeButton()
                .enterComment(getValue("admin-needSomeHelp.comment") + timestamp)
                .clickOnSubmitButton();
        Common.assertionTrue(manageNeedSomeHelpPage.isFormSubmitted(), "Need help form is submited");
    }

        @Test(dependsOnMethods = {"verifyUserIsAbleToLogin"})
        public void VerifyNeedSomeHelpRequest() {
            adminLoginPage.visitURL();
            adminLoginPage.enterUsername(getValue("users.admin.username"))
                    .enterPassword(getValue("users.admin.password"))
                    .clickOnLoginButton();
            Common.assertionTrue(adminDashboard.isDashboardVisible(), "Dashboard is displayed");
            adminDashboard.clickOnMenuIcon()
                    .clickOnModule(getValue("admin.customerSupport"))
                    .searchLearnerUser(getValue("admin-needSomeHelp.comment") + timestamp)
                    .clickOnSearchIcon();
            Common.assertionTrue(manageNeedSomeHelpPage.isUserEmailIsDisplay(getValue("learner.firstName") + timestamp + "@yopmail.com"), "User email is displayed");
            Common.assertionTrue(manageNeedSomeHelpPage.isNeedSomeRequestDisplay(getValue("admin-needSomeHelp.comment") + timestamp), "Need help request is display");
        }

    @AfterMethod
    public void afterTest(){
        BaseTest.tearDown();

    }
}




