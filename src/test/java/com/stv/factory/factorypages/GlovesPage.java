package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlovesPage extends FactoryPage {
    @FindBy(xpath = "//h1[contains(text(),'Gloves')]")
    private WebElement h1TitleContainer;

    @FindBy(xpath = "//div[@data-position='1']")
    private WebElement firstGloves;

    @FindBy(xpath = "//i[@class='icon-right-open']")
    private WebElement imageScrollRightButton;

    @FindBy(name = "quantityMultiplier")
    private WebElement quantityMultiplier;

    @FindBy(id = "quickBuyButton")
    private WebElement add_to_basketButton;

    @FindBy(xpath = "//span[@class='validation-message'][contains(text(),'Please select a size')]")
    private WebElement errorGloveSizeMessage;

    @FindBy(xpath = "(//div[contains(@class,'js-size-selections')])[2]")
    private WebElement sizeSelect;

    @FindBy(xpath = "//li[@title='Small']")
    private WebElement sizeSmall;

    @FindBy(id = "view-basket")
    private WebElement viewBasketLink;

    @FindBy(name = "txtQty[0]")
    private WebElement quantityTuBuy;

    public boolean isGlovesPageDisplayed() {
        return h1TitleContainer.isDisplayed();
    }

    public void clickOnFirstGloves() {
        firstGloves.click();
    }

    public void clickImageScrollRightButton() {
        imageScrollRightButton.click();
    }

    public void changeQuantityMultiplier(String q) {
        quantityMultiplier.clear();
        quantityMultiplier.sendKeys(q);
    }

    public void clickAdd_to_basketButton() {
        add_to_basketButton.click();
    }

    public boolean errorGloveSizeMessageDisplayed() {
        return errorGloveSizeMessage.isDisplayed();
    }

    public void selectSmallSize() {
        sizeSelect.click();
        sizeSmall.click();
    }

    public void clickViewBasketLink() {
        viewBasketLink.click();
    }

    public boolean checkQuantityToBuy(String q) {
        return quantityTuBuy.getAttribute("value").equals(q);
    }
}
