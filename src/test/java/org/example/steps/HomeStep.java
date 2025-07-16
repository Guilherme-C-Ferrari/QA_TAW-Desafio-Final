package org.example.steps;

import org.example.TestBase;
import org.example.tasks.HomeTask;
import io.cucumber.java.pt.*;


public class HomeStep extends TestBase {
    HomeTask home_task = new HomeTask(getDriver());

    @Dado("que estou na página inicial")
    public void validateHomePage(){

    }

    @Quando("navego até a categoria Monitores")
    public void accessMonitorsCategory() {
        home_task.accessMonitorsCategory();
    }

    @E("selecione um monitor para compra")
    public void openProductPage() {
        home_task.openProductPage();
    }
}