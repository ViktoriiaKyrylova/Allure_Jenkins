package pages;

import base.Test_Base;
import locators.DropdownMenuCheckboxRadioButtonLocators;
import locators.MainPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class DropdownMenuCheckboxRadioButtonPage extends Test_Base {


    public DropdownMenuCheckboxRadioButtonPage() {
        PageFactory.initElements(driver, this);
    }

    public void openDropdownMenuCheckboxRadioButtonLink() {
        element(MainPageLocators.dropdown).click();
        changeTab();
    }


    public void openDropDown() {
        List<WebElement> dropDowns = driver.findElements(By.xpath("//div[h2='Dropdown Menu(s)']//select"));
        List<WebElement> dropDownMenuAttributes = driver.findElements(By.xpath("//div[h2='Dropdown Menu(s)']//select/option[2]"));
        for (WebElement webElement : dropDowns) {
            webElement.click();
            for (WebElement dropDownMenuAttribute : dropDownMenuAttributes) {
                dropDownMenuAttribute.click();
            }
        }
    }

    public void checkBoxes() {
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//*[@id='checkboxes']/label/input"));
        for (WebElement checkBox : checkBoxes) {
            checkBox.click();
        }
    }

    public void radioButtons() {
        List<WebElement> radioButtons = driver.findElements(By.xpath("//*[@id='radio-buttons']/input"));
        for (WebElement radioButton : radioButtons) {
            radioButton.click();
        }
    }

    public void radioButtonWithDisabled() {
        List<WebElement> radioButtonsWithDisabledButton = driver.findElements(By.xpath("//*[@id='radio-buttons-selected-disabled']/input"));
        for (WebElement radioButton : radioButtonsWithDisabledButton) {
            if (radioButton.isEnabled()) {
                radioButton.click();
            } else {
                radioButton.isEnabled();
            }
        }
    }

    public void dropDownWithDisabledAttribute() {
        List<WebElement> dropDownWithDisabledAttributeAttributes = driver.findElements(By.xpath("//*[@id='fruit-selects']/option"));
        element(DropdownMenuCheckboxRadioButtonLocators.dropDownWithDisabledAttribute).click();
        for (WebElement attribute : dropDownWithDisabledAttributeAttributes) {

            if (attribute.isEnabled()) {
                attribute.click();
            } else {
                attribute.isEnabled();
            }
        }
    }
}
