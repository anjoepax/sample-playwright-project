package com.qa.browser.pages;

public final class HomePage extends BasePage {

    public HomePage navigateTo(String url) {
        launchApplication(url);
        return this;
    }

    public StorePage clickStoreMenu(String menu) {
        String element = String.format("text='%s'", menu);
        clickElement(element);
        return new StorePage();
    }

    public void clickMenu(String menu) {
        String element = String
                .format("xpath=//div[@id='ast-desktop-header']//ul//a[text()='%s']", menu);
        clickElement(element);
    }
}
