package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.core_automation.utils.TestUtils.getLocator;

public class AdminManegeGroupPage extends BaseTest {

    public AdminManegeGroupPage clickOnAddGroupButton(){
        TestUtils.clickElement(getLocator("admin.group.AddGroupButton"));
        return this;
    }
    public AdminManegeGroupPage enterGroupName(String groupName){
        TestUtils.enterValue(getLocator("admin.group.groupName"),groupName );
        return this;
    }
    public AdminManegeGroupPage selectGroupType(String type){
        TestUtils.selectDropdownValue(getLocator("admin.group.type"),type );
        return this;
    }
    public AdminManegeGroupPage enterStreetAddress(String streetAddress){
        TestUtils.enterValue(getLocator("admin.group.streetAddress"),streetAddress );
        return this;
    }
    public AdminManegeGroupPage selectState(String state){
        TestUtils.selectDropdownValue(getLocator("admin.group.state"),state );
        return this;
    }
    public AdminManegeGroupPage enterCity(String city){
        TestUtils.enterValue(getLocator("admin.group.city"),city );
        return this;
    }
    public AdminManegeGroupPage enterZip(String zip){
        TestUtils.enterValue(getLocator("admin.group.zip"),zip );
        return this;
    }
    public AdminManegeGroupPage enterPhone(String phone){
        TestUtils.enterValue(getLocator("admin.group.phone"),phone );
        return this;
    }
    public AdminManegeGroupPage enterFax(String fax){
        TestUtils.enterValue(getLocator("admin.group.fax"),fax );
        return this;
    }
    public AdminManegeGroupPage enterNumberOfDoctors(String numberOfDoctors){
        TestUtils.enterValue(getLocator("admin.group.numberOfDoctors"),numberOfDoctors );
        return this;
    }

    public boolean isAddedGroupNameIsDisplayed(String groupName) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return TestUtils.findElement(LocatorUtil.getLocator("admin.groupName")).getText().equalsIgnoreCase(groupName);
    }


}
