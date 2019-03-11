package com.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
public class featureSteps {

    static Logger log = Logger.getLogger(featureSteps.class);

@Given("^I have a username and password$")
    public void i_have_a_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
    System.out.println("Given--");
    }


    @When("^I have entered a credentials$")
    public void i_have_entered_a_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When--");
        log.info("This is for testing");
    }

    @Then("^I logged in successfully$")
    public void i_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then--");
    }

}
