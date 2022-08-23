package com.tema4;

public class SmartPhone extends SmartDevice{

    //Sistema operativo
    String os;
    public SmartPhone(){}
    public SmartPhone(String brand, double price, String os){
        super(brand, price);
        this.os = os;
    }

}
