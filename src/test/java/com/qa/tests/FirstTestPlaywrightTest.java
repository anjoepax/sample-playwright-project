package com.qa.tests;

import com.qa.browser.pages.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public final class FirstTestPlaywrightTest extends BaseTest {

    private FirstTestPlaywrightTest(){}

    @Test(dataProvider = "menu")
    public void shouldNavigateSuccessfully(String menuName) {
        HomePage homePage = new HomePage();
        homePage.navigateTo("https://askomdch.com")
                .clickMenu(menuName);
    }

    @DataProvider(parallel = true)
    public Object[][] menu() {
        return new Object[][] {
                {"Store"},
                {"Men"},
                {"Account"}
        };
    }
}
