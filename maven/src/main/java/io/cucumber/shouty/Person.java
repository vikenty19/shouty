package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final List<String> messagesHeard = new ArrayList<>();
    private  Network network;
    private Integer location;
    private String name;
    public Person(Network network) {
        this.network = network;
        network.subscribe(this);
    }


public String getName(Person person){
        return this.name;

}
    public void moveTo(int distance){


    }

    public void shout(String message) {
        network.broadcast(message);
    }
    public void hear(String message){
        messagesHeard.add(message);

    }
    public List<String> getMessageHeard(){

             return messagesHeard;
    }


    public void setLocation(Integer location){
        this.location = location;

    }
}
