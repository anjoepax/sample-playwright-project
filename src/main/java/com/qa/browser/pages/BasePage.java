package com.qa.browser.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import com.qa.browser.BrowserPageManager;

public class BasePage {

    protected BasePage(){}

    private Locator findElement(String element) {
        return BrowserPageManager.getPage().locator(element);
    }

    public void clickElement(String element) {
        findElement(element).click();
    }

    public void setText(String element, String text) {
        BrowserPageManager.getPage().fill(element, text);
    }

    public void launchApplication(String url) {
        BrowserPageManager.getPage().navigate(url);
    }

    public String getElementText(String element) {
        return findElement(element).textContent();
    }

    public void waitForElement(String element, WaitForSelectorState waitType) {
        BrowserPageManager.getPage()
                .waitForSelector(element, new Page.WaitForSelectorOptions()
                        .setState(waitType));
    }
}
