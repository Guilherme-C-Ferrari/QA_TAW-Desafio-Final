package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseConfirmationModalPage {
    @FindBy(css = "div.sweet-alert.showSweetAlert.visible")
    public WebElement modal;

    @FindBy(xpath = "//h2[text()='Thank you for your purchase!']")
    public WebElement title;

    @FindBy(css = "div.sweet-alert.showSweetAlert.visible p")
    public WebElement body_text;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement ok_button;
}