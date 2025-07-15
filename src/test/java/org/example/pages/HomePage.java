package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "//href[text(=\"Monitors\"]")
    public static WebElement monitors_category;

    @FindBy(className = "hrefch")
    public static WebElement purchasable_item;
}