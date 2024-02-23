package io.cucumber.shouty;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
   private Person lucy;
   private Person sean;
   private Network network;
    private String messageFromSean;
    @Before
    public void createNetwork(){
        Network network = new Network();
    }

    @Given("{person} is located/standing {int} meter(s) from Sean")
    public void lucy_is_located_meters_from_sean(Person person,Integer distance) {
        person.setLocation(distance);
        System.out.println(person.getName(person));
        person.moveTo(distance);
    }

    @When("{person} shouts {string}")
    public void sean_shouts(Person person,String message) {
        person.shout(message);
        messageFromSean = message;
        System.out.println(asList(messageFromSean));
        System.out.println(person.getName(person));
    }

    @Then("Lucy heard Sean's message")
    public void lucy_heard_sean_s_message() {
        assertEquals(asList(messageFromSean), lucy.getMessageHeard());
        System.out.println(lucy.getMessageHeard());
    }

   @Then("Lucy heard new Sean's message")
    public void lucyHeardNewSeanSMessage() {
        assertEquals(asList(messageFromSean), lucy.getNewMessageHeard());
        System.out.println(lucy.getNewMessageHeard());
    }

    @Given("a person named Lucy")
    public void aPersonNamedLucy() {

    }

    @And("a person named Sean")
    public void aPersonNamedSean() {

    }
}