package com.skarlatov.proxychallenge;

public class RealInternet implements InternetInterface{
    private String URLAddress;
    public RealInternet(){
    }
    public RealInternet(String address){
        this.URLAddress = address;
    }

    @Override
    public void connect() {
        System.out.println("I am connecting to "  + URLAddress);
    }
}
