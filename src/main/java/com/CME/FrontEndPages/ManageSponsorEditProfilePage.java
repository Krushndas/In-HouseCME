package com.CME.FrontEndPages;

import com.CME.AdminPages.AdminManageSponsorPage;
import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestUtils.isElementDisplayed;

public class ManageSponsorEditProfilePage extends BaseTest {

    public ManageSponsorEditProfilePage clickOnEditProfileIcon(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(getLocator("learner.profileIcon"));
        return this;
    }
    public ManageSponsorEditProfilePage clickOnEditProfileOption(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(getLocator("sponsor.editProfile"));
        return this;
    }
    public ManageSponsorEditProfilePage clickOnSaveButton1(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(TestUtils.getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(TestUtils.getLocator("sponsor.editProfile.nextButton1"));
        return this;
    }
    public ManageSponsorEditProfilePage clickOnSaveButton2(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(TestUtils.getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(TestUtils.getLocator("sponsor.editProfile.nextButton2"));
        return this;
    }
    public ManageSponsorEditProfilePage clickOnSaveButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(TestUtils.getLocator("generic.loaderOverlay")));
        TestUtils.clickElement(TestUtils.getLocator("sponsor.editProfile.submit"));
        return this;
    }

    public boolean isSponsorProfileIsUpdated1(String name) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return TestUtils.findElement(LocatorUtil.getLocator("admin.sponsor.email")).getText().equalsIgnoreCase(name);
    }
    public boolean isSponsorProfileIsUpdated(){
        return isElementDisplayed(getLocator("sponsor.profile.updateToastMessage"));
    }

}
