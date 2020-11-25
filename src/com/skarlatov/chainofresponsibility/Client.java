package com.skarlatov.chainofresponsibility;

import java.util.Scanner;

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
            int amt = 0;

            System.out.println("plz enter the amount of money to dispense");
            Scanner in = new Scanner(System.in);
            amt = in.nextInt();

            if(amt < 0){
                System.out.println("please enter an amount that is a multipel of 10");
                return;
            }
//            if(amt % 10 != 0){
//                System.out.println("please enter an amount that is a multipel of 10");
//                return;
//            }
            //proccess the request
            atmDispenser.c1.dispense(new Currency(amt));
        }
    }
}
