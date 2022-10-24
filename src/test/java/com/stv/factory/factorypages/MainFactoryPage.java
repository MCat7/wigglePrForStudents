package com.stv.factory.factorypages;

import com.stv.framework.core.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public boolean isAccountLinkDisplayed(){
        return accountLink.isDisplayed();
    }

    public void clickOnAccountLink(){
        accountLink.click();
    }

    public void clickOnTrustButton(){
        trustButton.click();
    }

    public void enterNewCustomerEmailAddressField(String s) {

        emailAddressField.sendKeys(s);
    }

    public void clickContinueNewCustomerButton(){
        continueNewCustomerButton.click();
    }

    public boolean emailErrorMessageDisplayed(){
       return emailErrorMessage.isDisplayed();
    }
    public boolean emailAddressFieldDisplayed(){
       return emailAddressField.isDisplayed();
    }


}
