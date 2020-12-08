package com.ssatr;

public class Port1 implements Port {

    public String message;

    public Port1() {

    }
    public Port1(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
