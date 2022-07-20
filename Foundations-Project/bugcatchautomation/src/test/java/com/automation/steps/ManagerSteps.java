package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerSteps {

    @Given("the manager is on custom homepage")
public void the_manager_is_on_custom_homepage() {
    TestRunner.driver.get("File://C:/Users/tareka/Desktop/First-Project/Foundations-Project/bugcatchautomation/src/test/resources/web-pages/Manager.html");
}

@When("the manager enters a tester name")
public void the_manager_enters_a_tester_name() {
    TestRunner.Manager.testerNames;
    ((Object) TestRunner.Manager).entertesterNames("PersonTwo");
}

@When("the manager enters a defect")
public void the_manager_enters_a_defect() {
    TestRunner.Manager.entersDefect;
    ((Object) TestRunner.Manager).entersDefect("Casey Jones needs help");
}



@Then("the manager will get an alert defect assigned")
public void the_manager_will_get_an_alert_defect_assigned() {
    TestRunner.Manager.clickButton();
    TestRunner.wait.until(ExpectedConditions.titleIs("Turtle Bros Inc Tester Page"));
    String title = TestRunner.driver.getTitle();
    Assert.assertEquals("Turtle Bros Inc Tester Page", title);
}
}



    

