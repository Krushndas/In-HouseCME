package com.CME.FrontEndPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.TestUtils;

import static com.core_automation.utils.LocatorUtil.getLocator;

public class ManageUsersChangePasswordPage extends BaseTest {

    public ManageUsersChangePasswordPage enterCurrentPassword(String password){
        TestUtils.enterValue(getLocator("generic.currentPassword"), password);
        return this;
    }
    public ManageUsersChangePasswordPage enterNewPassword(String NewPassword){
        TestUtils.enterValue(getLocator("generic.newPassword"), NewPassword);
        return this;
    }
    public ManageUsersChangePasswordPage enterConfirmPassword(String confirmPassword){
        TestUtils.enterValue(getLocator("generic.confirmPassword"), confirmPassword);
        return this;
    }

    public ManageUsersChangePasswordPage clickOnSaveNewPasswordButton(){
        TestUtils.clickElement(getLocator("generic.saveNewPasswordButton"));
        return this;
    }

    public boolean isPasswordUpdated(){
        return TestUtils.isElementDisplayed(getLocator("password.toastMessage"));
    }

}
