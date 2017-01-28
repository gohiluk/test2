package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.ID_OR_NAME, using = "SubmitLogin")
    private WebElement buttonSignIn;

    @FindBy(how = How.ID_OR_NAME, using = "email")
    private WebElement emailTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    private WebElement passwordTextBox;


    public WebElement getButtonSignIn() {
        return buttonSignIn;
    }

    public WebElement getEmailTextBox() {
        return emailTextBox;
    }

    public WebElement getPasswordTextBox() {
        return passwordTextBox;
    }
}
