package com.patronage.Steps.Login;


import com.patronage.Pages.HomePage;
import com.patronage.Pages.LoginPage;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps implements En
{


    static
    {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\gohilukk\\Downloads\\chromedriver_win33\\chromedriver.exe");
    }

    public LoginSteps() {
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);


        After(Scenario -> {
            driver.quit();
        });
        Given("^user is on login page$", () -> {
            driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        });
        When("^user provide correct (.+) and (.+)", (String login, String password) -> {
            loginPage.getEmailTextBox().sendKeys(login);
            loginPage.getPasswordTextBox().sendKeys(password);
            loginPage.getButtonSignIn().click();
        });
        Then("^user should be logged in$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("myaccount-link-list")));

            Assert.assertEquals(false, driver.findElements(By.className("myaccount-link-list")).isEmpty());
        });

        When("^user provide wrong (.+) and (.+)", (String login, String password) -> {
            loginPage.getEmailTextBox().sendKeys(login);
            loginPage.getPasswordTextBox().sendKeys(password);
            loginPage.getButtonSignIn().click();
        });
        Then("^user shouldn't be logged in$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-danger")));

            Assert.assertEquals(false, driver.findElements(By.className("alert-danger")).isEmpty());
        });

    }
}
