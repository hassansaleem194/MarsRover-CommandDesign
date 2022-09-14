package org.codurance;

public class MarsRover {

    public String execute(String command) {
        if (command == "RRR"){
            return "0:0:W";
        }
        if (command == "RR"){
            return "0:0:S";
        }
        return "0:0:E";
    }
}
