package com.CME.FrontEndPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestUtils.clickElement;
import static com.core_automation.utils.TestUtils.isElementDisplayed;

public class ManageRegisterEducatorPage extends BaseTest {

    public ManageRegisterEducatorPage enterFirstName(String firstName){
        TestUtils.enterValue(getLocator("generic.profile.firstname"),firstName);
        return this;
    }
    public ManageRegisterEducatorPage enterMiddleName(String middleName){
        TestUtils.enterValue(getLocator("generic.profile.middleName"),middleName);
        return this;
    }
    public ManageRegisterEducatorPage enterLastName(String lastName){
        TestUtils.enterValue(getLocator("generic.profile.lastname"),lastName);
        return this;
    }
    public ManageRegisterEducatorPage selectDateOfBirth(){
        TestUtils.clickElement(getLocator("educator.profile.DOB"));
        selectDate();
        return this;
    }
    public ManageRegisterEducatorPage selectSuffix(String suffix) {
        TestUtils.selectDropdownValue(getLocator("generic.profile.suffix"), suffix);
        return this;
    }
    public ManageRegisterEducatorPage selectDegree(String degree){
        TestUtils.selectDropdownValue(getLocator("generic.profile.degree"), degree);
        return this;
    }
    public ManageRegisterEducatorPage enterMobileNumber(String mobileNumber){
        TestUtils.enterValue(getLocator("generic.profile.mobileNumber"),mobileNumber);
        return this;
    }

    public ManageRegisterEducatorPage enterWorkPhoneNumber(String phoneNumber) {
        TestUtils.enterValue(getLocator("educator.profile.phoneNumber"), phoneNumber);
        return this;
    }
    public ManageRegisterEducatorPage enterWorkEmail(String workEmail) {
        TestUtils.enterValue(getLocator("educator.profile.email"), workEmail);
        return this;
    }
    public ManageRegisterEducatorPage clickOnOPTCheckbox(){
        TestUtils.clickElement(getLocator("educator.profile.optCheckbox"));
        return this;
    }
    public ManageRegisterEducatorPage enterPassword(String password){
        TestUtils.enterValue(getLocator("educator.profile.password"), password);
        return this;
    }
    public ManageRegisterEducatorPage enterConfirmPassword(String NewPassword){
        TestUtils.enterValue(getLocator("educator.profile.confirmPassword"), NewPassword);
        return this;
    }
    public ManageRegisterEducatorPage uploadHeadShot() throws InterruptedException {
        String filePath = System.getProperty("user.dir")+fs+"src"+fs+"main"+fs+"java"+fs+"com"+fs+"CME"+fs+"TestData"+fs+"Headshot.jpg";

        // Make the hidden input visible using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('headshot').classList.remove('d-none');");

        // Now send the file path
        WebElement uploadInput = driver.findElement(By.id("headshot"));
        uploadInput.sendKeys(filePath);
        return this;
    }
    public ManageRegisterEducatorPage uploadCV() throws InterruptedException {
        String filePath = System.getProperty("user.dir")+fs+"src"+fs+"main"+fs+"java"+fs+"com"+fs+"CME"+fs+"TestData"+fs+"CV.pdf";

        // Make the hidden input visible using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('cv').classList.remove('d-none');");

        // Now send the file path
        WebElement uploadInput = driver.findElement(By.id("cv"));
        uploadInput.sendKeys(filePath);
        return this;
    }
    public ManageRegisterEducatorPage uploadDrivingLicenseID() throws InterruptedException {
        String filePath = System.getProperty("user.dir")+fs+"src"+fs+"main"+fs+"java"+fs+"com"+fs+"CME"+fs+"TestData"+fs+"drivingLicenseID.jpg";

        // Make the hidden input visible using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('driving_license_id').classList.remove('d-none');");

        // Now send the file path
        WebElement uploadInput = driver.findElement(By.id("driving_license_id"));
        uploadInput.sendKeys(filePath);
        return this;
    }
    public ManageRegisterEducatorPage clickOnNextButton(){
        TestUtils.clickElement(getLocator("educator.profile.nextButton"));
        return this;
    }
    public ManageRegisterEducatorPage clickOnEntityButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(getLocator("educator.profile.entityButton"));
        return this;
    }

    public ManageRegisterEducatorPage enterSSN(String SSN){
        TestUtils.enterValue(getLocator("educator.profile.SSN"),SSN);
        return this;
    }
    public ManageRegisterEducatorPage enterBankRoutingNumber(String bankRoutingNumber){
        TestUtils.enterValue(getLocator("educator.profile.bankRoutingNumber"),bankRoutingNumber);
        return this;
    }
    public ManageRegisterEducatorPage enterBankAccountNumber(String bankAccountNumber){
        TestUtils.enterValue(getLocator("educator.profile.bankAccountNumber"),bankAccountNumber);
        return this;
    }
    public ManageRegisterEducatorPage uploadW9() throws InterruptedException {
        String filePath = System.getProperty("user.dir")+fs+"src"+fs+"main"+fs+"java"+fs+"com"+fs+"CME"+fs+"TestData"+fs+"CV.pdf";

        // Make the hidden input visible using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('w9').classList.remove('d-none');");

        // Now send the file path
        WebElement uploadInput = driver.findElement(By.id("w9"));
        uploadInput.sendKeys(filePath);
        return this;
    }

    public ManageRegisterEducatorPage enterAddress(String address){
        TestUtils.enterValue(getLocator("generic.profile.address"),address);
        return this;
    }
    public ManageRegisterEducatorPage enterAddress2(String address2){
        TestUtils.enterValue(getLocator("educator.profile.address2"),address2);
        return this;
    }

    public ManageRegisterEducatorPage selectState(String state){
        TestUtils.selectDropdownValue(getLocator("educator.profile.state"), state);
        return this;
    }
    public ManageRegisterEducatorPage enterCity(String city){
        TestUtils.enterValue(getLocator("educator.profile.city"),city);
        return this;
    }
    public ManageRegisterEducatorPage enterZip(String zip){
        TestUtils.enterValue(getLocator("educator.profile.zip"),zip);
        return this;
    }
    public ManageRegisterEducatorPage clickOnSubmitButton(){
        TestUtils.clickElement(getLocator("educator.profile.submitButton"));
        return this;
    }

    public static void selectDate(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        String formattedDate = currentDate.format(formatter);
        clickElement(getLocator("generic.profile.selectDate", formattedDate));
        log.info("Selected Date {}", formattedDate);
    }
    public boolean isEducatorDashboardVisible(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return isElementDisplayed(getLocator("educator.dashboard.username"));
    }
    public boolean isUpdatedEducatorDisplayed(String educatorName) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return TestUtils.findElement(LocatorUtil.getLocator("educator.dashboard.username")).getText().equalsIgnoreCase(educatorName);
    }





}
