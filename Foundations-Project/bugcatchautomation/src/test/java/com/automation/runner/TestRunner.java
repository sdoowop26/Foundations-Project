package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.poms.login;
import com.automation.poms.manager;
import com.automation.poms.tester;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com/automation/steps"
)
public class TestRunner {

    
    public static manager manager;
    public static tester tester;
    public static WebDriver driver;
    public static login login;
    public static WebDriverWait wait;
    
    
    
    
    

    @BeforeClass
    public static void setup(){
       System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
       driver = new ChromeDriver();
       login = new login(driver);
       manager = new manager(driver);
       tester = new tester(driver);
       wait = new WebDriverWait(driver,5);
    }

    @AfterClass
    public static void teardown(){
        driver.quit();

    }
    
}
