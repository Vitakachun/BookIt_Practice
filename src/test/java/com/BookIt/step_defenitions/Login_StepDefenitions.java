package com.BookIt.step_defenitions;
import com.BookIt.pages.LoginPage;
import com.BookIt.utilities.BrowserUtils;
import com.BookIt.utilities.ConfigurationReader;
import com.BookIt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login_StepDefenitions {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("student is on the login page.")
    public void student_is_on_the_login_page() {

        String bookItUrl = ConfigurationReader.getProperty("URL");
        Driver.getDriver().get(bookItUrl);

    }


    @When("student login using {string} and {string}")
    public void student_login_using_and(String username , String password) {
        loginPage.login();

    }
    @When("dashboard should displayed {string}")
    public void dashboard_should_displayed(String expected)  {
        wait.until(ExpectedConditions.urlContains(expected));
        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertTrue(actualUrl.contains(expected));
    }

}
