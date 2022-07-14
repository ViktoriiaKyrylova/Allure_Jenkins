package pages;

import base.Test_Base;
import locators.LoginPageLocators;
import locators.MainPageLocators;
import org.openqa.selenium.support.PageFactory;

public class LoginPortalPage extends Test_Base {
    public LoginPortalPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnLoginPortalLink() {
        element(MainPageLocators.loginPortal).click();
        changeTab();
    }

    public void insertUsername() {
        element(LoginPageLocators.username_field).sendKeys("User");
    }

    public void insertPassword() {
        element(LoginPageLocators.password_field).sendKeys("Password");
    }

    public void clickLoginButton() {
        element(LoginPageLocators.login_button).click();
    }

    public String checkAlertMessage() {
        return alert.getText();
    }
    public void acceptAlert(){
        alert.accept();
    }
}
