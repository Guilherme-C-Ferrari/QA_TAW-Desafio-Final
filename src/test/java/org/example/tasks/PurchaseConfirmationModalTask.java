package org.example.tasks;

import org.example.pages.PurchaseConfirmationModalPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PurchaseConfirmationModalTask extends PurchaseConfirmationModalPage {
    private WebDriver driver;

    public PurchaseConfirmationModalTask(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void validateModal() {
        assertTrue("O modal de confirmação não está visível!", modal.isDisplayed());

        String t = title.getText();
        assertEquals("O título do modal está incorreto.", "Thank you for your purchase!", t);
    }

    public void pressOkButton() {
        ok_button.click();
    }
}
