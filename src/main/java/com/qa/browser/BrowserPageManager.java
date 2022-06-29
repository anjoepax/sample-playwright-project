package com.qa.browser;

import com.microsoft.playwright.Page;

public final class BrowserPageManager {

    private BrowserPageManager(){}

    private static final ThreadLocal<Page> pageThread = new ThreadLocal<>();

    public static synchronized void setPage(Page page) {
        pageThread.set(page);
    }

    public static synchronized Page getPage() {
        return pageThread.get();
    }

    public static synchronized void unloadPage() {
        pageThread.remove();
    }
}
