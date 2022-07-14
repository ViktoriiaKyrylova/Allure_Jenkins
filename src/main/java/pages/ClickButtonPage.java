package pages;

import base.Test_Base;
import locators.ClickButtonsPageLocators;
import locators.MainPageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ClickButtonPage extends Test_Base {
    public ClickButtonPage() {
        PageFactory.initElements(driver, this);
    }

    public void openButtonClickLink() {
        element(MainPageLocators.buttonClicks).click();
        changeTab();
    }

    public void webElementButtonClick() {
        element(ClickButtonsPageLocators.webElementClickButton).click();
    }

    public String getWebElementButtonClickPopup() {

        webDriverWait.until(ExpectedConditions.visibilityOf(element(ClickButtonsPageLocators.webElementClickPopup)));
        return element(ClickButtonsPageLocators.webElementClickPopupMessage).getText();
    }

    public void closeWebElementButtonClickPopup() {
        element(ClickButtonsPageLocators.webElementClickPopupCloseButton).click();
    }

    public void javascriptButtonClick() {
        element(ClickButtonsPageLocators.javascriptButton).click();
    }

    public String getJavascriptButtonClickPopup() {

        webDriverWait.until(ExpectedConditions.visibilityOf(element(ClickButtonsPageLocators.javascriptPopup)));
        return element(ClickButtonsPageLocators.javascriptPopupMessage).getText();
    }

    public void closeJavascriptButtonClickPopup() {
        element(ClickButtonsPageLocators.javascriptPopupCloseButton).click();
    }

    public void actionMoveEndClick() {
        element(ClickButtonsPageLocators.actionClickButton).click();
    }

    public String getActionButtonClickPopup() {

        webDriverWait.until(ExpectedConditions.visibilityOf(element(ClickButtonsPageLocators.actionPopup)));
        return element(ClickButtonsPageLocators.actionPopupMessage).getText();
    }

    public void closeActionButtonClickPopup() {
        element(ClickButtonsPageLocators.actionPopupCloseButton).click();
    }
}
