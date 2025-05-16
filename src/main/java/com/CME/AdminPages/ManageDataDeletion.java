package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestUtils.clickElement;

public class ManageDataDeletion extends BaseTest {

    public ManageDataDeletion clickOnDeleteButton(String name) throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("admin.loginToastMessage")));
        //TestUtils.clickElement(getLocator("generic.editIcon"));
        Thread.sleep(2000);
        //  String dynamicEmail = getValue("learner.firstName") + timestamp + "@yopmail.com";

// 2. Build XPath to locate the Edit button next to that email
        String xpath = "//td[text()='" + name + "']/following-sibling::td/form[@class='frm-confirm-delete']/button/span[@class='icon-delete']";

// 3. Find the WebElement using the XPath
        WebElement deleteButton = driver.findElement(By.xpath(xpath));

// 4. Use JavascriptExecutor to click the edit button
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", deleteButton);

        return this;
    }
    public ManageDataDeletion clickOnSponsorDeleteButton(String name) throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("admin.loginToastMessage")));
        //TestUtils.clickElement(getLocator("generic.editIcon"));
        Thread.sleep(2000);
        //  String dynamicEmail = getValue("learner.firstName") + timestamp + "@yopmail.com";

// 2. Build XPath to locate the Edit button next to that email
        String xpath = "//a[text()='" + name + "']/ancestor::tr//span[contains(@class, 'icon-delete')]";

// 3. Find the WebElement using the XPath
        WebElement deleteButton = driver.findElement(By.xpath(xpath));

// 4. Use JavascriptExecutor to click the edit button
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", deleteButton);

        return this;
    }
    public ManageDataDeletion clickOnGroupDeleteButton(String name) throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("admin.loginToastMessage")));
        //TestUtils.clickElement(getLocator("generic.editIcon"));
        Thread.sleep(2000);
        //  String dynamicEmail = getValue("learner.firstName") + timestamp + "@yopmail.com";

// 2. Build XPath to locate the Edit button next to that email
        String xpath = "//td[text()='" + name + "']/following-sibling::td//a[@class='action-btn show_confirm']/span[@class='icon-delete']";

// 3. Find the WebElement using the XPath
        WebElement deleteButton = driver.findElement(By.xpath(xpath));

// 4. Use JavascriptExecutor to click the edit button
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", deleteButton);

        return this;
    }


    public ManageDataDeletion clickOnDeleteOption(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("generic.deletePopup")));
        TestUtils.clickElement(getLocator("generic.deletePopup"));
        return this;
    }

    public boolean isRecordIsDeleted(String deleteMessage) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("generic.deleteMessage")));
        return TestUtils.findElement(LocatorUtil.getLocator("generic.deleteMessage")).getText().equalsIgnoreCase(deleteMessage);
    }
    public ManageDataDeletion clickAdminOnMenuIcon(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.deleteMessage")));
        clickElement(getLocator("admin.menuIcon"));
        return this;
    }
}
