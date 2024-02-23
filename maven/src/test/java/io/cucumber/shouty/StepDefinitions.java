package io.cucumber.shouty;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
   private Person lucy;
   private Person sean;
   private Network network;
    private String messageFromSean;
    private HashMap<String,Person> people;
    @Before
    public void createNetwork(){
        network = new Network();
       people  = new HashMap<>();
    }
    @Given("a person named {word}")
    public void aPersonName(String name) {
        people.put(name,new Person(network));
    }


    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
       people.get("Sean").shout(message);
        messageFromSean = message;
        System.out.println(asList(messageFromSean));

    }

    @Then("Lucy should hear Sean's message")
    public void lucy_heard_sean_s_message() {
        assertEquals(asList(messageFromSean), people.get("Lucy").getMessageHeard());
        System.out.println(people.get("Lucy").getMessageHeard());
    }

}
