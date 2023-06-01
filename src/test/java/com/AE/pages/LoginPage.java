package com.AE.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends HomePage {
    @FindBy(xpath = "//*[@class='signup-form']")
    public WebElement NewUserSignup;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement Name;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement SignupEmailAddress;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement Signup;
}
