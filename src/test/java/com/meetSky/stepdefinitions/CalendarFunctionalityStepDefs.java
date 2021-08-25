package com.meetSky.stepdefinitions;

import com.meetSky.pages.CalendarFunctionalityPage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarFunctionalityStepDefs {

    @When("Meetsky Home page should contains titles {string}")
    public void meetsky_Home_page_should_contains_titles(String expectedTitle) {
        String title = Driver.get().getTitle();
        System.out.println("title = " + title);
        Assert.assertTrue(title.contains(expectedTitle));

    }

    @Then("Click on calendar tab")
    public void click_on_calendar_tab() {
        new CalendarFunctionalityPage().clickCalendarButton();

    }

    @When("verify Meetsky Calendar page is displayed")
    public void verify_Meetsky_Calendar_page_is_displayed() {
        new CalendarFunctionalityPage().isDisplayedCalendarPage();

    }

    @Then("click on burger button")
    public void clickOnBurgerButton() {

        new CalendarFunctionalityPage().clickBurgerButton();
    }




    @And("click on the view module")
    public void clickOnTheViewModule() {
        new CalendarFunctionalityPage().viewModule.click();

    }

    @When("click on the day button")
    public void click_on_the_day_button() {
        new CalendarFunctionalityPage().clickDayButton();



    }

    @Then("verify daily calendar is displayed")
    public void verify_daily_calendar_is_displayed() {
       new CalendarFunctionalityPage().DayDisplayPage();
    }

    @When("click on the week button")
    public void click_on_the_week_button() {
        new CalendarFunctionalityPage().clickDWekButton();
    }

    @Then("verify weekly calendar is displayed")
    public void verify_weekly_calendar_is_displayed() {
      new CalendarFunctionalityPage().weekPageIsDisplayed();
    }

    @When("click on the month button")
    public void click_on_the_month_button() {
       new CalendarFunctionalityPage().clickMonthButton();
    }

    @Then("verify monthly calendar is displayed")
    public void verify_monthly_calendar_is_displayed() {
        new CalendarFunctionalityPage().DisplayMonthPage();

    }



}
