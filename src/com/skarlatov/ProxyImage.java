package com.skarlatov;

import java.lang.reflect.Proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        //just a middleman intermediar that skips certain steps if needed
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
