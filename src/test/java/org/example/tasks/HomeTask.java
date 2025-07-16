package org.example.tasks;

import org.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomeTask extends HomePage {
    private WebDriver driver;

    public HomeTask(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void accessMonitorsCategory() {
        monitors_category.click();
    }

    public void openProductPage() {
        purchasable_item.click();
    }
}