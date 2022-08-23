package com.tema4;

public class Main {
    public static void main(String[] args){
        SmartPhone xiaomiPhone = new SmartPhone("Xiaomi", 300, "Android");
        System.out.println("SmartPhone Xiaomi");
        System.out.println("-------------------------------");
        System.out.println("Brand: " + xiaomiPhone.brand);
        System.out.println("Price: " + xiaomiPhone.price);
        System.out.println("Os: " + xiaomiPhone.os);
        System.out.println("------------------------------- \n");

        SmartWatch appleWatch = new SmartWatch("Apple", 900, false);
        System.out.println("SmartWatch AppleWatch");
        System.out.println("-------------------------------");
        System.out.println("Brand: " + appleWatch.brand);
        System.out.println("Price: " + appleWatch.price);
        System.out.println("analog: " + appleWatch.analog);
    }
}
