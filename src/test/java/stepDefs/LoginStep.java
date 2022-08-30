package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.LoginPage;
import pages.UserCoursesPage;
import utilies.ConfigReader;
import utilies.Driver;

import java.time.Duration;

public class LoginStep {

    LoginPage loginPage = new LoginPage();
    UserCoursesPage userCoursesPage = new UserCoursesPage();

    @Given("i am on login page")
    public void i_am_on_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("campusTechnoStudyURL"));
    }
    @Given("i accept cookies")
    public void i_accept_cookies() {
        loginPage.acceptCookies.click();
    }
    @When("i enter userEMail")
    public void i_enter_user_e_mail() {
        loginPage.userName.sendKeys(ConfigReader.getProperty("userEMail"));
    }
    @When("i enter UserPassword")
    public void i_enter_user_password() {
        loginPage.password.sendKeys(ConfigReader.getProperty("userPassword"));
    }
    @When("i click button")
    public void i_click_button() {
        loginPage.loginButton.click();
    }
    @Then("i am on user courses page")
    public void i_am_on_user_courses_page() {
        Assert.assertTrue(userCoursesPage.bigAvatar.isDisplayed());
        Driver.closeDriver();
    }

    @When("i enter user {string}")
    public void i_enter_user(String string) {
        loginPage.userName.sendKeys(string);
    }
    @When("i enter user password {string}")
    public void i_enter_user_password(String string) {
        loginPage.password.sendKeys(string);
    }

    @Then("i should be able to see Invalid username or password")
    public void i_should_be_able_to_see_invalid_username_or_password() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(loginPage.invalidMessage));
        Assert.assertEquals(loginPage.invalidMessage.getText(),"Invalid username or password");
        Driver.closeDriver();
    }



}
