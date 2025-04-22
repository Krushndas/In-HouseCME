package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.TestUtils.getLocator;

public class AdminEditLearnerPage extends BaseTest {

    public AdminEditLearnerPage clickOnClearFilterButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(getLocator("generic.clearFilterButton"));
        return this;
    }
    public AdminEditLearnerPage clickOnUpdateButton(){
        TestUtils.clickElement(getLocator("generic.saveButton"));
        return this;
    }
    public boolean isUpdatedLearnerDisplayed(String learnerName) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return TestUtils.findElement(LocatorUtil.getLocator("admin.learner.email")).getText().equalsIgnoreCase(learnerName);
    }





}
