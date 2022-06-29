package com.qa.browser.factory;

import com.microsoft.playwright.Browser;
import com.qa.browser.browserimpl.ChromiumBrowserImpl;
import com.qa.browser.browserimpl.FirefoxBrowserImpl;
import com.qa.browser.browserimpl.WebkitBrowserImpl;
import com.qa.enums.BrowserType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserFactory {

    private BrowserFactory(){}

    private static final Map<BrowserType, Supplier<Browser>> MAP = new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROMIUM, new ChromiumBrowserImpl()::create);
        MAP.put(BrowserType.FIREFOX, new FirefoxBrowserImpl()::create);
        MAP.put(BrowserType.WEBKIT, new WebkitBrowserImpl()::create);
    }

    public static Browser get(BrowserType browserType) {
        return MAP.get(browserType).get();
    }
}
