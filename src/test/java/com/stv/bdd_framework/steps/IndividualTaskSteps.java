package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.GlovesPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL_USA;

public class IndividualTaskSteps extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    GlovesPage glovesPage = new GlovesPage();

    @Given("IndexPage loaded")
    public void indexPageLoaded() {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().get(START_URL_USA);
        mainFactoryPage.tryClickOnTrustButton();
        Assert.assertEquals(mainFactoryPage.indexPageLoaded(), true);
    }

    @And("go to the menu item Cycle->Apparel->Gloves")
    public void goToTheMenuItemCycleApparelGloves() {
        Actions action = new Actions(getDriver());
        action.moveToElement(mainFactoryPage.getMenuItemCycle()).perform();
        action.moveToElement(mainFactoryPage.getMenuItemApparel())
                .moveToElement(mainFactoryPage.getMenuItemGloves())
                .click().build().perform();
    }

    @When("GlovesPage loaded")
    public void glovesPageLoaded() {
        Assert.assertEquals(glovesPage.isGlovesPageDisplayed(), true);
    }

    @Then("click on the first gloves")
    public void clickOnTheFirstGloves() {
        glovesPage.clickOnFirstGloves();
    }
}
