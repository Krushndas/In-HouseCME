package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.TestDataUtil.getValue;
import static com.core_automation.utils.TestUtils.getLocator;

public class ManageLiveProgramPage extends BaseTest {

    public ManageLiveProgramPage enterZoomURL(String URL){
        TestUtils.enterValue(getLocator("liveProgram.meetingURL"), URL);
        return this;
    }
    public ManageLiveProgramPage clickOnAddLiveProgramButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtil.getLocator("liveProgram.saveButton")));
        WebElement element = driver.findElement(By.xpath("//button[text()='Add Program']"));
// 2. Cast WebDriver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
// 3. Click using JavaScript
        js.executeScript("arguments[0].click();", element);
        return this;
    }

    public ManageLiveProgramPage enterSponsorAmount(String amount){
        TestUtils.enterValue(getLocator("liveProgram.sponsorAmount"), amount);
        return this;
    }

    public ManageLiveProgramPage clickOnEditLiveProgramButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("admin.loginToastMessage")));
        //TestUtils.clickElement(getLocator("generic.editIcon"));
        String dynamicEmail = getValue("onDemandProgram.liveProgramName") + timestamp;

// 2. Build XPath to locate the Edit button next to that email
        String xpath = "//td[text()='" + dynamicEmail + "']/following-sibling::td//a[3][@class='action-btn']/span";

// 3. Find the WebElement using the XPath
        WebElement editButton = driver.findElement(By.xpath(xpath));

// 4. Use JavascriptExecutor to click the edit button
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", editButton);

        return this;
    }

    public ManageLiveProgramPage updateProgramStatus(String status){
        TestUtils.selectDropdownValue(getLocator("liveProgram.programStatus"), status);
         return this;
    }

    public ManageLiveProgramPage clickOnUpdateProgramButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtil.getLocator("liveProgram.programEditButton")));
        WebElement element = driver.findElement(By.xpath("//button[text()='Update Program']"));
// 2. Cast WebDriver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
// 3. Click using JavaScript
        js.executeScript("arguments[0].click();", element);
        return this;
    }

      public ManageLiveProgramPage disableWaitingRoom(){
        TestUtils.clickElement(getLocator("liveProgram.waitingRoom"));
        return this;
      }

}
