package com.CME.AdminPages;

import com.core_automation.base.BaseTest;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestUtils.isElementDisplayed;

public class AdminDashboard extends BaseTest {

    public boolean isDashboardVisible(){
        return isElementDisplayed(getLocator("admin.loginToastMessage"));
    }
}
