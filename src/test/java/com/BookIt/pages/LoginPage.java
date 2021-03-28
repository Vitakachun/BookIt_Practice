package com.BookIt.pages;

import com.BookIt.utilities.ConfigurationReader;
import com.BookIt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;

    public void login(){
        emailInput.sendKeys(ConfigurationReader.getProperty("loginStudent"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        signInButton.click();
    }





}
