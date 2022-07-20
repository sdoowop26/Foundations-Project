package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tester {

    // this class is going to be my Java version of my login homepage

    /*
     *  by defining what web elements we want to interact with here instead of in the steps themselves we avoid writing
     * "boilerplate"(redundant/repetitive) code.
     */
  
    private static final String descisionInput = null;

    public WebDriver driver;

    @FindBy(id = "defectId")
    public WebElement defectIdInput;


    @FindBy(id = "status")
    public WebElement statusInput;

    
    @FindBy(id = "number")
    public WebElement submitButton;

    
    public tester(WebDriver driver){
        

        /*
          The PageFactory class is provided by Selenium and it abstracts away from us the code that handles initializing our WebElement fields. We simply provide the initElements() method with the private driver
          we initilized above, and the PageFactory class handles the rest!
         */
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void enterDefectId(String defectId){
        this.defectIdInput.sendKeys(defectId);

        }
        
        public void enterDescision(String string) {
            this.descisionInput.sendKeys(descision);
        }

        

    public void clickButton(){
        this.submitButton.click();
    }

    

    public void descision() {
        this.descisionInput.sendKeys(descision);
    }
    
    

}

    

