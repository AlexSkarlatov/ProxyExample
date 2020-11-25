package com.skarlatov.chainofresponsibility.challenge;

public class IssueRaiser {


    public ReceiverInterface setFirstReceiver;


    public IssueRaiser(ReceiverInterface setFirstReceiver){
        this.setFirstReceiver = setFirstReceiver;
    }


    public void raiseMessage(Message message){
        if (setFirstReceiver != null)
            setFirstReceiver.processMessage(message);
    }

}
