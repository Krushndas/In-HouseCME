package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.TestUtils.getLocator;
import static com.core_automation.utils.TestUtils.isElementDisplayed;

public class ManageNeedSomeHelpPage extends BaseTest {

    public ManageNeedSomeHelpPage clickOnNeedHelpSomeButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("educator.loginModal")));
        TestUtils.clickElement(getLocator("generic.needSomeHelp"));
        return this;
    }
    public ManageNeedSomeHelpPage enterComment(String comment){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        TestUtils.enterValue(getLocator("generic.needSomeHelpComment"), comment);
        return this;
    }
    public ManageNeedSomeHelpPage clickOnSubmitButton(){
        TestUtils.clickElement(getLocator("learner.helpRequest.submitButton"));
        return this;
    }
    public boolean isFormSubmitted(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return isElementDisplayed(getLocator("learner.needSomeHelp.formBlock"));
    }
    public boolean isUserEmailIsDisplay(String email) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return TestUtils.findElement(LocatorUtil.getLocator("admin.groupName")).getText().equalsIgnoreCase(email);
    }
    public boolean isNeedSomeRequestDisplay(String request) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return TestUtils.findElement(LocatorUtil.getLocator("admin.needSomeHelpRequest")).getText().equalsIgnoreCase(request);
    }



}
