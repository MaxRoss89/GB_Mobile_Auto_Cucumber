package ru.gb.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MainPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }

    public By FormsButton() {
        return MobileBy.AccessibilityId("Forms");
    }

    public By SwipeButton() {
        return MobileBy.AccessibilityId("Swipe");
    }

}
