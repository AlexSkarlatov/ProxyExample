package com.skarlatov.proxychallenge;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements InternetInterface{
    private String[] x = new String[22];
    private static ArrayList<String> banned = new ArrayList<>();
    private RealInternet realInternet;
    private String destination;

    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("whatever.com");
        bannedSites.add("nope.com");
        bannedSites.add("yup.com");
        bannedSites.add("hello.com");
        banned.add("whatever.com");
        banned.add("nope.com");
        banned.add("yup.com");
        banned.add("hello.com");
    }
    public ProxyInternet(String[] x){
        this.x = x;
    }
    public ProxyInternet( String destination){
//        this.x = x;
//        banned = listOfBanned;
        this.destination = destination;
    }

    public void useConnect(String address) throws Exception {
        connect();
    }
    public boolean destinationIsBanned(){
        for (String unit : banned
             ) {
            if(unit.equalsIgnoreCase(destination)){
                return true;
            }
        }
        return false;
    }
    @Override
    public void connect() throws Exception {
        if(realInternet == null ){
            realInternet = new RealInternet(destination);
            if(destinationIsBanned()){
                throw new Exception("this destination is banned I will go no further");
//                System.out.println("this destination is banned I will go no further");
//                return;
            }
        }
        realInternet.connect();
    }
}
