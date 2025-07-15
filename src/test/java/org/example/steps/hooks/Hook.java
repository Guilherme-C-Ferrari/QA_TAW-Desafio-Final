package org.example.steps.hooks;

import io.cucumber.java.Before;
import org.junit.After;
import static org.example.TestBase.*;

public class Hook {
    @Before
    public void setUp() {
        String path = "https://www.demoblaze.com/index.html";
        getDriver().get(path);
    }

    @After
    public void finish() {
        quitDriver();
    }
}
