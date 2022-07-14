package pages;

import base.Test_Base;
import locators.AutocompletePageLocators;
import locators.MainPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import java.util.List;

public class AutocompletePage extends Test_Base {

    public AutocompletePage() {
        PageFactory.initElements(driver, this);
    }

    public void openAutocompletePage(){
        element(MainPageLocators.autocompleteTextField).click();
        changeTab();
    }
    public void enterSymbol(){
        element(AutocompletePageLocators.fieldForSearch).sendKeys("a");
    }

    public void verifyAllElementsAfterEntering(){
        int expectedSize = 5;
        List<WebElement> itemList = driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']//div"));
        int size = itemList.size();
        Assert.assertEquals(size, expectedSize);
        for (WebElement webElement : itemList) {
            Assert.assertTrue(webElement.isDisplayed());
        }
    }

    public void selectItemFromList(){
        element(AutocompletePageLocators.selectedItem).click();
        element(AutocompletePageLocators.submitButton).click();
    }
}


