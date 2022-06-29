package com.qa.browser.browserimpl;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.qa.browser.IBrowser;

public final class WebkitBrowserImpl implements IBrowser {

    @Override
    public Browser create() {
        return Playwright.create()
                .webkit()
                .launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
    }
}
