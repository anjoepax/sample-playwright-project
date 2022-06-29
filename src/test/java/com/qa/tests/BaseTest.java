package com.qa.tests;

import com.qa.browser.BrowserPage;
import org.testng.annotations.*;

public class BaseTest {

    protected BaseTest(){}

    @BeforeSuite(enabled = false)
    public void beforeSuiteForFirstTimeRun() {
        BrowserPage.initializePage();
    }

    @BeforeMethod
    public void setUp() {
        BrowserPage.initializePage();
    }

    @AfterMethod
    public void tearDown() {
        BrowserPage.teardownPage();
    }
}
