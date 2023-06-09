package com.socket.app.hello;

/**
 * Created by Elimane on Dec, 2017, at 07:47
 */
//resource representation class
//The service will accept messages containing a name in a STOMP message whose body is a JSON object.
public class HelloMessage {

    private String name;

    public HelloMessage(String name) {
        this.name = name;
    }

    public HelloMessage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
