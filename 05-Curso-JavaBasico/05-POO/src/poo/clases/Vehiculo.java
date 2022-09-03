package poo.clases;

/**
 * Ckase base
 */
public class Vehiculo {
    //1.atributos
    protected String fabricante;
    protected String modelo;
    protected Double cc;
    protected int year;
    protected boolean sport;
    protected int speed;

    protected Motor motor;
    //2.constructores
    public Vehiculo(){

    }
    //Aqui estamos sobrecargando un metodo
    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }
    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    //3.métodos (comportamiento)
    public void acelerar(int quantity){
        this.speed += quantity;
    }
    //getter y setter

}
