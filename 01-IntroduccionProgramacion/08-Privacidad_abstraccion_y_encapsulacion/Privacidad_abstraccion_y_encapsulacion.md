# PRIVACIDAD

Las propiedades pueden ser de tres tipos.


Propiedades privadas: solo se pueden utilizar en la implementacion de la clase o dentro de la clase.

Propiedades publicas: se pueden utilizar tanto dentro de la clase como fuera de ella


En java para definir esto se hace como: 

Public para definir propiedades publicas

Private para definir propiedades privadas


## ENCAPSULACION

Consiste en permitir que se modifiquen ciertas variables privadas de una clase a traves de metodos get y set

### GETTERS

Tienen la funcion de devolver un valor de una propiedad de una clase

	public int getVelocidad(){
		return this.velocidad;
	}
	
	public boolean isRapido(){
		return this.rapido;
	}


### SETTERS

Tienen la funcion de dar valor a una propiedad de una clase.
	
	public int setVelocidad(int velocidad){
		this.velocidad = velocidad
	}
	

# PROGRAMACION MULTIHILO
La programacion multihilo consiste en que el programa se ejecuta de forma paralela en mas de un core del procesador.

Si dos o mas hilos acceden a una misma variable privada el programa da un error. Esto se soluciona metiendo un bloqueo y un desbloqueo


# ABSTRACCION

Es la implementacion de parte de una clase pero que delega en la clase hija como debe implementar ciertas funciones.

Un metodo o clase abstracta es igual que uno normal y corriente pero tiene un calificador.

Una funcion abstracta puede implementar el codigo de algunas funciones y dejar que otras funciones deban ser implementadas por el programador

Las clases abstractas no se pueden utilizar directamente deben de ser heredadas

Las clases abstractas en java se definen anteponiendo abstract al nombre de la clase.

Una funcion abstracta no puede tener un cuerpo.

Ejemplo de una clase abstracta en java:

	abstract class vehiculo {
		private String sonido;
		private int velocidadMaxima;

		abstract public void set sonido(String sonido)
		abstract public String getSonido();
		
		public void setVelocidadMaxima(int velocidadMaxima){
			this.velocidadMaxima = velocidadMaxima;
		}
		
		public void getVelocidadMaxima(){
			return this.velocidadMaxima;
		}

	}

