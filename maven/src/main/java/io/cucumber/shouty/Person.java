package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final List<String> messagesHeard = new ArrayList<String>();
    private  Network network;
    private Integer location;
    private String name;
    public Person(Network network) {
        this.network = network;
        network.subscribe(this);
    }

    public Person(String name_){
        this.name = name_;
    }
public String getName(Person person){
        return this.name;

}
    public void moveTo(int distance){


    }

    public void shout(String message) {
    }
    public void hear(String message){
        messagesHeard.add(message);

    }
    public List<String> getMessageHeard(){

             return messagesHeard;
    }

    public List<String> getNewMessageHeard(){
        List<String>result = new ArrayList<>();
        result.add("free bagels at Sean's");
        return result;
    }
    public void setLocation(Integer location){
        this.location = location;

    }
}
