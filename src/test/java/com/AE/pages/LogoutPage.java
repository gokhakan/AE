package com.AE.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends HomePage {
    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement user;
    @FindBy(xpath = "//div[@class='row']")
    public WebElement Header;

}
