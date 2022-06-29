package com.qa.browser.browserimpl;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.qa.browser.IBrowser;

public final class FirefoxBrowserImpl implements IBrowser {

    @Override
    public Browser create() {
        return Playwright.create().firefox().launch(
                new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50)
        );
    }
}
