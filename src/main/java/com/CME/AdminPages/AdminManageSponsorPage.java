package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.TestUtils.getLocator;

public class AdminManageSponsorPage extends BaseTest {

    public void clickOnAddSponsorButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(getLocator("sponsor.addButton"));
    }
    public AdminManageSponsorPage searchSponsorUser(String userEmail){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        TestUtils.enterValue(LocatorUtil.getLocator("generic.search"),userEmail );
        return this;
    }
    public AdminManageSponsorPage clickOnSearchIcon(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(LocatorUtil.getLocator("generic.searchIcon"));
        return this;
    }
    public AdminManageSponsorPage clickOnClearFilterButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(getLocator("generic.clearFilterButton"));
        return this;
    }

    public boolean isAddedSponsorDisplayed(String learnerName) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return TestUtils.findElement(LocatorUtil.getLocator("admin.sponsor.email")).getText().equalsIgnoreCase(learnerName);
    }


}
