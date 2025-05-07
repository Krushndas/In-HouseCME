package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
}
