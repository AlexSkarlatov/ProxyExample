package com.skarlatov.chainofresponsibility.challenge;

public class Client {

    private static IssueRaiser ir;


    public static void setup(){
            ReceiverInterface faxHandler, emailHandler;
            emailHandler = new EmailErrorHandler();

            //faxhandler comes as first link in the chain
            faxHandler = new FaxErrorHandler();
            faxHandler.setNextChain(emailHandler);

            ir = new IssueRaiser(faxHandler);
    }
    public static void main(String[] args){
        System.out.println("*** chain of responsibilibty pattern demo");
        setup();
        ir.raiseMessage(new Message("Email", MessagePriority.Normal));

//        ir.setFirstReceiver(fax)

        Message m1 = new Message("Fax is reaching late to the destination", MessagePriority.Normal);
        Message m2 = new Message("Email is not going", MessagePriority.High);
        Message m3 = new Message("In Email, BCC field is disabled occasionally", MessagePriority.Normal);
        Message m4 = new Message("Fax is not reaching destination", MessagePriority.High);



        ir.raiseMessage(m1);
        ir.raiseMessage(m2);
        ir.raiseMessage(m3);
        ir.raiseMessage(m4);

    }


}
