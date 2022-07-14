package locators;

import org.openqa.selenium.By;

public class HiddenElementsPageLocators {

    public static By notDisplayedButton = By.xpath("//*[@id='button1']");
    public static By notDisplayedButtonModalPopup = By.xpath("//*[@id='myModalClick']//div[@class='modal-content']");
    public static By notDisplayedButtonModalPopupHeader = By.xpath("//*[@id='myModalClick']//div[@class='modal-header']");
    public static By notDisplayedButtonModalPopupCloseButton = By.xpath("//*[@id='myModalClick']//div[@class='modal-footer']/button");

    public static By visibilityHiddenButton = By.xpath("//*[@id='button2']");
    public static By visibilityHiddenButtonModalPopup = By.xpath("//*[@id='myModalJSClick']//div[@class='modal-content']");
    public static By visibilityHiddenButtonModalPopupHeader = By.xpath("//*[@id='myModalJSClick']//div[@class='modal-header']");
    public static By visibilityHiddenButtonModalPopupCloseButton = By.xpath("//*[@id='myModalJSClick']//div[@class='modal-footer']/button");

    public static By zeroOpacityButton = By.xpath("//*[@id='button3']");
    public static By zeroOpacityButtonModalPopup = By.xpath("//*[@id='myModalMoveClick']//div[@class='modal-content']");
    public static By zeroOpacityButtonModalPopupHeader = By.xpath("//*[@id='myModalMoveClick']//div[@class='modal-header']");
    public static By zeroOpacityButtonModalPopupCloseButton = By.xpath("//*[@id='myModalMoveClick']//div[@class='modal-footer']/button");
}
