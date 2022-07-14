package pages;

import base.Test_Base;
import locators.MainPageLocators;
import locators.ScrollingPageLocators;
import org.openqa.selenium.support.PageFactory;

public class ScrollingPage extends Test_Base {
    public ScrollingPage() {
        PageFactory.initElements(driver, this);
    }

    public void openScrollingPageLink() {
        element(MainPageLocators.scrollingAround).click();
        changeTab();
    }

    public void scrollToFirstField() {
        js.executeScript("window.scrollBy(0,0)", "");
        action.moveToElement(element(ScrollingPageLocators.scrollToMeFirst)).build().perform();
    }

    public String getColourOfField() {
        return element(ScrollingPageLocators.scrollToMeFirst).getAttribute("style");
    }

    public void scrollToLeftScrollCounter() {
        js.executeScript("arguments[0].scrollIntoView()", element(ScrollingPageLocators.leftScrollCounter));
        action.moveToElement(element(ScrollingPageLocators.leftScrollCounter)).build().perform();
    }

    public String getAmountForEntriesToLeftScrollCounter() {
        return element(ScrollingPageLocators.leftScrollCounter).getText();
    }

    public void scrollToRightScrollCounter() {
        js.executeScript("arguments[0].scrollIntoView()", element(ScrollingPageLocators.rightScrollCounter));
        action.moveToElement(element(ScrollingPageLocators.rightScrollCounter)).build().perform();
    }

    public String getAmountForEntriesToRightScrollCounter() {
        return element(ScrollingPageLocators.rightScrollCounter).getText();
    }

    public void scrollToCoordinatesField(){
        js.executeScript("window.scrollBy(" + 610 + "," + 771 + ");");
        action.moveToElement(element(ScrollingPageLocators.doNotForgetField)).build().perform();
    }

    public String getCoordinatesFromField(){
        return element(ScrollingPageLocators.doNotForgetField).getText();
    }
}
