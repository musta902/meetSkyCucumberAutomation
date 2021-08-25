package com.meetSky.stepdefinitions;

import com.meetSky.pages.LoginPage;
import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.UsefulUtils;
import io.cucumber.java.en.Given;

public class LoginStepDefs {

    @Given("Navigate the url")
    public void navigate_the_url() {


    }

    @Given("user should be Login successfully as {string} {string}")
    public void user_should_be_Login_successfully_as(String user_name, String user_password) {
        String username2 = ConfigurationReader.get(user_name);
        String password2 = ConfigurationReader.get(user_password);


        new LoginPage().login(username2, password2);


    }

    @Given("Click on submit button")
    public void click_on_submit_button() {




    }

}
