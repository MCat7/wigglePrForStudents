package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlovesPage extends FactoryPage {
    @FindBy(xpath = "//h1[contains(text(),'Gloves')]")
    private WebElement h1TitleContainer;

    @FindBy(xpath = "//div[@data-position='1']")
    private WebElement firstGloves;


    public boolean isGlovesPageDisplayed() {
        return h1TitleContainer.isDisplayed();
    }

    public void clickOnFirstGloves() {
        firstGloves.click();
    }
}
