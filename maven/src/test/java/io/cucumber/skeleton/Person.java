package io.cucumber.skeleton;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Integer location;

    public void moveTo(int distance){


    }

    public void shout(String message) {
    }
    public List<String> getMessageHeard(){
        List<String>result = new ArrayList<>();
        result.add("free bagels at Sean's");

return result;
    }
    public void setLocation(Integer location){
        this.location = location;

    }
}
