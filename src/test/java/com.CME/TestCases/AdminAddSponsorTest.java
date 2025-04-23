package com.CME.TestCases;

import com.CME.AdminPages.*;
import com.CME.BaseClass;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.core_automation.utils.TestDataUtil.getValue;

public class AdminAddSponsorTest extends BaseTest {

    public static AdminLoginPage adminLoginPage;
    public static AdminDashboard adminDashboard;
    public static AdminManageSponsorPage adminManageSponsorPage;
    public static AdminAddSponsorPage adminAddSponsorPage;


    @BeforeClass
    public void beforeClass(){

        adminLoginPage = new AdminLoginPage();
        adminDashboard = new AdminDashboard();
        adminManageSponsorPage = new AdminManageSponsorPage();
        adminAddSponsorPage = new AdminAddSponsorPage();
    }

    @BeforeMethod
    public void beforeMethod() {
        BaseClass.setup();
        adminLoginPage.visitURL();
    }

    @Test(description = "Verify that Admin is able to add Sponsor")
    public void verifyAdminIsAbleToAddSponsor() throws InterruptedException {
        adminLoginPage.enterUsername(getValue("users.admin.username"))
                .enterPassword(getValue("users.admin.password"))
                .clickOnLoginButton();
        Common.assertionTrue(adminDashboard.isDashboardVisible(),"Dashboard is displayed");
        adminDashboard.clickOnMenuIcon()
                .clickOnModule(getValue("admin.sponsor"));
        adminManageSponsorPage.clickOnAddSponsorButton();
        adminAddSponsorPage.enterCompany(getValue("sponsor.edit.company"))
                .enterWebsite("https://" + "Test" + timestamp + ".com")
                .enterPassword(getValue("learner.password"))
                .enterConfirmPassword(getValue("learner.password"))

                // Primary Contact
                .enterPrimaryContactFirstName(getValue("primaryContact.firstName"))
                .enterPrimaryContactLastName(getValue("primaryContact.lastName"))
                .enterTitleOfPrimaryContact(getValue("primaryContact.title"))
                .enterPrimaryWorkPhoneNumber(String.valueOf(timestamp))
                .enterPrimaryExtension(getValue("primaryContact.extension"))
                .enterPrimaryMobileNumber(String.valueOf(timestamp))
                .enterPrimaryEmail(getValue("primaryContact.firstName") + timestamp + "@yopmail.com")

                // Secondary Contact
                .enterSecondaryContactFirstName(getValue("secondaryContact.firstName"))
                .enterSecondaryContactLastName(getValue("secondaryContact.lastName"))
                .enterSecondaryContactTitle(getValue("secondaryContact.title"))
                .enterSecondaryWorkPhoneNumber(getValue("secondaryContact.workPhoneNumber"))
                .enterSecondaryExtension(getValue("secondaryContact.extension"))
                .enterSecondaryMobileNumber(getValue("secondaryContact.mobileNumber"))
                .enterSecondaryEmail(getValue("secondaryContact.email"))

                // Address
                .enterAddress(getValue("address.line1"))
                .enterAddress2(getValue("address.line2"))
                .enterCity(getValue("address.city"))
                .selectState(getValue("address.state"))
                .enterZip(getValue("address.zip"))

                // Bank
                .enterBankRoutingNumber(getValue("bank.routingNumber"))
                .enterBankAccountNumber(getValue("bank.accountNumber"))

                // AP Contact
                .enterApContactFirstName(getValue("apContact.firstName"))
                .enterApContactLastName(getValue("apContact.lastName"))
                .enterApContactEmail(getValue("apContact.email"))
                .enterApContactPhoneNumber(getValue("apContact.phoneNumber"))
                .enterApExtension(getValue("apContact.extension"))

                // Grant Contact
                .enterGrantContactFirstName(getValue("grantContact.firstName"))
                .enterGrantContactLastName(getValue("grantContact.lastName"))
                .enterGrantContactTitle(getValue("grantContact.title"))
                .enterGrantWorkPhoneNumber(getValue("grantContact.workPhoneNumber"))
                .enterGrantExtension(getValue("grantContact.extension"))
                .enterGrantMobileNumber(getValue("grantContact.mobileNumber"))
                .enterGrantEmail(getValue("grantContact.email"))

                // Grant Signatory
                .enterGrantsFirstName(getValue("grantSignatory.firstName"))
                .enterGrantsLastName(getValue("grantSignatory.lastName"))
                .enterGrantsTitle(getValue("grantSignatory.title"))
                .enterGrantsWorkPhoneNumber(getValue("grantSignatory.workPhoneNumber"))
                .enterGrantsExtension(getValue("grantSignatory.extension"))
                .enterGrantsMobileNumber(getValue("grantSignatory.mobileNumber"))
                .enterGrantsEmail(getValue("grantSignatory.email"))
                .clickOnSaveSponsorButton();
        adminManageSponsorPage.searchSponsorUser("https://" + "Test" + timestamp + ".com")
                .clickOnSearchIcon();
        Common.assertionTrue(adminManageSponsorPage.isAddedSponsorDisplayed(getValue("primaryContact.firstName") + timestamp + "@yopmail.com"), "Added Sponsor is displayed");

    }

    @AfterMethod
    public void afterTest(){
        BaseTest.tearDown();

    }
}


