package com.CME.FrontEndPages;

import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import com.core_automation.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestDataUtil.getValue;

public class ManageRegisterProgramPage extends BaseTest{

    public ManageRegisterProgramPage clickOnRegisterLiveProgramButton() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));

        String dynamicProgram = getValue("onDemandProgram.liveProgramDescription") + timestamp;

// 2. Build XPath to locate the Edit button next to that email
        String xpath = "//p[text()='" + dynamicProgram + "']/following-sibling::div[@class='btn-block']/a/span[@class='icon-right-arrow'][2]";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
// 3. Find the WebElement using the XPath
        WebElement editButton = driver.findElement(By.xpath(xpath));

// 4. Use JavascriptExecutor to click the edit button
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", editButton);

        return this;
    }
    public ManageRegisterProgramPage clickOnRegisterOnDemandProgramButton() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));

        String dynamicProgram = getValue("onDemandProgram.description") + timestamp;

// 2. Build XPath to locate the Edit button next to that email
        String xpath = "//p[text()='" + dynamicProgram + "']/following-sibling::div[@class='btn-block']/a/span[@class='icon-right-arrow'][2]";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
// 3. Find the WebElement using the XPath
        WebElement editButton = driver.findElement(By.xpath(xpath));

// 4. Use JavascriptExecutor to click the edit button
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", editButton);

        return this;
    }

    public ManageRegisterProgramPage clickOnContinewBrowsingButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("programList.continueBrowsing")));
        TestUtils.clickElement(getLocator("programList.continueBrowsing"));
        return this;
    }
    public ManageRegisterProgramPage clickOnViewMyProgramButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("programList.viewMyProgramButton")));
        TestUtils.clickElement(getLocator("programList.viewMyProgramButton"));
        return this;
    }

}
