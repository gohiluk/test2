package com.patronage.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.patronage.Pages.GooglePage;

import cucumber.api.Scenario;
import cucumber.api.java8.En;

public class GoogleSearch implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "google.com";
    GooglePage gp = PageFactory.initElements(driver, GooglePage.class);

    public GoogleSearch() {
        After(Scenario -> {
            driver.quit();
        });
        Given("^user is on start page$", () -> {
            driver.get("http://" + baseUrl);
        });
        When("^user provide search phase$", () -> {
            gp.getQueryTextBox().sendKeys("INTIVE");
            gp.getButton().click();
        });
        Then("^user should see search results$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("g")));

            Assert.assertEquals(false, driver.findElements(By.className("g")).isEmpty());
        });}


}
