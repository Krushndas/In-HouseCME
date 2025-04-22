package com.CME.AdminPages;

import com.CME.FrontEndPages.ManageRegisterEducatorPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.TestUtils.getLocator;

public class AdminManageEducatorPage extends BaseTest {

    public AdminManageEducatorPage clickOnClearFilterButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(getLocator("generic.clearFilterButton"));
        return this;
    }
    public AdminManageEducatorPage clickOnUpdateButton(){
        TestUtils.clickElement(getLocator("generic.saveButton"));
        return this;
    }
    public boolean isUpdatedLearnerDisplayed(String learnerName) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return TestUtils.findElement(LocatorUtil.getLocator("admin.educator.email")).getText().equalsIgnoreCase(learnerName);
    }
    public AdminManageEducatorPage enterWorkEmail(String workEmail) {
        TestUtils.enterValue(LocatorUtil.getLocator("generic.email"), workEmail);
        return this;
    }
    public AdminManageEducatorPage clickOnEntityButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtil.getLocator("educator.profile.entityButton")));
        WebElement element = driver.findElement(By.xpath("//label[text()='Educator']"));
// 2. Cast WebDriver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
// 3. Click using JavaScript
        js.executeScript("arguments[0].click();", element);
        return this;
    }
    public AdminManageEducatorPage clickOnSubmitButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtil.getLocator("generic.saveButton")));
        WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
// 2. Cast WebDriver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
// 3. Click using JavaScript
        js.executeScript("arguments[0].click();", element);

        return this;
    }
}
