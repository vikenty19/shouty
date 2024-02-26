package io.cucumber.shouty;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
   private Person lucy;
   private Person sean;
   private static final int DEFAULT_RANGE = 100;
    private Network network = new Network(DEFAULT_RANGE);
    private String messageFromSean;
    private HashMap<String,Person> people;
    @Before
    public void createNetwork(){

       people  = new HashMap<String,Person>();
    }
    @Given("a person named {word} is located at {int}")
    public void a_person_named_is_located(String name, int location) throws Throwable {
        people.put(name, new Person(network, location));
    }
    @Given("the range is {int}")
    public void the_range_is(int range) throws Throwable {
        network = new Network(range);
    }

    @When("Sean shouts {string}")
    public void sean_shouts(String message) throws Throwable {
        people.get("Sean").shout(message);
        messageFromSean = message;
    }

    @Then("Lucy should hear Sean's message")
    public void lucy_heard_sean_s_message() {
        assertEquals(asList(messageFromSean), people.get("Lucy").getMessagesHeard());
        System.out.println(people.get("Lucy").getMessagesHeard());
    }


    @Then("Lucy should not hear Sean's message")
    public void lucyShouldNotHearSeanSMessage() {

    }
}
