package com.CME.AdminPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.TestUtils;

import static com.core_automation.utils.TestUtils.getLocator;

public class ManageLiveProgramPage extends BaseTest {

    public void enterZoomURL(String URL){
        TestUtils.enterValue(getLocator("liveProgram.meetingURL"), URL);
    }
}
