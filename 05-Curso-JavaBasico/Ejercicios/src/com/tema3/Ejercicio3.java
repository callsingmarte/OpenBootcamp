package com.tema3;

public class Ejercicio3 {
    public static void main(String[] args){
        String [] nombres = {"Paco", "Pepe", "Tomas", "Pablo"};
        String nombresConcatenados = "";
        for(int i = 0; i < nombres.length; i++){
            nombresConcatenados += " " + nombres[i];
        }
        nombresConcatenados = nombresConcatenados.trim();
        System.out.println(nombresConcatenados);
    }
}
