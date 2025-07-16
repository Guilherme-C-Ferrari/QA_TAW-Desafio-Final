package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderModalPage {
    @FindBy(id = "name")
    public static WebElement name_input;

    @FindBy(id = "country")
    public static WebElement country_input;

    @FindBy(id = "city")
    public static WebElement city_input;

    @FindBy(id = "card")
    public static WebElement credit_card_input;

    @FindBy(id = "month")
    public static WebElement month_input;

    @FindBy(id = "year")
    public static WebElement year_input;

    @FindBy(xpath = "//button[text()=\"Purchase\"]")
    public static WebElement purchase_button;
}
