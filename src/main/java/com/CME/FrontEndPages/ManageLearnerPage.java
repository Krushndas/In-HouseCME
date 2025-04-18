package com.CME.FrontEndPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestUtils.isElementDisplayed;

public class ManageLearnerPage extends BaseTest {

    public ManageLearnerPage clickOnLearnerMyDashboardButton() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("learner.myDashboard")));
        TestUtils.clickElement(getLocator("learner.myDashboard"));
        return this;
    }
    public ManageLearnerPage clickOnEditProfileButton()
             {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("learner.completeProfileButton")));
        TestUtils.clickElement(getLocator("learner.completeProfileButton"));
        return this;
    }
    public ManageLearnerPage enterMiddleName(String middleName){
        TestUtils.enterValue(getLocator("learner.profile.middleName"),middleName);
        return this;
    }
    public ManageLearnerPage selectDegree(String degree){
        TestUtils.selectDropdownValue(getLocator("learner.profile.degree"), degree);
        return this;
    }

    public ManageLearnerPage clickOnSaveAndContinueButton(){
        TestUtils.clickElement(getLocator("learner.profile.save"));
        return this;
    }
    public ManageLearnerPage selectGroup(String group){
        TestUtils.selectDropdownValue(getLocator("learner.profile.selectGroup"), group);
        return this;
    }
    public ManageLearnerPage clickOnSaveAndUpdateButton(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("learner.profile.update")));
        TestUtils.clickElement(getLocator("learner.profile.update"));
        return this;
    }
    public boolean isLearnerProfileUpdated(){
        return isElementDisplayed(getLocator("learner.profile.updateToastMessage"));
    }
}
