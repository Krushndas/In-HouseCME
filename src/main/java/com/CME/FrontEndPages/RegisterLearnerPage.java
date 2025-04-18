package com.CME.FrontEndPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.LocatorUtil.getLocator;
import static com.core_automation.utils.TestUtils.isElementDisplayed;

public class RegisterLearnerPage extends BaseTest {

    public RegisterLearnerPage enterFirstName(String firstName){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(getLocator("generic.loaderOverlay")));
        TestUtils.enterValue(getLocator("learner.firstName"),firstName);
        return this;
    }
    public RegisterLearnerPage enterLastName(String lastName){
        TestUtils.enterValue(getLocator("learner.lastName"),lastName);
        return this;
    }
    public RegisterLearnerPage enterWorkEmail(String email){
        TestUtils.enterValue(getLocator("learner.email"),email);
        return this;
    }
    public RegisterLearnerPage enterMobileNumber(String mobileNumber){
        TestUtils.enterValue(getLocator("lerner.mobileNumber"),mobileNumber);
        return this;
    }
    public RegisterLearnerPage enterPassword(String Password){
        TestUtils.enterValue(getLocator("learner.password"),Password);
        return this;
    }
    public void clickOnLearnerRegisterButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator("learner.registerButton")));
        TestUtils.clickElement(getLocator("learner.clickEvent"));
        TestUtils.clickElement(getLocator("learner.registerButton"));
    }
    public boolean isLearnerDashboardVisible(){
        return isElementDisplayed(getLocator("learner.loginToastMessage"));
    }



}
