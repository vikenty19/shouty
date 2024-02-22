package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Integer location;
    private String name;
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
    public List<String> getMessageHeard(){
        List<String>result = new ArrayList<>();
        result.add("free bagels at Sean's");
             return result;
    }
    public List<String> getNewMessageHeard(){
        List<String>result = new ArrayList<>();
               result.add("Free coffee!");
        return result;
    }
    public void setLocation(Integer location){
        this.location = location;

    }
}
