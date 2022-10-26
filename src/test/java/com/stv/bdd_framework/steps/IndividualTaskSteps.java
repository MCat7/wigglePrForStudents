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
        getDriver().manage().window().maximize();
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
        Assert.assertTrue(glovesPage.isGlovesPageDisplayed());
    }

    @Then("click on the first gloves")
    public void clickOnTheFirstGloves() {
        glovesPage.clickOnFirstGloves();
    }

    @And("see the following image")
    public void seeTheFollowingImage() {
        glovesPage.clickImageScrollRightButton();
    }

    @And("change the quantity of products to {string}")
    public void changeTheNumberOfProductsTo(String arg0) {
        glovesPage.changeQuantityMultiplier(arg0);
    }

    @And("click Add_To_Basket button")
    public void clickAdd_To_BasketButton() {
        glovesPage.clickAdd_to_basketButton();
    }

    @When("we see a message about the need to select a size")
    public void weSeeAMessageAboutTheNeedToSelectASize() {
        Assert.assertTrue(glovesPage.errorGloveSizeMessageDisplayed());
    }

    @Then("select Small size")
    public void selectSmallSize() {
        glovesPage.selectSmallSize();
    }

    @And("click View full Basket")
    public void clickViewFullBasket() {
        glovesPage.clickViewBasketLink();
    }

    @When("check the quantity of ordered gloves {string}")
    public void checkTheNumberOfOrderedGloves(String arg0) {
        Assert.assertTrue(glovesPage.checkQuantityToBuy(arg0));
    }
}
