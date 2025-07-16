package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "//a[text()=\"Monitors\"]")
    public static WebElement monitors_category;

    @FindBy(xpath = "//a[text()=\"Apple monitor 24\"]")
    public static WebElement purchasable_item;
}