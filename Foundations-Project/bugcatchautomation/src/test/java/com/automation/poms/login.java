package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// this class is going to be my Java version of my login homepage
public class login {

    /*
     *  by defining what web elements we want to interact with here instead of in the steps themselves we avoid writing
     * "boilerplate"(redundant/repetitive) code.
     */
  
    public WebDriver driver;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "btn")
    public WebElement submitButton;

    public login(WebDriver driver){
        

        /*
          The PageFactory class is provided by Selenium and it abstracts away from us the code that handles initializing our WebElement fields. We simply provide the initElements() method with the private driver
          we initilized above, and the PageFactory class handles the rest!
         */
        PageFactory.initElements(driver,this);

    }

    public void enterUsername(String username){
           this.usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        this.passwordInput.sendKeys(password);
    }

    public void clickButton(){
          this.submitButton.click();
    }
}
