package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import com.meetSky.utilities.UsefulUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarFunctionalityPage extends BasePage {

    public CalendarFunctionalityPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//li[@data-id='calendar'])[1]")
    public WebElement calendarButton;

    public void clickCalendarButton(){
        calendarButton.click();
    }
    @FindBy(xpath = "(//div/a[@class='app-navigation-toggle']")
    public WebElement burgerButton;
    public void clickBurgerButton(){

      UsefulUtils.clickWithJS(burgerButton);
    }


    @FindBy(xpath = "//div/button[@class='icon action-item__menutoggle icon-view-module']")
    public WebElement viewModule;
    public void clickViewModuleButton() {

        UsefulUtils.clickWithJS(viewModule);
    }
        public void isDisplayedCalendarPage(){
            boolean calendarPageIsDisplayed = viewModule.isDisplayed();
            Assert.assertTrue(calendarPageIsDisplayed);
        }

    @FindBy(xpath = "//button/span[.='Day']")
    public WebElement dayButton;
    public void clickDayButton() {
        dayButton.click();
    }
    @FindBy(xpath = "//div/a[@class='fc-col-header-cell-cushion ']")
    public WebElement dayDisplay;
    public void DayDisplayPage() {
        boolean dayPageIsDisplayed = dayDisplay.isDisplayed();
        Assert.assertTrue(dayPageIsDisplayed);
    }


    @FindBy(xpath = "//button/span[.='Week']")
    public WebElement weekButton;
    public void clickDWekButton() {
        weekButton.click();
    }
    @FindBy(xpath = "//tr/th")
    public WebElement weekPage;
    public void weekPageIsDisplayed() {
        boolean weekPageIs = weekPage.isDisplayed();
        Assert.assertTrue(weekPageIs);
    }


    @FindBy(xpath = "//button/span[.='Month']")
    public WebElement monthButton;
    public void clickMonthButton() {
        monthButton.click();

    }
    @FindBy(xpath = "//div/button[@class='datepicker-button-section__datepicker-label button datepicker-label']")
    public WebElement monthPage;
    public void DisplayMonthPage() {
        boolean monthPageIs = monthPage.isDisplayed();
        Assert.assertTrue(monthPageIs);

    }
































}
