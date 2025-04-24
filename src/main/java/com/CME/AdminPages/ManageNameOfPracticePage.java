package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ManageNameOfPracticePage extends BaseTest {

    public boolean isLearnerPracticeNameIsDisplayed(String learnerName) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return TestUtils.findElement(LocatorUtil.getLocator("admin.nameOfPractice")).getText().equalsIgnoreCase(learnerName);
    }


}
