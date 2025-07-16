package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
    @FindBy(xpath = "//href[text()=\"Add to cart\"]")
    public static WebElement add_to_cart_button;
}
