package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private Person sean;
    private Person lucy;
    private String messageFromSean;

    @Given("Lucy is located {int} meters from Sean")
    public void lucy_is_located_meters_from_sean(Integer distance) {
        lucy = new Person();
        sean = new Person();
        lucy.moveTo(distance);
 //       throw new io.cucumber.java.PendingException();
    }
    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
       sean.shout(message);
      messageFromSean = message;
    }
    @Then("Lucy heard Sean's message")
    public void lucy_heard_sean_s_message() {
    assertEquals(asList(messageFromSean),lucy.getMessageHeard());
        throw new io.cucumber.java.PendingException();
    }

}
