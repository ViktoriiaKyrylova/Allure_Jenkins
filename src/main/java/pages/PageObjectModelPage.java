package pages;

import base.Test_Base;
import locators.MainPageLocators;
import locators.PageObjectModelPageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageObjectModelPage extends Test_Base {

    public PageObjectModelPage() {
        PageFactory.initElements(driver, this);
    }

    public void openPageObjectModelLink() {
        element(MainPageLocators.pageObjectModel).click();
        changeTab();
    }

    public void openOurProductsPage() {
        element(PageObjectModelPageLocators.navOurProductsBarButton).click();
    }

    public void openContactUsPage() {
        element(PageObjectModelPageLocators.navContactUsBarButton).click();
    }

    public void clickCarouselControlLeftArrow() {
        element(PageObjectModelPageLocators.carouselControlLeftArrow).click();
    }

    public void clickCarouselControlRightArrow() {
        element(PageObjectModelPageLocators.carouselControlRightArrow).click();
    }

    public void clickFindOutMoreButton() {
        element(PageObjectModelPageLocators.buttonToFindOutMore).click();
    }

    public void clickSpecialOffers() {
        element(PageObjectModelPageLocators.specialOffersButton).click();
    }

    public void clickOnCameraButton() {
        element(PageObjectModelPageLocators.camerasButton).click();
    }

    public void clickOnNewLaptopButton() {
        element(PageObjectModelPageLocators.newLaptopsButton).click();
    }

    public void clickOnUsedLaptopButton() {
        element(PageObjectModelPageLocators.usedLaptopsButton).click();
    }

    public void clickOnGameConsoleButton() {
        element(PageObjectModelPageLocators.gameConsolesButton).click();
    }

    public void clickOnComponentsButton() {
        element(PageObjectModelPageLocators.componentsButton).click();
    }

    public void clickOnDesktopSystemsButton() {
        element(PageObjectModelPageLocators.desktopSystemsButton).click();
    }

    public void clickOnAudioButton() {
        element(PageObjectModelPageLocators.audioButton).click();
    }

    public void workWithContactUsPageSubmitVersion() {

        contactUsPage.insertFirstName();
        contactUsPage.insertLastName();
        contactUsPage.insertEmail();
        contactUsPage.insertMessage();
        contactUsPage.clickSubmitButton();
    }

    public void workWithContactUsPageResetVersion() {

        contactUsPage.insertFirstName();
        contactUsPage.insertLastName();
        contactUsPage.insertEmail();
        contactUsPage.insertMessage();
        contactUsPage.clickResetButton();
    }

    public String getPopupMessage() {

        webDriverWait.until(ExpectedConditions.visibilityOf(element(PageObjectModelPageLocators.modalPopup)));
        return element(PageObjectModelPageLocators.modalPopupHeader).getText();
    }

    public void closeModalPopup() {

        element(PageObjectModelPageLocators.modalPopupCloseButton).click();
    }
}
