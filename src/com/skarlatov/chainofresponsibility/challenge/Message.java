package com.skarlatov.chainofresponsibility.challenge;


enum MessagePriority{
    Normal,
    High
}

public class Message {
    public String text;
    public MessagePriority priority;


    public Message(String text, MessagePriority mp){
        this.text = text;
        priority = mp;
    }
}
