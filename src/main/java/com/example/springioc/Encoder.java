package com.example.springioc;

import java.util.Base64;

public class Encoder {

    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public void setiEncoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return iEncoder.encode(message);
    }
}