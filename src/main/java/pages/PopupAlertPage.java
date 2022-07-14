package pages;

import base.Test_Base;
import locators.MainPageLocators;
import locators.PopupAlertPageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PopupAlertPage extends Test_Base {

    public PopupAlertPage() {
        PageFactory.initElements(driver, this);
    }

    public void openPopupAlertLink() {

        element(MainPageLocators.popupAlerts).click();
        changeTab();
    }

    public void clickJavaScriptAlertClickMeButton() {

        element(PopupAlertPageLocators.javaScriptAlertClickMeButton).click();
    }

    public String getJavaScriptAlert() {

     return alert.getText();
    }

    public void closeJavaScriptAlert() {

        alert.accept();
    }

    public void clickModalPopupClickMeButton(){

        element(PopupAlertPageLocators.modalPopupClickMeButton).click();
    }

    public String getModalPopup(){

        webDriverWait.until(ExpectedConditions.visibilityOf(element(PopupAlertPageLocators.modalAlert)));
        return element(PopupAlertPageLocators.modalAlert).getText();
    }

    public void closeModalPopup(){
        element(PopupAlertPageLocators.modalAlertCloseButton).click();
    }

    public void clickLinkToAjaxLoaderButton(){

        element(PopupAlertPageLocators.linkToAjaxLoaderButton).click();
    }

    public void workWithAjaxLoaderPage(){

        ajaxLoaderPage.waitForClickMeButton();
        ajaxLoaderPage.clickMeButtonClick();
        ajaxLoaderPage.getPopupMessage();
        ajaxLoaderPage.closePopupMessage();
    }

    public void clickJavaScriptConfirmBoxButton(){

        element(PopupAlertPageLocators.javaScriptConfirmBoxButton).click();
    }

    public void javaScriptConfirmBoxAccept(){
        alert.accept();
    }

    public String getMessageAfterConfirmBoxButtonClick(){
        return element(PopupAlertPageLocators.messageAfterConfirmBoxButtonClick).getText();
    }
}
