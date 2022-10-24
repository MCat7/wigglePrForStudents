package com.stv.factory.factorypages;

import com.stv.framework.core.drivers.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL_USA;

public class MainFactoryPage extends FactoryPage {

    @FindBy(id = "accountLink")
    private WebElement accountLink;

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;

    @FindBy(id = "DualRegisterEmailModel_Email")
    private WebElement emailAddressField;

    @FindBy(id = "qa-dual-register")
    private WebElement continueNewCustomerButton;
    @FindBy(id = "DualRegisterEmailModel_Email-error")
    private WebElement emailErrorMessage;

    @FindBy(className = "bem-megamenu__head-container")
    private WebElement indexPage;

    public boolean isAccountLinkDisplayed() {
        return accountLink.isDisplayed();
    }

    public void clickOnAccountLink() {
        accountLink.click();
    }

    public void clickOnTrustButton() {
        trustButton.click();
    }

    public void tryClickOnTrustButton() {
        try {
            trustButton.click();
        } catch (NoSuchElementException e) {
            Driver.getDriver().get(START_URL_USA);
        }
    }

    public void enterNewCustomerEmailAddressField(String s) {
        emailAddressField.sendKeys(s);
    }

    public void clickContinueNewCustomerButton() {
        continueNewCustomerButton.click();
    }

    public boolean emailErrorMessageDisplayed() {
        return emailErrorMessage.isDisplayed();
    }

    public boolean emailAddressFieldDisplayed() {
        return emailAddressField.isDisplayed();
    }

    public boolean indexPageLoaded() {
        return indexPage.isDisplayed();
    }
}
