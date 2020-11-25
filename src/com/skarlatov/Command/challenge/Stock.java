package com.skarlatov.Command.challenge;


//receiver class
public class Stock {
    private String name = "google";
    private int quantity = 1000;

    public Stock(){

    }
    public Stock(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public void sell(){
        System.out.println("Selling Stock:  [  " + name + ",  quantity = " + quantity + "  ]");
    }
    public void buy(){
        System.out.println("Buying Stock:  [  " + name + ",  quantity = " + quantity + "  ]");
    }
}
