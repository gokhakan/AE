package com.AE.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails1Page extends HomePage{
    @FindBy(xpath = "//h2[text()='Blue Top']")
    public WebElement BlueTop;
    @FindBy(xpath = "//p[text()='Category: Women > Tops']")
    public WebElement Category;
    @FindBy(xpath = "//span[text()='Rs. 500']")
    public WebElement Price;

}
