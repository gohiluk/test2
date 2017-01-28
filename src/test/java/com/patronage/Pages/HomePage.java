package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.NAME, using = "search_query")
    private WebElement queryTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "submit_search")
    private WebElement button;

    public WebElement getQueryTextBox() {
        return queryTextBox;
    }
    public WebElement getButton() {
        return button;
    }

}
