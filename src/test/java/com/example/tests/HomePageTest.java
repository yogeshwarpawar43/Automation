package com.example.tests;

import com.example.base.BaseTest;
import com.example.pages.HomePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends BaseTest {

    @Test
    void shouldOpenFlipkartHomePage() {
        HomePage homePage = new HomePage(page)
                .openFlipkart();

        assertTrue(homePage.getCurrentUrl().contains("flipkart.com"));
        assertTrue(homePage.getPageTitle().toLowerCase().contains("flipkart")
                || homePage.getPageTitle().toLowerCase().contains("online shopping"));
    }
}
