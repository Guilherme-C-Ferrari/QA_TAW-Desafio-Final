package org.example.tasks;

import org.example.pages.PlaceOrderModalPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PlaceOrderModalTask extends PlaceOrderModalPage {
    private WebDriver driver;

    public PlaceOrderModalTask(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void fillOutForm(String name, String country, String city, String card, String month, String year) {
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
