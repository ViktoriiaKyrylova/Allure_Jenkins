package locators;

import org.openqa.selenium.By;

public class AutocompletePageLocators {
    public final static By fieldForSearch = By.id("myInput");
    public final static By submitButton = By.id("submit-button");
    public final static By itemList = By.xpath("//div[@id='myInputautocomplete-list']//div");
    public final static By selectedItem = By.xpath("//div[@class='autocomplete']//div[3]");
}
