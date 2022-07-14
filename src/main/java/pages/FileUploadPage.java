package pages;

import base.Test_Base;
import locators.FileUploadPageLocators;
import locators.MainPageLocators;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage extends Test_Base {
    public FileUploadPage() {
        PageFactory.initElements(driver, this);
    }

    public void openFileUploadPageLink(){
        element(MainPageLocators.fileUpload).click();
        changeTab();
    }

    public void selectFile() {
        element(FileUploadPageLocators.chooseFileButton).sendKeys(selectPathToTheFile());
    }

    public String verifyChosenFile(){
        return element(FileUploadPageLocators.fileName).getAttribute("value");
    }

    public void uploadFile() {
        element(FileUploadPageLocators.submitButton).click();
        driver.switchTo().alert().accept();
    }

    public String verifyFileIsUploaded(){
        return element(FileUploadPageLocators.fileName).getAttribute("value");
    }
}
