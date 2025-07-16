package org.example.steps;

import org.example.TestBase;
import org.example.tasks.HeaderTask;
import io.cucumber.java.pt.*;

public class HeaderStep extends TestBase {
    HeaderTask header_task = new HeaderTask(getDriver());

    @E("vou a página do carrinho")
    public void goToCart() {
        header_task.goToCart();
    }
}
