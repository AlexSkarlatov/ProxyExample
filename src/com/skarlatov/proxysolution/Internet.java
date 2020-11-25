package com.skarlatov.proxysolution;

public interface Internet {
    public void connectTo(String serverHost) throws Exception;

}


class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Conntecting to " + serverHost);
    }
}