package locators;

import org.openqa.selenium.By;

public class FileUploadPageLocators {

    public static By chooseFileButton = By.xpath("//*[@id='myFile']");
    public static By submitButton = By.xpath("//*[@id='submit-button']");
    public static By fileName = By.xpath("//input[@type='file']");
}
