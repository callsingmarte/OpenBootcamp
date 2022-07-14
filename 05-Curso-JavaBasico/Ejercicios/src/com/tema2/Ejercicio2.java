package com.tema2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el precio del producto sin IVA");
        float precio = scanner.nextFloat();
        System.out.println("Precio con IVA: " + calculatePriceWithIva(precio));
    }
    private static float calculatePriceWithIva(float price) {
        //El IVA general en españa es del 21%
        float iva = 21;
        return price + (price * iva / 100);
    }
}
