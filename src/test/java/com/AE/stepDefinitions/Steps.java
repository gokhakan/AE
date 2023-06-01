package com.AE.stepDefinitions;

import com.AE.pages.*;
import com.AE.utilities.BrowserUtils;
import com.AE.utilities.ConfigurationReader;
import com.AE.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Steps {
    Logger logger = Logger.getLogger(Steps.class.getName());
    Faker faker = new Faker();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("user is on home page")
    public void user_is_on_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));

        //Verify that home page is visible
        assertEquals("Automation Exercise", Driver.get().getTitle());
        logger.info("Test page is correct.");

    }

    @When("user clicks {string}")
    public void user_clicks(String menuItem) {
        switch (menuItem) {
            case "Signup/Login":
                homePage.SignupOrLogin.click();
                logger.info("User is on New User Signup page");
                break;
            case "Signup":
                loginPage.Signup.click();
                break;
            case "Sign up for our newsletter":
                JavascriptExecutor js = (JavascriptExecutor) Driver.get();
                js.executeScript("window.scrollBy(0,250)", "");
                signupPage.SignUpForOurNewsletter.click();
                break;
            case "Receive special offers from our partners":
                signupPage.ReceiveSpecialOffersFromOurPartners.click();
                break;
            case "Create Account":
                signupPage.CreateAccount.click();
                break;
            case "Continue":
                accountCreatedPage.Continue.click();
                break;
            default:
                logger.warning("No menu item selected");

        }
    }

    @Then("user sees {string}")
    public void user_sees(String message) {
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
                assertEquals(ConfigurationReader.get("name"), logoutPage.user.getText());
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
                loginPage.SignupEmailAddress.sendKeys(faker.internet().emailAddress());
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
            default:
                logger.warning("No field data entered");

        }
    }


}
