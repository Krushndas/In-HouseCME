package com.CME.TestCases;

import com.CME.AdminPages.AdminAddSponsorPage;
import com.CME.BaseClass;
import com.CME.FrontEndPages.Homepage;
import com.CME.FrontEndPages.ManageSponsorEditProfilePage;
import com.CME.FrontEndPages.ManageUsersLoginPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.core_automation.utils.TestDataUtil.getValue;

public class SponsorEditProfileTest extends BaseTest {
    public static Homepage homepage;
    public static ManageUsersLoginPage manageUsersLoginPage;
    public static ManageSponsorEditProfilePage manageSponsorEditProfilePage;
    public static AdminAddSponsorPage adminAddSponsorPage;


    @BeforeClass
    public void beforeClass(){

        homepage = new Homepage();
        manageUsersLoginPage = new ManageUsersLoginPage();
        manageSponsorEditProfilePage = new ManageSponsorEditProfilePage();
        adminAddSponsorPage = new AdminAddSponsorPage();

    }

    @BeforeMethod
    public void beforeMethod() {
        BaseClass.setup();
        homepage.visitHomepage();
    }

    @Test(description = "Verify sponsor is able to update profile")
    public void verifySponsorEditProfile() {
        homepage.clickOnSignInButton();
        manageUsersLoginPage.enterUsername(getValue("primaryContact.firstName") + timestamp + "@yopmail.com")
                .clickOnLoginWithPasswordButton()
                .enterPassword(getValue("learner.password"))
                .clickOnLoginButton();
        Common.assertionTrue(manageUsersLoginPage.isUserIsLogin(), "Sponsor is logged in successfully");
        manageSponsorEditProfilePage.clickOnEditProfileIcon()
                .clickOnEditProfileOption();
        adminAddSponsorPage.enterCompany(getValue("sponsor.edit.company"))
                .enterWebsite("https://" + "Test" + timestamp + ".com")

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
                .enterSecondaryEmail(getValue("secondaryContact.email"));
        manageSponsorEditProfilePage.clickOnSaveButton1();
        adminAddSponsorPage.enterAddress(getValue("address.line1"))
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
                .enterApExtension(getValue("apContact.extension"));
        manageSponsorEditProfilePage.clickOnSaveButton2();
        adminAddSponsorPage.enterGrantContactFirstName(getValue("grantContact.firstName"))
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
                .enterGrantsEmail(getValue("grantSignatory.email"));
        manageSponsorEditProfilePage.clickOnSaveButton();
        Common.assertionTrue(manageSponsorEditProfilePage.isSponsorProfileIsUpdated(), "Sponsor profile is updated");




    }

//    @AfterMethod
//    public void afterTest(){
//        BaseTest.tearDown();
//
//    }
}

