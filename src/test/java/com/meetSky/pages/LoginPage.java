package com.meetSky.pages;

import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import com.meetSky.utilities.UsefulUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "user")
    public WebElement userinputBox;

    @FindBy(id = "password")
    public WebElement userpasswordinputBox;

    @FindBy(xpath = "//div/input[@type='submit']")
    public WebElement submitButton;

    public void login(String username, String password){
        UsefulUtils.waitForClickablility(submitButton,5);
        userinputBox.sendKeys(username);
        userpasswordinputBox.sendKeys(password);
       submitButton.click();
        System.out.println("You were on the login page");

    }

    //It logs in with the valid credentials from configuration.properties
    public void login() {

        login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));


    }
}

