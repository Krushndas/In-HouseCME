package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.TestUtils.getLocator;

public class AdminAddSponsorPage extends BaseTest {

    public AdminAddSponsorPage enterCompany(String company){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        TestUtils.enterValue(getLocator("sponsor.profile.companyName"), company);
        return this;
    }
    public AdminAddSponsorPage enterWebsite(String website){
        TestUtils.enterValue(getLocator("sponsor.profile.website"), website);
        return this;
    }
    public AdminAddSponsorPage enterPassword(String password){
        TestUtils.enterValue(getLocator("sponsor.profile.password"), password);
        return this;
    }
    public AdminAddSponsorPage enterConfirmPassword(String confirmPassword){
        TestUtils.enterValue(getLocator("sponsor.profile.confirmPassword"), confirmPassword);
        return this;
    }
    public AdminAddSponsorPage enterPrimaryContactFirstName(String primaryContactFirstName){
        TestUtils.enterValue(getLocator("sponsor.profile.primaryContactFirstName"), primaryContactFirstName);
        return this;
    }
    public AdminAddSponsorPage enterPrimaryContactLastName(String primaryContactLastName){
        TestUtils.enterValue(getLocator("sponsor.profile.primaryContactLastName"), primaryContactLastName);
        return this;
    }
    public AdminAddSponsorPage enterTitleOfPrimaryContact(String titleOfPrimaryContact){
        TestUtils.enterValue(getLocator("sponsor.profile.titleOfPrimaryContact"), titleOfPrimaryContact);
        return this;
    }
    public AdminAddSponsorPage enterPrimaryWorkPhoneNumber(String primaryWorkPhoneNumber){
        TestUtils.enterValue(getLocator("sponsor.profile.primaryWorkPhoneNumber"), primaryWorkPhoneNumber);
        return this;
    }
    public AdminAddSponsorPage enterPrimaryExtension(String primaryExtension){
        TestUtils.enterValue(getLocator("sponsor.profile.primaryExtension"), primaryExtension);
        return this;
    }
    public AdminAddSponsorPage enterPrimaryMobileNumber(String primaryMobileNumber){
        TestUtils.enterValue(getLocator("sponsor.profile.primaryMobileNumber"), primaryMobileNumber);
        return this;
    }
    public AdminAddSponsorPage enterPrimaryEmail(String primaryEmail){
        TestUtils.enterValue(getLocator("sponsor.profile.primaryEmail"), primaryEmail);
        return this;
    }
    public AdminAddSponsorPage enterSecondaryContactFirstName(String secondaryContactFirstName){
        TestUtils.enterValue(getLocator("sponsor.profile.secondaryContactFirstName"), secondaryContactFirstName);
        return this;
    }
    public AdminAddSponsorPage enterSecondaryContactLastName(String secondaryContactLastName){
        TestUtils.enterValue(getLocator("sponsor.profile.secondaryContactLastName"), secondaryContactLastName);
        return this;
    }
    public AdminAddSponsorPage enterSecondaryContactTitle(String secondaryContactTitle){
        TestUtils.enterValue(getLocator("sponsor.profile.secondaryContactTitle"), secondaryContactTitle);
        return this;
    }
    public AdminAddSponsorPage enterSecondaryWorkPhoneNumber(String secondaryWorkPhoneNumber){
        TestUtils.enterValue(getLocator("sponsor.profile.secondaryWorkPhoneNumber"), secondaryWorkPhoneNumber);
        return this;
    }
    public AdminAddSponsorPage enterSecondaryExtension(String secondaryExtension){
        TestUtils.enterValue(getLocator("sponsor.profile.secondaryExtension"), secondaryExtension);
        return this;
    }
    public AdminAddSponsorPage enterSecondaryMobileNumber(String secondaryMobileNumber){
        TestUtils.enterValue(getLocator("sponsor.profile.secondaryMobileNumber"), secondaryMobileNumber);
        return this;
    }
    public AdminAddSponsorPage enterSecondaryEmail(String secondaryEmail){
        TestUtils.enterValue(getLocator("sponsor.profile.secondaryEmail"), secondaryEmail);
        return this;
    }
    public AdminAddSponsorPage enterAddress(String address){
        TestUtils.enterValue(getLocator("generic.profile.address"), address);
        return this;
    }
    public AdminAddSponsorPage enterAddress2(String address2){
        TestUtils.enterValue(getLocator("sponsor.profile.address2"), address2);
        return this;
    }
    public AdminAddSponsorPage selectState(String state){
        TestUtils.selectDropdownValue(getLocator("sponsor.profile.state"), state);
        return this;
    }
    public AdminAddSponsorPage enterCity(String city){
        TestUtils.enterValue(getLocator("sponsor.profile.city"), city);
        return this;
    }
    public AdminAddSponsorPage enterZip(String zip){
        TestUtils.enterValue(getLocator("sponsor.profile.zip"), zip);
        return this;
    }
    public AdminAddSponsorPage enterBankRoutingNumber(String bankRoutingNumber){
        TestUtils.enterValue(getLocator("sponsor.profile.bankRoutingNumber"), bankRoutingNumber);
        return this;
    }
    public AdminAddSponsorPage enterBankAccountNumber(String bankAccountNumber){
        TestUtils.enterValue(getLocator("sponsor.profile.bankAccountNumber"), bankAccountNumber);
        return this;
    }
    public AdminAddSponsorPage enterApContactFirstName(String apContactFirstName){
        TestUtils.enterValue(getLocator("sponsor.profile.apContactFirstName"), apContactFirstName);
        return this;
    }
    public AdminAddSponsorPage enterApContactLastName(String apContactLastName){
        TestUtils.enterValue(getLocator("sponsor.profile.apContactLastName"), apContactLastName);
        return this;
    }
    public AdminAddSponsorPage enterApContactEmail(String apContactEmail){
        TestUtils.enterValue(getLocator("sponsor.profile.apContactEmail"), apContactEmail);
        return this;
    }
    public AdminAddSponsorPage enterApContactPhoneNumber(String apContactPhoneNumber){
        TestUtils.enterValue(getLocator("sponsor.profile.apContactPhoneNumber"), apContactPhoneNumber);
        return this;
    }
    public AdminAddSponsorPage enterApExtension(String apExtension){
        TestUtils.enterValue(getLocator("sponsor.profile.apExtension"), apExtension);
        return this;
    }
    public AdminAddSponsorPage enterGrantContactFirstName(String grantContactFirstName){
        TestUtils.enterValue(getLocator("sponsor.profile.grantContactFirstName"), grantContactFirstName);
        return this;
    }
    public AdminAddSponsorPage enterGrantContactLastName(String grantContactLastName){
        TestUtils.enterValue(getLocator("sponsor.profile.grantContactLastName"), grantContactLastName);
        return this;
    }
    public AdminAddSponsorPage enterGrantContactTitle(String grantContactTitle){
        TestUtils.enterValue(getLocator("sponsor.profile.grantContactTitle"), grantContactTitle);
        return this;
    }
    public AdminAddSponsorPage enterGrantWorkPhoneNumber(String grantWorkPhoneNumber){
        TestUtils.enterValue(getLocator("sponsor.profile.grantWorkPhoneNumber"), grantWorkPhoneNumber);
        return this;
    }
    public AdminAddSponsorPage enterGrantExtension(String grantExtension){
        TestUtils.enterValue(getLocator("sponsor.profile.grantExtension"), grantExtension);
        return this;
    }
    public AdminAddSponsorPage enterGrantMobileNumber(String grantMobileNumber){
        TestUtils.enterValue(getLocator("sponsor.profile.grantMobileNumber"), grantMobileNumber);
        return this;
    }
    public AdminAddSponsorPage enterGrantEmail(String grantEmail){
        TestUtils.enterValue(getLocator("sponsor.profile.grantEmail"), grantEmail);
        return this;
    }
    public AdminAddSponsorPage enterGrantsFirstName(String grantsFirstName){
        TestUtils.enterValue(getLocator("sponsor.profile.grantsFirstName"), grantsFirstName);
        return this;
    }
    public AdminAddSponsorPage enterGrantsLastName(String grantsLastname){
        TestUtils.enterValue(getLocator("sponsor.profile.grantsLastname"), grantsLastname);
        return this;
    }
    public AdminAddSponsorPage enterGrantsTitle(String grantsTitle){
        TestUtils.enterValue(getLocator("sponsor.profile.grantsTitle"), grantsTitle);
        return this;
    }
    public AdminAddSponsorPage enterGrantsWorkPhoneNumber(String grantsWorkPhoneNumber){
        TestUtils.enterValue(getLocator("sponsor.profile.grantsWorkPhoneNumber"), grantsWorkPhoneNumber);
        return this;
    }
    public AdminAddSponsorPage enterGrantsExtension(String grantsExtension){
        TestUtils.enterValue(getLocator("sponsor.profile.grantsExtension"), grantsExtension);
        return this;
    }
    public AdminAddSponsorPage enterGrantsMobileNumber(String grantsMobileNumber){
        TestUtils.enterValue(getLocator("sponsor.profile.grantsMobileNumber"), grantsMobileNumber);
        return this;
    }
    public AdminAddSponsorPage enterGrantsEmail(String grantsEmail){
        TestUtils.enterValue(getLocator("sponsor.profile.grantsEmail"), grantsEmail);
        return this;
    }
    public AdminAddSponsorPage clickOnSaveSponsorButton(){
        TestUtils.clickElement(getLocator("sponsor.profile.addSponsorButton"));
        return this;
    }




}
