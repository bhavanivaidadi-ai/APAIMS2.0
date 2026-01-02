package StepDefinition;

import PageClasses.LoginPage;
import driver.WebDriverInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    LoginPage loginPage = new LoginPage(WebDriverInitializer.getDriver());

    @Given("the user is on the website login page")
    public void User_is_in_login_page(){
        loginPage.navigate_loginPage();
    }

    @When("the user enters a valid username {string} and password {string}")
    public void user_enters_credentials(String UserName, String PassWord){
        loginPage.UserName(UserName);
        loginPage.PassWord(PassWord);

    }

    @And("the user clicks on the login button")
    public void user_clicks_login_btn(){
        loginPage.Login();
    }

    @Then("the user should be logged in successfully")
    public void user_login_done_successfully(){
        loginPage.ValidationOfSuccess();
    }



}
