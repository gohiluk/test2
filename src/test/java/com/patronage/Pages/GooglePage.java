package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GooglePage {

    @FindBy(how = How.NAME, using = "q")
    private WebElement queryTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "logocont")
    private WebElement logo;

    @FindBy(how = How.ID_OR_NAME, using = "btnG")
    private WebElement button;

    @FindBy(how = How.LINK_TEXT, using = "intive. We turn ideas into digital reality.")
    private WebElement intiveLink;


    public WebElement getQueryTextBox() {
        return queryTextBox;
    }
    public WebElement getLogo() {
        return logo;
    }
    public WebElement getButton() {
        return button;
    }
    public WebElement getIntiveLink() {
        return intiveLink;
    }
}
