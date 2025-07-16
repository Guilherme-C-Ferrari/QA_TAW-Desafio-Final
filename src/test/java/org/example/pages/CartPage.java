package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    @FindBy(xpath = "//button[text()=\"Place Order\"]")
    public static WebElement place_order_button;
}
