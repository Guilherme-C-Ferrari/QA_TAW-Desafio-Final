package org.example.tasks;

import org.example.pages.CartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CartTask extends CartPage {
    private WebDriver driver;

    public CartTask(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void placeOrder() {
        place_order_button.click();
    }
}