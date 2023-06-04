package com.AE.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends HomePage{
    @FindBy(xpath = "//h2[text()='Get In Touch']")
    public WebElement GetInTouch;

    @FindBy (xpath = "//input[@data-qa='name']")
    public WebElement Name;

    @FindBy (xpath = "//input[@data-qa='email']")
    public WebElement Email;

    @FindBy (xpath = "//input[@data-qa='subject']")
    public WebElement Subject;

    @FindBy (id="message")
    public WebElement Message;

    public String subject = "General enquiry";
    public String message = " Hi automation Exercise. You are absolutely amazing!";

    @FindBy (xpath = "//input[@name='upload_file']")
    public WebElement ChooseFile;
    @FindBy(xpath = "//input[@data-qa='submit-button']")
    public WebElement Submit;
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement SuccessYourDetailsHaveBeenSubmittedSuccessfully;






}
