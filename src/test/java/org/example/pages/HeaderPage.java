package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
    private WebDriver driver;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()=\"Home\"]")
    public WebElement home_link;

    @FindBy(xpath = "//a[text()=\"Contact\"]")
    public WebElement contact_link;

    @FindBy(xpath = "//a[text()=\"About Us\"]")
    public WebElement about_link;

    @FindBy(xpath = "//a[text()=\"Cart\"]")
    public WebElement cart_link;

    @FindBy(xpath = "//a[text()=\"Log In\"]")
    public WebElement login_link;

    @FindBy(xpath = "//a[text()=\"Sign Up\"]")
    public WebElement signup_link;
}
