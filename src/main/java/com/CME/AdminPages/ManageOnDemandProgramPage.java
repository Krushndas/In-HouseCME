package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestUtils.*;
import static com.core_automation.utils.TestUtils.enterValue;

public class ManageOnDemandProgramPage extends BaseTest {

    public ManageOnDemandProgramPage clickOnAddNewProgramButton(){
        TestUtils.clickElement(getLocator("onDemandProgram.addNewProgram"));
        return this;
    }

    public ManageOnDemandProgramPage enterProgramName(String name){
        TestUtils.enterValue(getLocator("onDemandProgram.programName"), name);
        return this;
    }

    public ManageOnDemandProgramPage SelectCMEStatus(String status){
        TestUtils.selectDropdownValue(getLocator("onDemandProgram.CMEStatus"), status);
        return this;
    }

    public ManageOnDemandProgramPage enterCMECredit(String cmeCredit){
        TestUtils.enterValue(getLocator("onDemandProgram.CMECredit"), cmeCredit);
        return this;
    }
    public ManageOnDemandProgramPage SelectCMEForum(String forum){
        TestUtils.selectDropdownValue(getLocator("onDemandProgram.forum"), forum);
        return this;
    }
    public ManageOnDemandProgramPage enterMeetingID(String meetingID){
        TestUtils.enterValue(getLocator("onDemandProgram.meetingID"), meetingID);
        return this;
    }
    public ManageOnDemandProgramPage enterProgramLength(String programLength){
        TestUtils.enterValue(getLocator("onDemandProgram.programLength"), programLength);
        return this;
    }
    public ManageOnDemandProgramPage enterProgramCost(String cost){
        TestUtils.enterValue(getLocator("onDemandProgram.cost"), cost);
        return this;
    }
    public ManageOnDemandProgramPage selectSponsor(String sponsor) {
        isElementDisplayed(getLocator("onDemandProgram.sponsor"));
        enterValue(getLocator("onDemandProgram.sponsor"), sponsor);
        selectFromDropdownOrAutocomplete(sponsor);
        return this;
    }
    public ManageOnDemandProgramPage selectEducator(String educator) {
        isElementDisplayed(getLocator("onDemandProgram.educator"));
        enterValue(getLocator("onDemandProgram.educator"), educator);
        selectFromDropdownOrAutocomplete(educator);
        return this;
    }
    public ManageOnDemandProgramPage selectProgramReevaluateDate(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("onDemandProgram.dateToReEvaluateProgram")));
        TestUtils.clickElement(getLocator("onDemandProgram.dateToReEvaluateProgram"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("program.programReevaluateDate")));
        TestUtils.clickElement(getLocator("program.programReevaluateDate"));
        return this;
    }
    public ManageOnDemandProgramPage selectProgramDate(String time) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("onDemandProgram.programDate")));
        WebElement element = driver.findElement(By.xpath("//input[@id='program_date']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
        Thread.sleep(300); // optional, helps visually smooth out the scroll
        js.executeScript("arguments[0].click();", element);

        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("program.time")));
        TestUtils.enterValue(getLocator("program.time"), time);

        return this;

    }
    public ManageOnDemandProgramPage selectProgramExpiryDate(String time) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("onDemandProgram.programExpiryDate")));
        TestUtils.clickElement(getLocator("onDemandProgram.programExpiryDate"));
        Thread.sleep(2000);
        TestUtils.clickElement(getLocator("onDemandProgram.programExpiryDate"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("program.programExpiryDate")));
        TestUtils.clickElement(getLocator("program.programExpiryDate"));
        //Time enter
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("program.expiryTime")));
        TestUtils.enterValue(getLocator("program.expiryTime"), time);
        return this;

    }
    public ManageOnDemandProgramPage SelectTimeZone(String timeZone){
        TestUtils.selectDropdownValue(getLocator("onDemandProgram.timeZone"), timeZone);
        return this;
    }
    public ManageOnDemandProgramPage enterDescription(String description){
        TestUtils.enterValue(getLocator("onDemandProgram.description"), description);
        return this;
    }
    public ManageOnDemandProgramPage clickOnAddProgramButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("onDemandProgram.addProgramButton")));
        WebElement element = driver.findElement(By.xpath("(//button[text()='Add Program'])[2]"));
// 2. Cast WebDriver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
// 3. Click using JavaScript
        js.executeScript("arguments[0].click();", element);
        return this;
    }

    public void selectFromDropdownOrAutocomplete(String value){
        clickElement(LocatorUtil.getLocator("program.selectSponsor", value));
        log.info("Selected value {}", value);
    }

    public boolean IsAddedProgramIsDisplayed(String programName) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return TestUtils.findElement(LocatorUtil.getLocator("onDemandProgram.programNameVerify")).getText().equalsIgnoreCase(programName);
    }


}
