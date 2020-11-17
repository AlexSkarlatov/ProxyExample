package com.skarlatov.proxychallenge;


import com.skarlatov.proxysolution.Internet;

/*
this is my solution to the class assignment
 */
public class Client {
    public static void main(String[] args){


        InternetInterface internetInterface = new ProxyInternet();
        try {
            internetInterface.connect("alex.com.net.gov");
            internetInterface.connect("yup.com");

//            internet.connectTo("jasonfedin.org");
//            internet.connectTo("whatever.com");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
