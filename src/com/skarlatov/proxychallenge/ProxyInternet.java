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

    public ProxyInternet() {

    }

    public void useConnect(String address) throws Exception {
        connect(address);
    }
    public boolean destinationIsBanned() {

        if (banned.contains(this.destination)) {
            return true;

//            return false;
        }
        return false;
    }
    @Override
    public void connect(String destination) throws Exception {
        this.destination = destination;
        if(banned.contains(this.destination))
            throw new Exception("this is not allowed website");

        if(realInternet == null ){
            realInternet = new RealInternet(destination);

//            if(destinationIsBanned()){
//                throw new Exception("this destination is banned I will go no further");
////                System.out.println("this destination is banned I will go no further");
////                return;
//            }
        }
        realInternet.connect(destination);
    }
}
