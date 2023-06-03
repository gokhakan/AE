package com.AE.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleVignettePage extends HomePage{
    @FindBy(id = "dismiss-button")
    public WebElement Close;
}
