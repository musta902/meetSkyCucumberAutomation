package com.meetSky.stepdefinitions;

import com.meetSky.pages.LoginPage;
import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import com.meetSky.utilities.UsefulUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class BeforeAfterHooks {

    @Before
    public void setUp(){


        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();

        Driver.get().get(url);
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
        UsefulUtils.clickWithJS( new LoginPage().submitButton);



    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();

    }

}
