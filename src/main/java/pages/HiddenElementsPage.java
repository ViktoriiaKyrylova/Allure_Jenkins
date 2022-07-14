package pages;

import base.Test_Base;
import locators.HiddenElementsPageLocators;
import locators.MainPageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HiddenElementsPage extends Test_Base {

    public HiddenElementsPage() {
        PageFactory.initElements(driver, this);
    }

    public void openHiddenElementPageLink() {

        element(MainPageLocators.hiddenElements).click();
        changeTab();
    }

    public void tryToReachNotDisplayedButton() {

        js.executeScript("document.getElementById('not-displayed').setAttribute('id', 'enabled')");
    }

    public void clickNotDisplayedButton() {

        element(HiddenElementsPageLocators.notDisplayedButton).click();
    }

    public String getNotDisplayedButtonPopup() {

        webDriverWait.until(ExpectedConditions.visibilityOf(element(HiddenElementsPageLocators.notDisplayedButtonModalPopup)));
        return element(HiddenElementsPageLocators.notDisplayedButtonModalPopupHeader).getText();
    }

    public void closeNotDisplayedButtonPopup() {

        element(HiddenElementsPageLocators.notDisplayedButtonModalPopupCloseButton).click();
    }

    public void tryToReachVisibilityHiddenButton() {

        js.executeScript("document.getElementById('visibility-hidden').removeAttribute('id')");
    }

    public void clickVisibilityHiddenButton() {

        element(HiddenElementsPageLocators.visibilityHiddenButton).click();
    }

    public String getVisibilityHiddenButtonPopup() {

        webDriverWait.until(ExpectedConditions.visibilityOf(element(HiddenElementsPageLocators.visibilityHiddenButtonModalPopup)));
        return element(HiddenElementsPageLocators.visibilityHiddenButtonModalPopupHeader).getText();
    }

    public void closeVisibilityHiddenButtonPopup() {

        element(HiddenElementsPageLocators.visibilityHiddenButtonModalPopupCloseButton).click();
    }

    public void tryToReachZeroOpacityButton() {

        element(HiddenElementsPageLocators.zeroOpacityButton).click();
    }

    public String getZeroOpacityButtonPopup() {

        webDriverWait.until(ExpectedConditions.visibilityOf(element(HiddenElementsPageLocators.zeroOpacityButtonModalPopup)));
        return element(HiddenElementsPageLocators.zeroOpacityButtonModalPopupHeader).getText();
    }

    public void closeZeroOpacityButtonPopup() {

        element(HiddenElementsPageLocators.zeroOpacityButtonModalPopupCloseButton).click();
    }
}
