package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;

import io.cucumber.java.en.Given;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL_USA;

public class NewCustomerSteps extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    @Given("^myAccount page loaded$")
    public void myAccount_page_loaded() throws Throwable{
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().get(START_URL_USA);
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        boolean actualResult = mainFactoryPage.isAccountLinkDisplayed();
        Assert.assertEquals(actualResult, true, "Account link isn't visible");
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        getDriver().quit();
    }
}
