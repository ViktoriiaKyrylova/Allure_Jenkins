package pages;

import base.Test_Base;
import locators.MainPageLocators;
import locators.ToDoListLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.awt.event.KeyEvent;
import java.util.List;

import static java.lang.Thread.sleep;

public class ToDoListPage extends Test_Base {
    public ToDoListPage() {
        PageFactory.initElements(driver, this);
    }

    public void openToDoPageLink() {
        element(MainPageLocators.toDoList).click();
        changeTab();
    }

    public void clickToAddNewToDo() {
        element(ToDoListLocators.add_new_todo_field).click();
    }

    public void insertNewToDoText() {
        element(ToDoListLocators.add_new_todo_field).sendKeys("first to do");
    }

    public void submitToDoText() {
        action.sendKeys(Keys.RETURN);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public int countFieldInList() {
        List<WebElement> elemOfList = driver.findElements(By.xpath("//ul/li"));
        return elemOfList.size();
    }

    public void deleteAllFields() throws InterruptedException {
        List<WebElement> elemOfList = driver.findElements(By.xpath("//ul/li"));
        System.out.println(elemOfList.size());
        for (int i = 0; i < elemOfList.size(); i++) {
            element(ToDoListLocators.delete_to_do_button).isEnabled();
            sleep(500);
            element(ToDoListLocators.delete_to_do_button).click();
        }
    }

    public void markAllToDoReady(){
        List<WebElement> elemOfList = driver.findElements(By.xpath("//ul/li"));

        for (WebElement webElement : elemOfList) {
            webElement.click();
        }
    }
}
