package io.cucumber.shouty;

import io.cucumber.java.ParameterType;

public class ParameterTypes {
    @ParameterType("Sean|Lucy")
    public Person person(String name){
        return new Person(name);
    }
}
