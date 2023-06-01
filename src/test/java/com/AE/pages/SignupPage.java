package com.AE.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends HomePage {
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/h2/b")
    public WebElement EnterAccountInformation;
    @FindBy(id = "id_gender1")
    public WebElement Mr;
    @FindBy(id = "id_gender2")
    public WebElement Mrs;
    @FindBy(id = "password")
    public WebElement Password;
    @FindBy(id = "days")
    public WebElement Day;
    @FindBy(id = "months")
    public WebElement Month;
    @FindBy(id = "years")
    public WebElement Year;
    @FindBy(id = "newsletter")
    public WebElement SignUpForOurNewsletter;
    @FindBy(id = "optin")
    public WebElement ReceiveSpecialOffersFromOurPartners;
    @FindBy(id = "first_name")
    public WebElement FirstName;
    @FindBy(id = "last_name")
    public WebElement LastName;
    @FindBy(id = "company")
    public WebElement Company;
    @FindBy(id = "address1")
    public WebElement Address;
    @FindBy(id = "address2")
    public WebElement Address2;
    @FindBy(id = "country")
    public WebElement Country;
    @FindBy(id = "state")
    public WebElement State;
    @FindBy(id = "city")
    public WebElement City;
    @FindBy(id = "zipcode")
    public WebElement Zipcode;
    @FindBy(id = "mobile_number")
    public WebElement MobileNumber;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement CreateAccount;


}
