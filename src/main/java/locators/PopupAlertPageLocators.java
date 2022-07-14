package locators;

import org.openqa.selenium.By;

public class PopupAlertPageLocators {

    public static By javaScriptAlertClickMeButton = By.xpath("//*[@id='button1']");
    public static By modalPopupClickMeButton = By.xpath("//*[@id='button2']");

    public static By modalAlertCloseButton = By.xpath("//*[@id='myModal']//button");
    public static By modalAlert = By.xpath("//*[@id='myModal']/div/div");

    public static By linkToAjaxLoaderButton = By.xpath("//*[@id='button3']");

    public static By javaScriptConfirmBoxButton = By.xpath("//*[@id='button4']");
    public static By messageAfterConfirmBoxButtonClick = By.xpath("//*[@id='confirm-alert-text']");
}
