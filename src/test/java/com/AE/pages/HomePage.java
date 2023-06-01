package com.AE.pages;

import com.AE.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@class='fa fa-home']")
    public WebElement Home;

    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement SignupOrLogin;


}
