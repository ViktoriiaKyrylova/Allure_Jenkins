package StepDefs;

import base.Test_Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class DropdownMenuCheckboxRadioButtonTest extends Test_Base {

    @BeforeMethod
    public void beforeMethod() throws AWTException, InterruptedException {
        initialization();
        dropdownMenuCheckboxRadioButtonPage.openDropdownMenuCheckboxRadioButtonLink();
    }

    @Test
    public void dropboxMenu() {
        dropdownMenuCheckboxRadioButtonPage.openDropDown();
    }

    @Test
    public void checkBoxMenu() {
        dropdownMenuCheckboxRadioButtonPage.checkBoxes();
    }

    @Test
    public void radioButton() {
        dropdownMenuCheckboxRadioButtonPage.radioButtons();
    }

    @Test
    public void radioButtonWithDisable() {
        dropdownMenuCheckboxRadioButtonPage.radioButtonWithDisabled();
    }

    @Test
    public void dropDownWithDisable() {
        dropdownMenuCheckboxRadioButtonPage.dropDownWithDisabledAttribute();
    }

    @AfterMethod
    public void afterMethod() {
        disable();
    }
}

