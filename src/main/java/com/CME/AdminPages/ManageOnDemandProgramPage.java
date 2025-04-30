package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
    public ManageOnDemandProgramPage selectProgramReevaluateDate(String month){
        TestUtils.clickElement(getLocator("onDemandProgram.dateToReEvaluateProgram"));
        selectMonthReevaluate(month);
        selectDate();
        return this;
    }
    public ManageOnDemandProgramPage selectProgramDate(String month){
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("onDemandProgram.programDate")));
        WebElement element = driver.findElement(By.xpath("//input[@id='program_date']"));
// 2. Cast WebDriver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
// 3. Click using JavaScript
        js.executeScript("arguments[0].click();", element);
       // TestUtils.clickElement(getLocator("onDemandProgram.programDate"));
        selectProgramMonth(month);
        selectDate();
        return this;
    }
    public ManageOnDemandProgramPage selectProgramExpiryDate(String month){
        TestUtils.clickElement(getLocator("onDemandProgram.programExpiryDate"));
        selectProgramExpiryMonth(month);
        selectDate();
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
        TestUtils.clickElement(getLocator("onDemandProgram.addProgramButton"));
        return this;
    }
    public static void selectDate(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        String formattedDate = currentDate.format(formatter);
        clickElement(LocatorUtil.getLocator("programs.reevaluateDate", formattedDate));
        log.info("Selected Date {}", formattedDate);
    }

    public void selectMonthReevaluate(String month){
        TestUtils.selectDropdownValue(getLocator("programs.MonthReevaluate"), month);
    }
    public void selectProgramMonth(String month){
        TestUtils.selectDropdownValue(getLocator("programs.programMonth"), month);
    }
    public void selectProgramExpiryMonth(String month){
        TestUtils.selectDropdownValue(getLocator("programs.programExpiryMonth"), month);
    }

    public void selectFromDropdownOrAutocomplete(String value){
        clickElement(LocatorUtil.getLocator("programs.selectSponsor", value));
        log.info("Selected value {}", value);
    }

}
