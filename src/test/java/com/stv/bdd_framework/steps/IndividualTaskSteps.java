package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.Given;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL_USA;

public class IndividualTaskSteps extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    @Given("start page loaded")
    public void startPageLoaded() {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().get(START_URL_USA);
        mainFactoryPage.tryClickOnTrustButton();
        Assert.assertEquals(mainFactoryPage.indexPageLoaded(), true);
    }

}
