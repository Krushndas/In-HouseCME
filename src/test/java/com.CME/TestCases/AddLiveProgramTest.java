package com.CME.TestCases;

import com.CME.AdminPages.AdminDashboard;
import com.CME.AdminPages.AdminLoginPage;
import com.CME.AdminPages.ManageLiveProgramPage;
import com.CME.AdminPages.ManageOnDemandProgramPage;
import com.CME.BaseClass;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.*;

import static com.core_automation.utils.TestDataUtil.getValue;

public class AddLiveProgramTest extends BaseTest {
    public static AdminLoginPage adminLoginPage;
    public static AdminDashboard adminDashboard;
    public static ManageOnDemandProgramPage manageOnDemandProgramPage;
    public static ManageLiveProgramPage manageLiveProgramPage;
    private static String testType;


    @BeforeClass
    @Parameters({"type"})
    public void beforeClass(String type) {
        testType = type;
        adminLoginPage = new AdminLoginPage();
        adminDashboard = new AdminDashboard();
        manageOnDemandProgramPage = new ManageOnDemandProgramPage();
        manageLiveProgramPage = new ManageLiveProgramPage();
    }

    @BeforeMethod
    public void beforeMethod() {
        BaseClass.setup();
        adminLoginPage.visitURL();

    }

    @Test(description = "Verify that Admin is able to add live program")
    public void verifyAdminIsAbleToAddLiveProgram() throws InterruptedException {
        adminLoginPage.enterUsername(getValue("users.admin.username"))
                .enterPassword(getValue("users.admin.password"))
                .clickOnLoginButton();
        Common.assertionTrue(adminDashboard.isDashboardVisible(), "Dashboard is displayed");
        adminDashboard.clickOnMenuIcon()
                .clickOnModule(getValue("admin.program"))
                .clickOnModule(getValue("admin.liveProgram"));
        manageOnDemandProgramPage.clickOnAddNewProgramButton()
                .enterProgramName(getValue("onDemandProgram.programName")+timestamp)
                .SelectCMEStatus(getValue("onDemandProgram.CMEStatus"))
                //.enterCMECredit(getValue("onDemandProgram.CMECredit"))
                .SelectCMEForum(getValue("onDemandProgram.forum"));
        manageLiveProgramPage.enterZoomURL("https://us06web.zoom.us/j/" + timestamp + "4?pwd=bgOMLNPulPZhQSU9GZTWkPeaaHMBY9.1");
        manageOnDemandProgramPage.enterProgramLength(getValue("onDemandProgram.programLength"))
                .enterProgramCost(getValue("onDemandProgram.cost"))
                .selectSponsor("Tech Innovators Inc.")
                .selectEducator("Automation")
                .selectProgramReevaluateDate()
                .selectProgramDate(getValue("onDemandProgram.programTime"))
                .selectProgramExpiryDate(getValue("onDemandProgram.programExpiryTime"))
                .SelectTimeZone(getValue("onDemandProgram.timeZone"))
                .enterDescription(getValue("onDemandProgram.description"))
                .clickOnAddProgramButton();
        adminDashboard.searchLearnerUser(getValue("onDemandProgram.programName") + timestamp)
                .clickOnSearchIcon();
        Common.assertionTrue(manageOnDemandProgramPage.IsAddedProgramIsDisplayed(getValue("onDemandProgram.programName")+timestamp), "Added on Demand program is displayed");
    }

//    @AfterMethod
//    public void afterTest(){
//        BaseTest.tearDown();
//
//    }
}
