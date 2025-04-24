package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestDataUtil.getValue;
import static com.core_automation.utils.TestUtils.clickElement;
import static com.core_automation.utils.TestUtils.isElementDisplayed;

public class AdminDashboard extends BaseTest {

    public boolean isDashboardVisible(){
        return isElementDisplayed(getLocator("admin.loginToastMessage"));
    }
   public AdminDashboard clickOnMenuIcon(){
       wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("admin.loginToastMessage")));
       clickElement(getLocator("admin.menuIcon"));
       return this;
   }

    public AdminDashboard clickOnModule(String module) {
        clickElement(getLocator("admin.moduleSelect", module));
        return this;
    }
    public AdminDashboard searchLearnerUser(String userEmail){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("admin.loginToastMessage")));
        TestUtils.enterValue(getLocator("generic.search"),userEmail );
        return this;
    }
    public AdminDashboard clickOnSearchIcon(){
        TestUtils.clickElement(getLocator("generic.searchIcon"));
        return this;
    }
    public AdminDashboard clickOnLearnerEditIcon() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("admin.loginToastMessage")));
        //TestUtils.clickElement(getLocator("generic.editIcon"));
        Thread.sleep(2000);
        String dynamicEmail = getValue("learner.firstName") + timestamp + "@yopmail.com";

// 2. Build XPath to locate the Edit button next to that email
        String xpath = "//td[text()='" + dynamicEmail + "']/following-sibling::td/a[@class='action-btn']/span";

// 3. Find the WebElement using the XPath
        WebElement editButton = driver.findElement(By.xpath(xpath));

// 4. Use JavascriptExecutor to click the edit button
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", editButton);

        return this;
    }
    public AdminDashboard clickOnEducatorEditIcon() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("admin.loginToastMessage")));
        //TestUtils.clickElement(getLocator("generic.editIcon"));
        Thread.sleep(2000);
        String dynamicEmail = getValue("educator.firstName") + timestamp + "@yopmail.com";

// 2. Build XPath to locate the Edit button next to that email
        String xpath = "//td[text()='" + dynamicEmail + "']/following-sibling::td/a[@class='action-btn']/span";

// 3. Find the WebElement using the XPath
        WebElement editButton = driver.findElement(By.xpath(xpath));

// 4. Use JavascriptExecutor to click the edit button
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", editButton);

        return this;
    }

}
