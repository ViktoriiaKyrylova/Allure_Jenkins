package locators;

import org.openqa.selenium.By;

public class ClickButtonsPageLocators {
    public static final By webElementClickButton = By.xpath("//*[@id='button1']");
    public static final By webElementClickPopup = By.xpath("//*[@id='myModalClick']//div[@class='modal-content']");
    public static final By webElementClickPopupMessage = By.xpath("//*[@id='myModalClick']//div[@class='modal-header']");
    public static final By webElementClickPopupCloseButton = By.xpath("//*[@id='myModalClick']//*[@class='modal-footer']//button");

    public static final By javascriptButton = new By.ByCssSelector("#button2");
    public static final By javascriptPopup = By.xpath("//*[@id='myModalJSClick']//div[@class='modal-content']");
    public static final By javascriptPopupMessage = By.xpath("//*[@id='myModalJSClick']//div[@class='modal-header']");
    public static final By javascriptPopupCloseButton = By.xpath("//*[@id='myModalJSClick']//div[@class='modal-footer']/button");

    public static final By actionClickButton = By.xpath("//*[@id='button3']");
    public static final By actionPopup = By.xpath("//*[@id='myModalMoveClick']//div[@class='modal-content']");
    public static final By actionPopupMessage = By.xpath("//*[@id='myModalMoveClick']//div[@class='modal-header']");
    public static final By actionPopupCloseButton = By.xpath("//*[@id='myModalMoveClick']//div[@class='modal-footer']/button");
}
