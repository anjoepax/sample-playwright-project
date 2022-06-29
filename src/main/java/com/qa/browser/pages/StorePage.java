package com.qa.browser.pages;

public final class StorePage extends BasePage {

    public StorePage enterSearchKeyword(String keyword) {
        String productSearchBox = "#woocommerce-product-search-field-0";
        setText(productSearchBox, keyword);
        return this;
    }

    public StorePage clickSearchButton() {
        String searchButton = "button[value='Search']";
        clickElement(searchButton);
        return this;
    }
}
