package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL_USA;
import static com.stv.framework.core.lib.WiggleTestEmail.VALID_EMAIL;
import static com.stv.framework.core.lib.WiggleTestEmail.INVALID_EMAIL;

public class MainFactoryTest extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Ignore
    @Test(description = "Assert the main page is loaded and account icon is visible")
    public void assertAccountIconIsDisplayed() {
        boolean actualResult = mainFactoryPage.isAccountLinkDisplayed();
        Assert.assertEquals(actualResult, true, "Account link isn't visible");
    }

    @Ignore
    @Test(description = "Assert the login page is loaded", dependsOnMethods = "assertAccountIconIsDisplayed")
    public void assertLoginPageOpened() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        Assert.assertEquals(new LoginPage().isLoginContainerDisplayed(), true, "Login page isn't loaded properly");
    }

    @Test
    public void addNewCustomer() throws InterruptedException {
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        mainFactoryPage.enterNewCustomerEmailAddressField(VALID_EMAIL);
        mainFactoryPage.clickContinueNewCustomerButton();
        Assert.assertEquals(new RegistrationPage().isRegistrationContainerDisplayed(), true);
    }

    @Test
    public void addNewCustomerInvalidEmail() throws InterruptedException {
        getDriver().get(START_URL_USA);
        mainFactoryPage.clickOnAccountLink();
        mainFactoryPage.enterNewCustomerEmailAddressField(INVALID_EMAIL);
        mainFactoryPage.clickContinueNewCustomerButton();
        Assert.assertEquals(mainFactoryPage.emailErrorMessageDisplayed(), true);
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

}
