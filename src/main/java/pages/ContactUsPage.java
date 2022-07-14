package pages;

import base.Test_Base;
import locators.ContactUsPageLocators;
import locators.MainPageLocators;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends Test_Base {

    public ContactUsPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnContactUsLink() {
        element(MainPageLocators.contactUs).click();
        changeTab();
    }

    public void insertFirstName() {
        element(ContactUsPageLocators.firstNameField).sendKeys("User");
    }

    public void insertLastName() {
        element(ContactUsPageLocators.lastNameField).sendKeys("User");
    }

    public void insertEmail() {
        element(ContactUsPageLocators.emailField).sendKeys("User@gmail.com");
    }

    public void insertMessage() {
        element(ContactUsPageLocators.messageField).sendKeys("some message");
    }

    public void clickResetButton() {
        element(ContactUsPageLocators.resetButton).click();
    }

    public void clickSubmitButton() {
        element(ContactUsPageLocators.submitButton).click();
    }

    public String verifyFieldsIsEmpty() {
        return element(ContactUsPageLocators.firstNameField).getText();
    }

    public String getSuccessText() {
        return element(ContactUsPageLocators.contactReply).getText();
    }
}
