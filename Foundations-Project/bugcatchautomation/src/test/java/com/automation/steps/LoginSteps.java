package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {

    /*
      user agnostic steps
     */

    @Given("the employee is on the login page")
    public void the_employee_is_on_the_login_page() {
        TestRunner.driver.get("File://C:/Users/tareka/Desktop/First-Project/Foundations-Project/bugcatchautomation/src/test/resources/web-pages/login.html");}
    @When("the employee clicks the submit button")
public void the_employee_clicks_the_submit_button() {
    TestRunner.login.clickButton();
}


/*
  manager steps
 */
@When("the manager enters his correct username")
public void the_manager_enters_his_correct_username() {
    TestRunner.login.enterUsername("PersonOne");
}
@When("the manager enters his correct password")
public void the_manager_enters_his_correct_password() {
    TestRunner.login.enterPassword("Password");
}


@Then("the manager should be logged in to the manager home page")
public void the_manager_should_be_logged_in_to_the_manager_home_page() {
    TestRunner.wait.until(ExpectedConditions.titleIs("Turtle Bros Inc Manager Page"));

    String title = TestRunner.driver.getTitle();
    Assert.assertEquals("Turtle Bros Inc Manager Page", title);
}
    

/*
  tester steps
 */

@When("the tester enters his correct username")
public void the_tester_enters_his_correct_username() {
    TestRunner.login.enterUsername("PersonTwo");
}

@When("the tester enters his correct password")
public void the_tester_enters_his_correct_password() {
    TestRunner.login.enterPassword("Password");
}
@Then("the tester should be logged in to the tester home page")
public void the_tester_should_be_logged_in_to_the_tester_home_page() {
    TestRunner.wait.until(ExpectedConditions.titleIs("Turtle Bros Inc Tester Page"));
    String title = TestRunner.driver.getTitle();
    Assert.assertEquals("Turtle Bros Inc Tester Page",title);
}
 
}


