package org.example.steps;


import org.example.TestBase;
import org.example.tasks.PlaceOrderModalTask;
import io.cucumber.java.pt.*;
import io.cucumber.datatable.DataTable;
import java.util.Map;

public class PlaceOrderModalStep extends TestBase {
    PlaceOrderModalTask place_order_modal_task = new PlaceOrderModalTask(getDriver());

    @E("finalizo o pedido preenchendo com os dados abaixo:")
    public void finishPurchase(DataTable table) {
        Map<String, String> data = table.asMap();
        place_order_modal_task.fillOutForm(
                data.get("Nome"),
                data.get("País"),
                data.get("Cidade"),
                data.get("Cartão"),
                data.get("Mês"),
                data.get("Ano")
        );
        place_order_modal_task.pressPurchaseButton();
    }
}
