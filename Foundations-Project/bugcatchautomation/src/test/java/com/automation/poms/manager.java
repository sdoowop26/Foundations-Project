package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class manager {

    // this class is going to be my Java version of my login homepage

    /*
     *  by defining what web elements we want to interact with here instead of in the steps themselves we avoid writing
     * "boilerplate"(redundant/repetitive) code.
     */
  
    public WebDriver driver;

    @FindBy(id = "testerNames")
    public WebElement testernamesInput;

    @FindBy(id = "defectId")
    public WebElement defectIdInput;

    @FindBy(id = "submit")
    public WebElement submitButton;

    public manager(WebDriver driver){
        

        /*
          The PageFactory class is provided by Selenium and it abstracts away from us the code that handles initializing our WebElement fields. We simply provide the initElements() method with the private driver
          we initilized above, and the PageFactory class handles the rest!
         */
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void enterTesternames(String testernames){
           this.testernamesInput.sendKeys(testernames);
    }

    public void enterDefect(String defect){
        this.defectIdInput.sendKeys(defect);

        }  

    public void clickButton(){
        this.submitButton.click();
    }
    
    

}




    