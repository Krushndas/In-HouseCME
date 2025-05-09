package com.CME.FrontEndPages;

import com.core_automation.base.BaseTest;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ManageLearnerDashboardPage extends BaseTest {

    public boolean IsRegisteredLiveProgramDisplay(String programName) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return TestUtils.findElement(LocatorUtil.getLocator("learnerDashboard.liveProgram")).getText().equalsIgnoreCase(programName);
    }

    public boolean IsRegisteredOnDemandProgramDisplay(String programName) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(LocatorUtil.getLocator("generic.loaderOverlay")));
        return TestUtils.findElement(LocatorUtil.getLocator("learnerDashboard.onDemandProgram")).getText().equalsIgnoreCase(programName);
    }


}
