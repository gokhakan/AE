package com.AE.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends HomePage {
    @FindBy(xpath = "//h2[@data-qa='account-created']")
    public WebElement AccountCreated;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement Continue;

}
