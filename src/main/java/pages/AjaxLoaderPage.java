package pages;

import base.Test_Base;
import locators.AjaxLoaderLocators;
import locators.MainPageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AjaxLoaderPage extends Test_Base {

    public AjaxLoaderPage() {
        PageFactory.initElements(driver, this);
    }

    public void openAjaxLoaderLink(){
        element(MainPageLocators.ajaxLoader).click();
        changeTab();
    }

    public void waitForClickMeButton(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(AjaxLoaderLocators.clickMeButton));
    }

    public void clickMeButtonClick(){
        element(AjaxLoaderLocators.clickMeButton).click();
    }

    public String getPopupMessage(){

        webDriverWait.until(ExpectedConditions.elementToBeClickable(AjaxLoaderLocators.closeButton));
        return element(AjaxLoaderLocators.popupMessage).getText();
    }

    public void closePopupMessage(){

        element(AjaxLoaderLocators.closeButton).click();
    }
}
