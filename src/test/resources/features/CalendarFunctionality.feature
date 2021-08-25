@Calendar
Feature: Calendar functionality  MeetSky

  Background:
    Given user should be Login successfully as "user_name" "user_password"
    Given Click on submit button

    Scenario: user should be able to see Daily-Weekly-Monthly calendar view a
      When Meetsky Home page should contains titles "Files - Meetsky - QA"
      Then Click on calendar tab
      When verify Meetsky Calendar page is displayed
      Then click on burger button
      And click on the view module
      When click on the day button
      Then verify daily calendar is displayed
      When click on the week button
      Then verify weekly calendar is displayed
      When click on the month button
      Then verify monthly calendar is displayed












