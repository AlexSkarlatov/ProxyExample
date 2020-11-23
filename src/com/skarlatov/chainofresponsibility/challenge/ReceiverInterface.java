package com.skarlatov.chainofresponsibility.challenge;

 interface ReceiverInterface {

    boolean processMessage(Message msg);
    void setNextChain(ReceiverInterface nextChain);
}

class EmailErrorHandler implements ReceiverInterface{

     ReceiverInterface nextSuccessor;

    @Override
    public boolean processMessage(Message msg) {
        if(msg.text.contains("Email")){
            System.out.println("EmailErrorHandler is now P" +
                    "rocessing a message:: " + msg.priority + "cont" +
                    "ent:  " + msg.text);
            return true;
        }
        else{
            if (nextSuccessor != null)
                nextSuccessor.processMessage(msg);
        }
        return false;
    }

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        nextSuccessor = nextChain;
    }
}

