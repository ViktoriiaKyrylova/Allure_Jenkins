package locators;

import org.openqa.selenium.By;

public class ToDoListLocators {
    public static final By add_new_todo_button = By.xpath("//*[@id='plus-icon']");
    public static final By add_new_todo_field = By.xpath("//*[@id='container']/input");
    public static final By field_in_list = By.xpath("//ul/li");
    public static final By delete_to_do_button = By.xpath("//*[@class='fa fa-trash']");
    public static final By mark_todo_ready = By.xpath("//li[@class='completed']");
}
