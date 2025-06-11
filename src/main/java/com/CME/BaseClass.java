package com.CME;

import com.core_automation.base.BaseTest;
import com.core_automation.config.ConfigReader;
import com.core_automation.utils.LocatorUtil;
import com.core_automation.utils.TestDataUtil;

import static com.core_automation.base.BaseTest.fs;

public class BaseClass {
    public static void setup(){
        BaseTest.setUp("web", "src"+fs+"main"+fs+"resources"+fs+"config.yml", false);
        ConfigReader.setConfig("src"+fs+"main"+fs+"resources"+fs+"config.yml");
        new TestDataUtil("src"+fs+"main"+fs+"java"+fs+"com"+fs+"CME"+fs+"TestData"+fs+"data.json");
        new LocatorUtil("src"+fs+"test"+fs+"resources"+fs+"ObjectRepositories"+fs+"locators.properties");
    }
}


