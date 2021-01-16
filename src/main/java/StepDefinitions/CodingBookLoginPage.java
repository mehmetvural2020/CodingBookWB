package StepDefinitions;

import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CodingBookLoginPage {
    private WebDriver driver;

    @Given("click on Login button on main page")
    public void clickOnLoginButtonOnMainPage() {
        driver = Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("https://codingbook.org/");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @And("type username or email")
    public void typeUsernameOrEmail() {
    }

    @And("type password")
    public void typePassword() {
    }

    @And("check the remember username checkbox")
    public void checkTheRememberUsernameCheckbox() {
    }

    @When("click on login button")
    public void clickOnLoginButton() {
    }

    @Then("verify success login")
    public void verifySuccessLogin() {
    }


}
