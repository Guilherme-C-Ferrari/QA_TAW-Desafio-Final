package org.example.steps;

import org.example.TestBase;
import org.example.tasks.HomeTask;

public class HomeStep extends TestBase {
    HomeTask homeTask = new HomeTask(getDriver());
}