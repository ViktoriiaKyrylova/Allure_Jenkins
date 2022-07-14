package locators;

import base.Test_Base;
import org.openqa.selenium.By;

public class ActionPageLocators extends Test_Base {

    public static By placeToDropBackground = By.xpath("//*[@id='droppable']/p");

    public static By doubleClickButton = By.xpath("//*[@id='double-click']");
    public static By findDoubleClickButtonToGetColor = By.xpath("//*[@id='double-click']");

    public static By hoverMeFirstButton = By.xpath("//*[@id='div-hover']/div[1]/button");
    public static By hoverMeSecondButton = By.xpath("//*[@id='div-hover']/div[2]/button");
    public static By hoverMeThirdButton = By.xpath("//*[@id='div-hover']/div[3]/button");

    public static By hoverMeFirstButtonLink = By.xpath("//*[@id='div-hover']/div[1]/div/a");
    public static By hoverMeSecondButtonLink = By.xpath("//*[@id='div-hover']/div[2]/div/a");
    public static By hoverMeThirdButtonFirstLink = By.xpath("//*[@id='div-hover']/div[3]/div/a[1]");
    public static By hoverMeThirdButtonSecondLink = By.xpath("//*[@id='div-hover']/div[3]/div/a[2]");

    public static By clickAndHoldButton = By.xpath("//*[@id='click-box']/p");
}
