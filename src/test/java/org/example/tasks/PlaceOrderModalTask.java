package org.example.tasks;

import org.example.pages.PlaceOrderModalPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaceOrderModalTask extends PlaceOrderModalPage {
    private WebDriver driver;

    public PlaceOrderModalTask(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void fillOutForm(String name, String country, String city, String card, String month, String year) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(name_input));
        name_input.sendKeys(name);
        country_input.sendKeys(country);
        city_input.sendKeys(city);
        credit_card_input.sendKeys(card);
        month_input.sendKeys(month);
        year_input.sendKeys(year);
    }

    public void pressPurchaseButton() {
        purchase_button.click();
    }
}
