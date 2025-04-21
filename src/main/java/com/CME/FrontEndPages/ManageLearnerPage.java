package com.CME.FrontEndPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestUtils.clickElement;
import static com.core_automation.utils.TestUtils.isElementDisplayed;

public class ManageLearnerPage extends BaseTest {

    public ManageLearnerPage clickOnLearnerMyDashboardButton() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("learner.myDashboard")));
        TestUtils.clickElement(getLocator("learner.myDashboard"));
        return this;
    }
    public ManageLearnerPage clickOnEditProfileButton()
             {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("learner.completeProfileButton")));
        TestUtils.clickElement(getLocator("learner.completeProfileButton"));
        return this;
    }
    public ManageLearnerPage enterFirstName(String firstName){
        TestUtils.enterValue(getLocator("learner.profile.firstname"),firstName);
        return this;
    }
    public ManageLearnerPage enterMiddleName(String middleName){
        TestUtils.enterValue(getLocator("learner.profile.middleName"),middleName);
        return this;
    }
    public ManageLearnerPage enterLastName(String lastName){
        TestUtils.enterValue(getLocator("learner.profile.lastname"),lastName);
        return this;
    }
    public ManageLearnerPage selectSuffix(String suffix) {
        TestUtils.selectDropdownValue(getLocator("learner.profile.suffix"), suffix);
        return this;
    }
    public ManageLearnerPage enterMobileNumber(String mobileNumber){
        TestUtils.enterValue(getLocator("learner.profile.mobileNumber"),mobileNumber);
        return this;
    }
    public ManageLearnerPage enterBackupEmail(String backupEmail) {
        TestUtils.enterValue(getLocator("learner.profile.backupEmail"), backupEmail);
        return this;
    }
    public ManageLearnerPage enterWorkEmail(String workEmail) {
        TestUtils.enterValue(getLocator("learner.profile.email"), workEmail);
        return this;
    }
    public ManageLearnerPage enterAddress(String address){
        TestUtils.enterValue(getLocator("learner.profile.address"),address);
        return this;
    }
    public ManageLearnerPage enterCity(String city){
        TestUtils.enterValue(getLocator("learner.profile.city"),city);
        return this;
    }
    public ManageLearnerPage selectState(String state){
        TestUtils.selectDropdownValue(getLocator("learner.profile.state"), state);
        return this;
    }
    public ManageLearnerPage enterZip(String zip){
        TestUtils.enterValue(getLocator("learner.profile.zip"),zip);
        return this;
    }
    public ManageLearnerPage enterExpertise(String expertise){
        TestUtils.enterValue(getLocator("learner.profile.expertise"),expertise);
        return this;
    }
    public ManageLearnerPage selectDegree(String degree){
        TestUtils.selectDropdownValue(getLocator("learner.profile.degree"), degree);
        return this;
    }
    public ManageLearnerPage selectBoardCertificate(String boardCertificate){
        TestUtils.selectDropdownValue(getLocator("learner.profile.boardCertification"), boardCertificate);
        return this;
    }
    public ManageLearnerPage selectStateLicense(String stateLicense){
        TestUtils.selectDropdownValue(getLocator("learner.profile.statelicense"), stateLicense);
        return this;
    }
    public ManageLearnerPage selectStateLicenseRenewalDate(){
        TestUtils.clickElement(getLocator("learner.profile.licenseRenewalDate"));
        selectDate();
        return this;
    }


    public ManageLearnerPage clickOnSaveAndContinueButton() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("learner.profile.save")));
        WebElement element = driver.findElement(By.xpath("//a[text()='Save and Continue']"));
// 2. Cast WebDriver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
// 3. Click using JavaScript
        js.executeScript("arguments[0].click();", element);

        return this;
    }
    public ManageLearnerPage selectGroup(String group){
        TestUtils.selectDropdownValue(getLocator("learner.profile.selectGroup"), group);
        return this;
    }
    public ManageLearnerPage clickOnAddPracticeButton(){
        TestUtils.clickElement(getLocator("learner.profile.addPracticeButton"));
        return this;
    }
    public ManageLearnerPage enterNameOfPractice(String practice){
        TestUtils.enterValue(getLocator("learner.profile.practiceName"),practice);
        return this;
    }
    public ManageLearnerPage enterPracticeAddress(String practiceAddress){
        TestUtils.enterValue(getLocator("learner.profile.practiceAddress1"),practiceAddress);
        return this;
    }
    public ManageLearnerPage enterPracticeAddress1(String practiceAddress1){
        TestUtils.enterValue(getLocator("learner.profile.practiceAddress2"),practiceAddress1);
        return this;
    }
    public ManageLearnerPage enterPracticeCity(String practiceCity){
        TestUtils.enterValue(getLocator("learner.profile.practiceCity"),practiceCity);
        return this;
    }
    public ManageLearnerPage selectPracticeState(String practiceState){
        TestUtils.selectDropdownValue(getLocator("learner.profile.practiceState"), practiceState);
        return this;
    }
    public ManageLearnerPage enterPracticeZip(String practiceZip){
        TestUtils.enterValue(getLocator("learner.profile.practiceZip"),practiceZip);
        return this;
    }
    public ManageLearnerPage enterPracticePhoneNumber(String practicePhoneNumber){
        TestUtils.enterValue(getLocator("learner.profile.practicePhoneNumber"),practicePhoneNumber);
        return this;
    }
    public ManageLearnerPage enterPracticeExtension(String practiceExtension){
        TestUtils.enterValue(getLocator("learner.profile.practiceExtension"),practiceExtension);
        return this;
    }
    public ManageLearnerPage enterPracticeFax(String practiceFax){
        TestUtils.enterValue(getLocator("learner.profile.practiceFaxNumber"),practiceFax);
        return this;
    }


    public ManageLearnerPage clickOnSaveAndUpdateButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("learner.profile.update")));
        WebElement element = driver.findElement(By.xpath("//button[text()='Save and Update']"));
// 2. Cast WebDriver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
// 3. Click using JavaScript
        js.executeScript("arguments[0].click();", element);
        return this;
    }

    public boolean isLearnerProfileUpdated(){
        return isElementDisplayed(getLocator("learner.profile.updateToastMessage"));
    }
    public ManageLearnerPage clickOnEditProfileIcon(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(getLocator("Learner.profileIcon"));
        return this;
    }
    public ManageLearnerPage clickOnChangePasswordButton(){
        TestUtils.clickElement(getLocator("learner.changePassword"));
        return this;
    }
    public static void selectDate(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        String formattedDate = currentDate.format(formatter);
        clickElement(getLocator("learner.profile.date", formattedDate));
        log.info("Selected Date {}", formattedDate);
    }


}
