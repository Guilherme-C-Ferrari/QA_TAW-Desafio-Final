package org.example.steps;

import org.example.TestBase;
import org.example.tasks.ProductTask;
import io.cucumber.java.pt.*;

public class ProductStep extends TestBase {
    ProductTask product_task = new ProductTask(getDriver());

    @E("adiciono o monitor ao carrinho")
    public void addProductToCart(){
        product_task.addProductToCart();
    }
}
