package com.skarlatov.proxysolution;

public class Client {
    public static void main(String[] args){
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("jasonfedin.org");
            internet.connectTo("whatever.com");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
