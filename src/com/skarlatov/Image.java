package com.skarlatov;

import java.nio.FloatBuffer;

public interface Image {
    void display();
}




class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(this.fileName);
        display();
    }
    public void loadFromDisk(String fn){
        System.out.println("I am currently loading " + fn);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

// the proxy will interact with the realsupbject and do some
// delegation and laod balancing and will implement interface identical
// to real subjec





