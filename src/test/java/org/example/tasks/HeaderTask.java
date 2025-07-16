package org.example.tasks;

import org.example.pages.HeaderPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HeaderTask extends HeaderPage {
    private WebDriver driver;

    public HeaderTask(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void goToHome () {
        home_link.click();
    }

    public void goToContact() {
        contact_link.click();
    }

    public void goToAboutUs() {
        about_link.click();
    }

    public void goToCart() {
        cart_link.click();
    }

    public void goToLogin() {
        login_link.click();
    }

    public void goToSignUp() {
        signup_link.click();
    }
}
