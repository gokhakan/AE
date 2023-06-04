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

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement Logout;

    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    public WebElement DeleteAccount;
    @FindBy(id = "dismiss-button")
    public WebElement Close;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]")
    public WebElement LogedinAs;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement LogedinAsinLogin;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement LoginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement LoginPassword;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement Login;

    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement YourEmailOrPasswordIsIncorrect;
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    public WebElement LoggedInAsCorrectUser;

    @FindBy(xpath = "//i[@class='fa fa-envelope']")
    public WebElement ContactUs;

    public void closePopupWindow() {
        Close.click();
    }


}
