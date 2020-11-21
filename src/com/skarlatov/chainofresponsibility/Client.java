package com.skarlatov.chainofresponsibility;

public class Client {
    private DispenseChain c1;


    public Client(){

        //initialize chain links or chain compbonents
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        DispenseChain c4 = new Dollar1Dispenser();

        // set the chain of respeonsibiltiy
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);

    }

    public static void main(String[] args){
        Client atmDispenser = new Client();// this code intitialize and constructs the chain
        while (true){

        }
    }
}
