package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactoryFinder;


public class PageFactory {

public PageFactory() {



}
    @FindBy(xpath = "//input[@value='radio1']")
    public WebElement radiobtn1;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement nameTxtBox;
}
