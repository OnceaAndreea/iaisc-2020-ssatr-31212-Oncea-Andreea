package com.ssatr;

public class CapsuleA {

    private String messageToSend;

    public void setMessageToSend(String message){
        messageToSend = message;
    }

    public void StateMachineA(Port1 p){
        p.setMessage(messageToSend);
    }
}
