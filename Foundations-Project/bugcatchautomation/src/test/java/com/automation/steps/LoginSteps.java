package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    /*
     * user agnostic steps
     */

    @Given("the employee is on the login page")
    public void the_employee_is_on_the_login_page() {
        TestRunner.driver.get(
                "File://C:/Users/tareka/Desktop/First-Project/Foundations-Project/bugcatchautomation/src/test/resources/web-pages/login.html");
    }

    @When("the employee clicks the submit button")
    public void the_employee_clicks_the_submit_button() {
        TestRunner.login.clickButton();
    }

    /*
     * manager steps
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
        Assert.assertEquals("Turtle Bros Inc Tester Page", title);
    }



    @Given("the manager is on custom homepage")
    public void the_manager_is_on_custom_homepage() {
        TestRunner.driver.get(
                "File://C:/Users/tareka/Desktop/First-Project/Foundations-Project/bugcatchautomation/src/test/resources/web-pages/Manager.html");
    }

    @When("the manager enters a tester name")
    public void the_manager_enters_a_tester_name() {
        TestRunner.manager.enterTesternames("PersonTwo");
    }

    @When("the manager enters a defect")
    public void the_manager_enters_a_defect() {
        TestRunner.manager.enterDefect("Casey Jones needs help");
    }

    @Then("the manager will get an alert defect assigned")
    public void the_manager_will_get_an_alert_defect_assigned() {
        // TestRunner.wait.until(ExpectedConditions.titleIs("Turtle Bros Inc Manager
        // Page"));
        // String title = TestRunner.driver.getTitle();
        // Assert.assertEquals("Turtle Bros Inc Manager Page", title);
        boolean alertExists;
        if (TestRunner.wait.until(ExpectedConditions.alertIsPresent()) == null) {
            alertExists = false;
        } else {
            alertExists = true;
            Alert alert = TestRunner.driver.switchTo().alert();
            alert.accept();
        }

    }

    @When("the menager clicks the submit button")
    public void the_menager_clicks_the_submit_button() {
        TestRunner.manager.clickButton();
    }

    /*
      tester steps
     */

    @Given("the tester is on custom homepage")
    public void the_tester_is_on_custom_homepage() {
        TestRunner.driver.get(
                "File://C:/Users/tareka/Desktop/First-Project/Foundations-Project/bugcatchautomation/src/test/resources/web-pages/Manager.html");
    }

    @When("the tester enters a defectId")
    public void the_tester_enters_a_defectId() {
        TestRunner.tester.enterDefectId("39948");
    }

    @When("the tester enters descision")
public void the_tester_enters_descision() {
    TestRunner.tester.enterDescision("Accepted");
}

    @Then("the tester will get an alert cowabunga dude!")
    public void the_tester_will_get_an_alert_cowabunga_dude() {
        boolean alertExists;
        if (TestRunner.wait.until(ExpectedConditions.alertIsPresent()) == null) {
            alertExists = false;
        } else {
            alertExists = true;
            Alert alert = TestRunner.driver.switchTo().alert();
            alert.accept();
        }
    }


@When("the tester clicks  the submit button")
public void the_tester_clicks_the_submit_button() {
    TestRunner.tester.clickButton();
}

@Then("the descision will be updated")
public void the_descision_will_be_updated() {
    TestRunner.tester.descision();
}
}

        
    




