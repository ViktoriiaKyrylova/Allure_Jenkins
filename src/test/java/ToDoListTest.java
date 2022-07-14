import base.Test_Base;
import locators.ToDoListLocators;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.*;

import static java.lang.Thread.sleep;

public class ToDoListTest extends Test_Base {

    @Before
    public void beforeMethod() throws AWTException, InterruptedException {
        initialization();
        toDoListPage.openToDoPageLink();
    }

    @Test
    public void addNewField() {

        int counter1 = toDoListPage.countFieldInList();
        toDoListPage.clickToAddNewToDo();
        toDoListPage.insertNewToDoText();
        toDoListPage.submitToDoText();
        int counter2 = toDoListPage.countFieldInList();
        Assert.assertTrue(counter2 > counter1);
    }

    @Test
    public void deleteAllFields() throws InterruptedException {
        toDoListPage.deleteAllFields();
        sleep(1000);
        int counter1 = toDoListPage.countFieldInList();
        Assert.assertEquals(counter1, 0);
    }

    @Test
    public void markAllToDoReady() throws InterruptedException {

        toDoListPage.markAllToDoReady();
        Assert.assertTrue(element(ToDoListLocators.mark_todo_ready).isDisplayed());
    }
    @After
    public void afterMethod() {
        disable();
    }
}
