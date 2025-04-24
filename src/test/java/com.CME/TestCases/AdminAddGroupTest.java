package com.CME.TestCases;

import com.CME.AdminPages.*;
import com.CME.BaseClass;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.*;
import static com.core_automation.utils.TestDataUtil.getValue;

public class AdminAddGroupTest extends BaseTest {

    public static AdminLoginPage adminLoginPage;
    public static AdminDashboard adminDashboard;
    public static AdminManegeGroupPage adminManegeGroupPage;
    private static String testType;


    @BeforeClass
    @Parameters({"type"})
    public void beforeClass(String type) {
        testType = type;
        adminLoginPage = new AdminLoginPage();
        adminDashboard = new AdminDashboard();
        adminManegeGroupPage = new AdminManegeGroupPage();
    }

    @BeforeMethod
    public void beforeMethod() {
        BaseClass.setup();
        adminLoginPage.visitURL();

    }

    @Test(description = "Verify that Admin is able to add Sponsor")
    public void verifyAdminIsAbleToAddSponsor()  {
        adminLoginPage.enterUsername(getValue("users.admin.username"))
                .enterPassword(getValue("users.admin.password"))
                .clickOnLoginButton();
        Common.assertionTrue(adminDashboard.isDashboardVisible(), "Dashboard is displayed");
        adminDashboard.clickOnMenuIcon()
                .clickOnModule(getValue("admin.group"));
        adminManegeGroupPage.clickOnAddGroupButton()
                .enterGroupName(getValue("admin-group.groupName") + timestamp)
                .selectGroupType(getValue("admin-group.type"))
                .enterStreetAddress(getValue("admin-group.streetAddress"))
                .selectState(getValue("admin-group.state"))
                .enterCity(getValue("admin-group.city"))
                .enterZip(getValue("admin-group.zip"))
                .enterPhone(String.valueOf(timestamp))
                .enterFax(String.valueOf(timestamp))
                .enterNumberOfDoctors(getValue("admin-group.numberOfDoctors"))
                .clickOnAddGroupButton();
        adminDashboard.searchLearnerUser(getValue("admin-group.groupName") + timestamp)
                .clickOnSearchIcon();
        Common.assertionTrue(adminManegeGroupPage.isAddedGroupNameIsDisplayed(getValue("admin-group.groupName") + timestamp),"Added Group name Is displayed.");



    }

        @AfterMethod
        public void afterTest(){
            BaseTest.tearDown();

        }
    }

