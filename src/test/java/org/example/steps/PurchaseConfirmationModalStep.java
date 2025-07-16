package org.example.steps;

import org.example.TestBase;
import org.example.tasks.PurchaseConfirmationModalTask;
import io.cucumber.java.pt.*;

public class PurchaseConfirmationModalStep extends TestBase {
    PurchaseConfirmationModalTask purchase_confirmation_modal_task = new PurchaseConfirmationModalTask(getDriver());

    @Entao("devo ver mensagem de confirmação de compra na tela escrito \"Thank you for your purchase!\"")
    public void validateModal() {
        purchase_confirmation_modal_task.validateModal();
    }

    @E("clicar em \"OK\"")
    public void pressOkButton() {
        purchase_confirmation_modal_task.pressOkButton();
    }
}
