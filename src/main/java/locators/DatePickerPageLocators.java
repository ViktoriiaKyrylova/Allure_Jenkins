package locators;

import org.openqa.selenium.By;

public class DatePickerPageLocators {

    public static By currentDate = By.xpath("//*[@id='datepicker']/input");
    public static By calendarButton = By.xpath("//*[@id='datepicker']/span/i");

    public static By dayOfCurrentMonth = By.xpath("//td[@class='day'][6]");

    public static By selectedMonthButton = By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']");
    public static By selectYearTopButton = By.xpath("//div[@class='datepicker-months']//th[@class='datepicker-switch']");
    public static By selectYearsTopButton = By.xpath("//div[@class='datepicker-years']//th[@class='datepicker-switch']");

    public static By switchNextMonthArrow = By.xpath("//div[@class='datepicker-days']//th[@class='next']");
    public static By switchNextYearArrow = By.xpath("//div[@class='datepicker-months']//th[@class='next']");
    public static By switchNextYearsArrow = By.xpath("//div[@class='datepicker-years']//th[@class='next']");

    public static By switchPreviousMonthArrow = By.xpath("//div[@class='datepicker-days']//th[@class='prev']");
    public static By switchPreviousYearArrow = By.xpath("//div[@class='datepicker-months']//th[@class='prev']");
    public static By switchPreviousYearsArrow = By.xpath("//div[@class='datepicker-years']//th[@class='prev']");
}
