package pages;

import base.Test_Base;
import locators.AccordionItemsTextAppearLocators;
import locators.MainPageLocators;
import org.openqa.selenium.support.PageFactory;

public class AccordionItemsTextAppearPage extends Test_Base {

    public AccordionItemsTextAppearPage() {
        PageFactory.initElements(driver, this);
    }

    public void openAccordionItemsTextAppearLink() {
        element(MainPageLocators.appearDisappear).click();
        changeTab();
    }

    public void manualTestingButtonClick() {
        element(AccordionItemsTextAppearLocators.manualTestingButton).click();
    }

    public String manualTestingGetDescription() {
        return element(AccordionItemsTextAppearLocators.manualTestingDescription).getText();
    }

    public void cucumberButtonClick() {
        element(AccordionItemsTextAppearLocators.cucumberButton).click();
    }

    public String cucumberGetDescription() {
        return element(AccordionItemsTextAppearLocators.cucumberDescription).getText();
    }

    public void automationTestingButtonClick() {
        element(AccordionItemsTextAppearLocators.automationTestingButton).click();
    }

    public String automationTestingGetDescription() {
        return element(AccordionItemsTextAppearLocators.automationTestingDescription).getText();
    }

    public void keepClickingButtonClick() {
        element(AccordionItemsTextAppearLocators.keepClickingButton).click();
    }

    public String keepClickingGetDescription() {
        return element(AccordionItemsTextAppearLocators.keepClickingDescription).getText();
    }
}
