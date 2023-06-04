package com.AE.stepDefinitions;

import com.AE.pages.*;
import com.AE.utilities.BrowserUtils;
import com.AE.utilities.ConfigurationReader;
import com.AE.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Steps {
    Logger logger = Logger.getLogger(Steps.class.getName());
    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) Driver.get();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    LogoutPage logoutPage = new LogoutPage();
    ContactUsPage contactUsPage = new ContactUsPage();

    String email = faker.internet().emailAddress();

    @Given("user is on home page")
    public void user_is_on_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().setPosition(new Point(70, 100)); //Moves test browser to the second screen

        //Verify that home page is visible
        assertEquals("Automation Exercise", Driver.get().getTitle());
        logger.info("Test page is correct.");

    }

    @When("user clicks {string}")
    public void user_clicks(String menuItem) throws InterruptedException {
        BrowserUtils.waitForPageToLoad(100);
        switch (menuItem) {
            case "Signup/Login":
                homePage.SignupOrLogin.click();
                logger.info("User is on New User Signup page");
                break;
            case "Signup":
                loginPage.Signup.click();
                break;
            case "Sign up for our newsletter":
                js.executeScript("window.scrollBy(0,250)", "");
                signupPage.SignUpForOurNewsletter.click();
                break;
            case "Receive special offers from our partners":
                signupPage.ReceiveSpecialOffersFromOurPartners.click();
                break;
            case "Create Account":
                js.executeScript("window.scrollBy(0,250)", "");
                signupPage.CreateAccount.click();
                break;
            case "Continue":
                Thread.sleep(10000);
                accountCreatedPage.Continue.click();
                Thread.sleep(10000);
                break;
            case "Delete account":
                homePage.DeleteAccount.click();
                break;
            case "Logout":
                Driver.get().navigate().back();
                accountCreatedPage.Continue.click();
                homePage.Logout.click();
                break;
            case "Login":
                homePage.Login.click();
                break;
            case "Contact us":
                homePage.ContactUs.click();
                break;
            case "Submit":
                js.executeScript("window.scrollBy(0,250)", "");
                contactUsPage.Submit.click();
                Alert alert = Driver.get().switchTo().alert();
                alert.accept();
                break;
            case "Home":
                homePage.Home.click();
                assertEquals("Automation Exercise - Contact Us", Driver.get().getTitle());
                break;
            case "Test Cases":
                homePage.TestCases.click();
                break;


            default:
                logger.warning("No menu item selected");

        }
    }

    @Then("user sees {string}")
    public void user_sees(String message) throws InterruptedException {
        switch (message) {
            case "New User Signup!":
                assertTrue(loginPage.NewUserSignup.isDisplayed());
                break;
            case "ENTER ACCOUNT INFORMATION":
                assertTrue(signupPage.EnterAccountInformation.isDisplayed());
                break;
            case "ACCOUNT CREATED":
                assertTrue(accountCreatedPage.AccountCreated.isDisplayed());
                break;
            case "userName":
                BrowserUtils.waitForPageToLoad(100);
                Driver.get().navigate().back();
                accountCreatedPage.Continue.click();
                assertTrue(homePage.LogedinAs.getText().contains(ConfigurationReader.get("name")));
                break;
            case "Loggedin userName":
//                assertTrue(homePage.LogedinAsinLogin.getText().contains(ConfigurationReader.get("name")));
                System.out.println(homePage.LogedinAsinLogin.getText());
                break;
            case "Your email or password is incorrect!":
                assertTrue(homePage.YourEmailOrPasswordIsIncorrect.isDisplayed());
                break;
            case "Logged in as correct name":
                assertEquals("Logged in as Hakan Gok", homePage.LoggedInAsCorrectUser.getText());
                break;
            case "Email Address already exist!":
                assertEquals("Email Address already exist!", signupPage.EmailAddressAlreadyExist.getText());
                break;
            case "Get In Touch":
                assertEquals("GET IN TOUCH", contactUsPage.GetInTouch.getText());
                break;
            case "Success! Your details have been submitted successfully":
                assertEquals("Success! Your details have been submitted successfully.", contactUsPage.SuccessYourDetailsHaveBeenSubmittedSuccessfully.getText());
                break;


            default:
                logger.warning("Message not displayed!");
        }
    }

    @Then("user enters {string}")
    public void user_enters(String fieldName) {
        BrowserUtils.waitForPageToLoad(100);
        switch (fieldName) {
            case "Name":
                loginPage.Name.sendKeys(ConfigurationReader.get("name"));
                break;
            case "Email":
                loginPage.SignupEmailAddress.sendKeys(email);
                break;
            case "Title":
                signupPage.Mr.click();
                break;
            case "Password":
                signupPage.Password.sendKeys(ConfigurationReader.get("password"));
                break;
            case "Birth day":
                Select birthDay = new Select(signupPage.Day);
                birthDay.selectByIndex(14);
                break;
            case "Birth month":
                Select birthMonth = new Select(signupPage.Month);
                birthMonth.selectByIndex(12);
                break;
            case "Birth year":
                Select birthYear = new Select(signupPage.Year);
                birthYear.selectByIndex(50);
                break;
            case "First name":
                signupPage.FirstName.sendKeys(ConfigurationReader.get("FirstName"));
                break;
            case "Last name":
                signupPage.LastName.sendKeys(ConfigurationReader.get("LastName"));
                break;
            case "Company":
                signupPage.Company.sendKeys(ConfigurationReader.get("Company"));
                break;
            case "Address":
                signupPage.Address.sendKeys(ConfigurationReader.get("Address"));
                break;
            case "Address2":
                signupPage.Address2.sendKeys(ConfigurationReader.get("Address2"));
                break;
            case "Country":
                Select country = new Select(signupPage.Country);
                country.selectByIndex(1);
                break;
            case "State":
                signupPage.State.sendKeys(ConfigurationReader.get("State"));
                break;
            case "City":
                signupPage.City.sendKeys(ConfigurationReader.get("City"));
                break;
            case "Zipcode":
                signupPage.Zipcode.sendKeys(ConfigurationReader.get("Zipcode"));
                break;
            case "Mobile number":
                signupPage.MobileNumber.sendKeys(ConfigurationReader.get("MobileNumber"));
                break;
            case "Login email":
                homePage.LoginEmail.sendKeys(email);
                break;
            case "Login password":
                homePage.LoginPassword.sendKeys(ConfigurationReader.get("password"));
                break;
            case "Incorrect login email":
                homePage.LoginEmail.sendKeys(ConfigurationReader.get("IncorrectLoginEmail"));
                break;
            case "Incorrect login password":
                homePage.LoginPassword.sendKeys(ConfigurationReader.get("IncorrectLoginPassword"));
                break;
            case "CorrectLoginEmail":
                signupPage.LoginEmail.sendKeys(ConfigurationReader.get("RegisteredLoginEmail"));
                break;
            case "CorrectLoginPassword":
                signupPage.LoginPassword.sendKeys(ConfigurationReader.get("RegisteredLoginPassword"));
                break;
            case "RegisteredUserName":
                loginPage.Name.sendKeys(ConfigurationReader.get("RegisteredUserName"));
                break;
            case "RegisteredLoginEmail":
                loginPage.SignupEmailAddress.sendKeys(ConfigurationReader.get("RegisteredLoginEmail"));
                break;
            case "Contact name":
                contactUsPage.Name.sendKeys(ConfigurationReader.get("RegisteredUserName"));
                break;
            case "Contact email":
                contactUsPage.Email.sendKeys(ConfigurationReader.get("RegisteredLoginEmail"));
                break;
            case "Subject":
                contactUsPage.Subject.sendKeys(contactUsPage.subject);
                break;
            case "Message":
                contactUsPage.Message.sendKeys(contactUsPage.message);
                break;

            default:
                logger.warning("No field data entered");

        }
    }

    @When("user clicks Logout after successful login")
    public void user_clicks_Logout_after_successful_login() {
        homePage.Logout.click();
    }

    @Then("user is on login page")
    public void user_is_on_login_page() {
        assertEquals("https://automationexercise.com/login", Driver.get().getCurrentUrl());
    }

    @Then("user uploads {string}")
    public void user_uploads(String fileName) {
        WebElement uploadFile = contactUsPage.ChooseFile;
        uploadFile.sendKeys("/Users/hakangok/IdeaProjects/AE/src/test/resources/TestData/basicFile.txt");
    }
    @Then("user is on {string} page")
    public void user_is_on_page(String pageName) {
        switch (pageName){
            case "Test Cases":
                assertEquals("Automation Exercise", Driver.get().getTitle());
                break;
            default:
                logger.warning("No page name entered");
        }
    }


}
