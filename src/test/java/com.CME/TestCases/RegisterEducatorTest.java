package com.CME.TestCases;

import com.CME.BaseClass;
import com.CME.FrontEndPages.Homepage;

import com.CME.FrontEndPages.ManageRegisterEducatorPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.core_automation.utils.TestDataUtil.getValue;

public class RegisterEducatorTest extends BaseTest {

    public static Homepage homePage;
    public static ManageRegisterEducatorPage manageRegisterEducatorPage;



    @BeforeClass
    public void beforeClass(){
        homePage = new Homepage();
        manageRegisterEducatorPage = new ManageRegisterEducatorPage();

    }

    @BeforeMethod
    public void beforeMethod() {
        BaseClass.setup();
        homePage.visitHomepage();
    }

    @Test(description = "Register as educator test")
    public void verifyRegisterAsEducator() throws InterruptedException {
        homePage.clickOnRegisterButton();
        homePage.clickOnRegisterAsEducatorButton();
        manageRegisterEducatorPage.enterFirstName(getValue("educator.firstName"))
                //.enterMiddleName(getValue("educator.middleName"))
                .enterLastName(getValue("educator.lastName"))
                .selectDateOfBirth()
               // .selectSuffix(getValue("educator.suffix"))
                .selectDegree(getValue("educator.degree"))
                .enterMobileNumber(String.valueOf(timestamp))
                .enterWorkPhoneNumber(String.valueOf(timestamp))
                .enterWorkEmail(getValue("educator.firstName")+ timestamp + "@yopmail.com")
               // .clickOnOPTCheckbox()
                .enterPassword(getValue("educator.password"))
                .enterConfirmPassword(getValue("educator.password"))
                //.uploadHeadShot()
                //.uploadCV()
                .uploadDrivingLicenseID()
                .clickOnNextButton()
                .clickOnEntityButton()
               // .enterSSN(getValue("educator.SSN"))
                //.enterBankRoutingNumber(getValue("educator.bankRoutingNumber"))
               // .enterBankAccountNumber(getValue("educator.bankAccountNumber"))
               // .uploadW9()
                .enterAddress(getValue("educator.address"))
                .enterAddress2(getValue("educator.address2"))
                .selectState(getValue("educator.state"))
                .enterCity(getValue("educator.city"))
                .enterZip(getValue("educator.zip"))
                .clickOnSubmitButton();
        Common.assertionTrue(manageRegisterEducatorPage.isEducatorDashboardVisible(), "Educator dashboard is displayed");
        Common.assertionTrue(manageRegisterEducatorPage.isUpdatedEducatorDisplayed("Welcome, " + getValue("educator.firstName") + " " +getValue("educator.lastName")), "Educator name is displayed");


    }

    @AfterMethod
    public void afterTest(){
        BaseTest.tearDown();

    }
}
