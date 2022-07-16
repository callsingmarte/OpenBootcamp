# PROGRAMACION ORIENTADA A OBJETOS

Un objeto es una entidad que representa algo del mundo real.
Tienen propiedades y pueden tener métodos.

Los objetos segun el lenguaje de programación que utilizemos se declaran mediante clases o mediante funciones dentro de estructuras por ejemplo.


Las propiedades de una clase son variables

Ejemplo de un objeto en java:

	class Coche {
		int numeroDePuertas;
		int velocidadMaxima;
		float velocidadActual;
		
		public void acelerar(){
			velocidadActual++
		}
		
		public void decelerar(){
		
		}
	}


Ejemplo de instancia de un objeto en java:

	public class Main {
	
		public static void main(String[] args){
			//Asi se instancia un objeto
			Coche coche = new Coche();
			System.out.println(coche.velocidadActual);
			coche.acelerar();
			System.out.println(coche.velocidadActual);
			Coche coche2 = new Coche()
			System.out.println(coche2.velocidadActual);
		}
	}
	

## CONSTRUCTOR	

Es una forma de inicializar las propiedades de una clase cuando la instanciamos

Los constructores no devuelven ningun tipo de dato. Los constructores son publicos 

Ejemplo de constructor en java:
	
	class Coche {
		int numeroDePuertas;
		int velocidadMaxima;
		float velocidadActual;
		//Constructor
		public Coche(){
			numeroDePuertas = 2;
			velocidadMaxima = 120
		}
	}
	

Cuando se invoca a un objeto con new 
se esta llamando a su constructor. Ejemplo:
	 Coche coche = new Coche()
	 
	 
## SOBRECARGA

Consiste en que se pueden tener dos funciones con el mismo propotipo pero distintos parámetros

Ejemplo: 

	class Coche {
		int numeroDePuertas;
		int velocidadMaxima;
		float velocidadActual;
		//Constructor
		public Coche(){
			numeroDePuertas = 2;
			velocidadMaxima = 120
		}
		//Sobrecarga del constructor
		public Coche(int puertas, int velocidad){
			numeroDePuertas = puertas;
			velocidadMaxima = velocidad
		}
	}
	

## BUENAS PRACTICAS

Se debe asignar a los parametros de un constructor los mismos nombres que tengan las propiedades del objeto.

Cuando tenemos dos variables iguales
para hacer referencia a la variable de la clase se antepondra this

Ejemplo: 
	
	public Coche(int numeroDePuertas, int velocidadMaxima)
	{
		this.numeroDePuertas = numeroDePuertas;
		this.velocidadMaxima = velocidadMaxima
		
	}