package com.example.pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

public class HomePage {
    private final Page page;

    public HomePage(Page page) {
        this.page = page;
    }

    public HomePage openFlipkart() {
        page.navigate("https://www.flipkart.com");
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
        return this;
    }

    public String getPageTitle() {
        return page.title();
    }

    public String getCurrentUrl() {
        return page.url();
    }
}
