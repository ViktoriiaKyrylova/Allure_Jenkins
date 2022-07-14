package locators;

import org.openqa.selenium.By;

public class ContactUsPageLocators {

    public final static By firstNameField = By.xpath("//*[@id='contact_form']/input[1]");
    public final static By lastNameField = By.xpath("//*[@id='contact_form']/input[2]");
    public final static By emailField = By.xpath("//*[@id='contact_form']/input[3]");
    public final static By messageField = By.xpath("//*[@id='contact_form']/textarea");
    public final static By resetButton = By.xpath("//*[@id='form_buttons']/input[@type='reset']");
    public final static By submitButton = By.xpath("//*[@id='form_buttons']/input[@type='submit']");
    public final static By contactReply = By.xpath("//*[@id='contact_reply']/h1");
}
