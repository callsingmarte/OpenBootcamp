package com.tema4;

public class SmartWatch extends SmartDevice{
    boolean analog;
    public SmartWatch(){}

    public SmartWatch(String brand, double price, boolean analog){
        super(brand, price);
        this.analog = analog;
    }
}
