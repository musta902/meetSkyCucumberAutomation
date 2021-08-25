package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import com.meetSky.utilities.UsefulUtils;
import org.junit.Assert;

public abstract class BasePage {



    public  void AssertContainsMeth(String expected){

        UsefulUtils.waitFor(8);
        System.out.println(Driver.get().getTitle());
        String actual = Driver.get().getTitle();
        Assert.assertTrue(actual.contains(expected));

    }
}
