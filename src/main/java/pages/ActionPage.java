package pages;

import base.Test_Base;
import locators.ActionPageLocators;
import locators.MainPageLocators;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionPage extends Test_Base {

    public ActionPage() {
        PageFactory.initElements(driver, this);
    }

    public void openActionLink() {

        element(MainPageLocators.actions).click();
        changeTab();
    }

    public void moveItem() {

        WebElement elementToDrop = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement placeToDrop = driver.findElement(By.xpath("//*[@id='droppable']"));
        action.dragAndDrop(elementToDrop, placeToDrop).build().perform();
    }

    public String getPlaceColour() {

        return element(ActionPageLocators.placeToDropBackground).getCssValue("background-color");
    }

    public void doubleClick() {

        action.moveToElement(element(ActionPageLocators.doubleClickButton)).doubleClick().build().perform();
    }

    public String getButtonColor() {

        return element(ActionPageLocators.findDoubleClickButtonToGetColor).getCssValue("background-color");
    }

    public void hoverFirstButton() {

        action.moveToElement(element(ActionPageLocators.hoverMeFirstButton));
        action.moveToElement(element(ActionPageLocators.hoverMeFirstButtonLink)).click().perform();

        Alert alert = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent()));

        alert.accept();
    }

    public void hoverSecondButton() {

        action.moveToElement(element(ActionPageLocators.hoverMeSecondButton));
        action.moveToElement(element(ActionPageLocators.hoverMeSecondButtonLink)).click().perform();

        Alert alert = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent()));

        alert.accept();
    }

    public void hoverThirdButton() {

        action.moveToElement(element(ActionPageLocators.hoverMeThirdButton));
        action.moveToElement(element(ActionPageLocators.hoverMeThirdButtonFirstLink)).click().perform();

        Alert alert = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent()));

        alert.accept();

        action.moveToElement(element(ActionPageLocators.hoverMeThirdButton));
        action.moveToElement(element(ActionPageLocators.hoverMeThirdButtonSecondLink)).click().perform();

        alert.accept();
    }

    public void clickAndHold() {

        action.moveToElement(element(ActionPageLocators.clickAndHoldButton)).clickAndHold();
    }
}
