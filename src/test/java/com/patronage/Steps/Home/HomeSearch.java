package com.patronage.Steps.Home;

import com.patronage.Pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java8.En;

public class HomeSearch implements En {

    static
    {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\gohilukk\\Downloads\\chromedriver_win33\\chromedriver.exe");
    }

    public HomeSearch() {
        WebDriver driver = new ChromeDriver(); //opens browser

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        After(Scenario -> {
            driver.quit(); //close browser
        });
        Given("^user is on home page$", () -> {
            driver.get("http://automationpractice.com/");
        });
        When("^user provide search phase$", () -> {
            homePage.getQueryTextBox().sendKeys("DRESSES");
            homePage.getButton().click();
        });
        Then("^user should see search results$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product-container")));

            Assert.assertEquals(false, driver.findElements(By.className("product-container")).isEmpty());
        });

        When("^user provide unknown search phase$", () -> {
            homePage.getQueryTextBox().sendKeys("unknown phase");
            homePage.getButton().click();
        });
        Then("^user should see no results$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-warning")));

            Assert.assertEquals(false, driver.findElements(By.className("alert-warning")).isEmpty());
        });

    }


}
