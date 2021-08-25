package com.meetSky.pages;

import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import com.meetSky.utilities.UsefulUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkFunctionaltyPage extends BasePage{


    public TalkFunctionaltyPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//li[@data-id='spreed'])[1]")

    public WebElement talkButton;

    public void clicktalkButton() {
        talkButton.click();
    }

    @FindBy(xpath = "//div/a[@class='app-navigation-toggle']")
    public WebElement burgerMenuButton;

    public void clickBergerMenuButton() {
        burgerMenuButton.click();
    }

    @FindBy(xpath = "//span[@class='material-design-icon plus-icon']")
    public WebElement plusSignButton;

    public void clickPlusSignButton() {
        UsefulUtils.waitForClickablility(plusSignButton, 5);
        UsefulUtils.clickWithJS(plusSignButton);
    }

    @FindBy(xpath = "//div/input[@class='conversation-name']")
    public WebElement searchBox;

    public void sendsearchBox(String conversationName) {
        UsefulUtils.waitFor(5);
        searchBox.click();
        searchBox.sendKeys(ConfigurationReader.get("Conversation_Name"));
    }
    @FindBy(xpath = "//div/button[@class='navigation__button navigation__button-right primary']")
    public WebElement addParticipantButton;

    public void clickAddParticipantButton(){
        UsefulUtils.waitFor(5);
        addParticipantButton.click();
    }
    @FindBy(xpath = "//div/span[.='Employee10']")
    public WebElement Employee10;

    public void clickEmployee10() {
        UsefulUtils.waitFor(5);
       UsefulUtils.clickWithJS(Employee10);
    }
    @FindBy(xpath = "//div/button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConversationButton;

    public void clickCreateConversationButton() {
        UsefulUtils.waitFor(5);
        UsefulUtils.clickWithJS(createConversationButton);
    }
@FindBy(css = ".conversations")

    public WebElement allConversations;

    public void getAllConversations(){
        UsefulUtils.waitFor(5);
        allConversations.isDisplayed();
        Assert.assertTrue("verify that is displayed",allConversations.isDisplayed());
    }

    @FindBy(xpath = "//span[@class='icon icon-start-call']")
    public WebElement videoCallButton;

    @FindBy(xpath = "//div[@id='videos']")
    public WebElement getScreen;



    public void getvideoCallScreen() {
        UsefulUtils.waitFor(5);
        getScreen.isDisplayed();
        Assert.assertTrue("verify that is displayed", getScreen.isDisplayed());
    }
    public void videoCallButtonClick() {
        UsefulUtils.waitFor(3);
        videoCallButton.click();
    }
   @FindBy(xpath = "//button[@class='top-bar__button error top-bar__button']")
    public WebElement leaveCallButton;

    public void leaveCallButtonClick() {
        UsefulUtils.waitForClickablility(leaveCallButton, 5);
        leaveCallButton.click();
    }

    public void getvideoCallScreen2() {
        UsefulUtils.waitFor(5);
        videoCallButton.isDisplayed();
        Assert.assertTrue("verify that is displayed", videoCallButton.isDisplayed());
    }



}




