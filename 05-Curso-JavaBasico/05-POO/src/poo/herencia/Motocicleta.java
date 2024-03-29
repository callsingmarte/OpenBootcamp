package poo.herencia;

import poo.clases.Vehiculo;
import poo.clases.Motor;

/**
 * Clase derivada o clase hija o subclase
 */
public class Motocicleta extends Vehiculo {
    boolean baul;

    public Motocicleta(){}
    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor){
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.baul = baul;
    }

}
