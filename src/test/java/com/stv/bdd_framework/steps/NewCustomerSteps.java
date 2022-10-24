package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.RegistrationPage;
import com.stv.factory.factorytests.BasicFactoryTest;

import com.stv.framework.core.drivers.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL_USA;

public class NewCustomerSteps extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    @Given("^myAccount page loaded$")
    public void myAccountPageLoaded() throws Throwable{
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().get(START_URL_USA);
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        Assert.assertEquals(mainFactoryPage.emailAddressFieldDisplayed(), true);

    }

    @When("the User entered valid email-address")
    public void theUserEnteredValidEmailAddress() {
        mainFactoryPage.enterNewCustomerEmailAddressField("test@gmail.com");
    }

    @And("there is no other user with the same email address")
    public void thereIsNoOtherUserWithTheSameEmailAddress() {
    }

    @And("the User clicks the Continue button")
    public void theUserClicksTheContinueButton() {
        mainFactoryPage.clickContinueNewCustomerButton();
    }

    @Then("going to the registration page")
    public void goingToTheRegistrationPage() {
        Assert.assertEquals(new RegistrationPage().isRegistrationContainerDisplayed(), true);
        Driver.getDriver().quit();
    }
}
