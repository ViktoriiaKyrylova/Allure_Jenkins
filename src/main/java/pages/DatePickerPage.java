package pages;

import base.Test_Base;
import locators.DatePickerPageLocators;
import locators.MainPageLocators;
import org.openqa.selenium.support.PageFactory;

public class DatePickerPage extends Test_Base {
    public DatePickerPage() {
        PageFactory.initElements(driver, this);
    }

    public void openDatePickerPageLink() {
        element(MainPageLocators.datePicker).click();
        changeTab();
    }

    public String getCurrentDate() {

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();
        return "0" + month + "-0" + day + "-" + year;
    }

    public String getShowedDate() {
        return element(DatePickerPageLocators.currentDate).getAttribute("value");
    }

    public void openCalendar() {
        element(DatePickerPageLocators.calendarButton).click();
    }

    public void clickMonthButton() {
        element(DatePickerPageLocators.selectedMonthButton).click();
    }

    public void clickYearButton() {
        element(DatePickerPageLocators.selectYearTopButton).click();
    }

    public String getShowedMonth() {
        return element(DatePickerPageLocators.selectedMonthButton).getText();
    }

    public String getShowedYear() {
        return element(DatePickerPageLocators.selectYearTopButton).getText();
    }

    public String getShowedYears() {
        return element(DatePickerPageLocators.selectYearsTopButton).getText();
    }

    public void clickNextMonthButton() {
        element(DatePickerPageLocators.switchNextMonthArrow).click();
    }

    public void clickNextYearButton() {
        element(DatePickerPageLocators.switchNextYearArrow).click();
    }

    public void clickNextYearsButton() {
        element(DatePickerPageLocators.switchNextYearsArrow).click();
    }

    public void clickPreviousMonthButton() {
        element(DatePickerPageLocators.switchPreviousMonthArrow).click();
    }

    public void clickPreviousYearButton() {
        element(DatePickerPageLocators.switchPreviousYearArrow).click();
    }

    public void clickPreviousYearsButton() {
        element(DatePickerPageLocators.switchPreviousYearsArrow).click();
    }

    public void selectNewDate(){
        element(DatePickerPageLocators.dayOfCurrentMonth).click();
    }

}
