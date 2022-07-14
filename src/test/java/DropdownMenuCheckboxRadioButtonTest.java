import base.Test_Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class DropdownMenuCheckboxRadioButtonTest extends Test_Base {

    @Before
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

    @After
    public void afterMethod() {
        disable();
    }
}

