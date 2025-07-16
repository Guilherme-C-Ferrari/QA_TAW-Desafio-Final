package org.example.steps;

import org.example.TestBase;
import org.example.tasks.CartTask;
import io.cucumber.java.pt.*;

public class CartStep extends TestBase {
    CartTask cart_task = new CartTask(getDriver());

    @E("clico no botão de fazer pedido")
    public void placeOrder() {
        cart_task.placeOrder();
    }
}
