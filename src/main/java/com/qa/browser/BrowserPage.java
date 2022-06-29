package com.qa.browser;

import com.qa.browser.factory.BrowserFactory;
import com.qa.enums.BrowserType;
import lombok.SneakyThrows;

import java.util.Objects;

public final class BrowserPage {

    private BrowserPage(){}

    public static void initializePage() {
        if(Objects.isNull(BrowserPageManager.getPage())) {
            BrowserPageManager.setPage(BrowserFactory.get(BrowserType.CHROMIUM).newPage());
            BrowserPageManager.getPage().setDefaultTimeout(30000);
        }
    }

    @SneakyThrows
    public static void teardownPage() {
        if(Objects.nonNull(BrowserPageManager.getPage())) {
           BrowserPageManager.unloadPage();
           Thread.sleep(3000);
        }
    }
}
