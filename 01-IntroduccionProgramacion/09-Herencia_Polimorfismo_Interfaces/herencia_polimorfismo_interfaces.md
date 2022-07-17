# HERENCIA
Consiste en que una clase hereda métodos y propiedades de otra clase,
a la clase que hereda la llamamos clase hija, a la clase que cede sus metodos y propiedades podemos llamarla como queramos, superclase, clase padre


Una clase que hereda de otra clase tambien puede tener funciones y propiedades propias a su clase

Ejemplo de herencia en java:

	class Vehiculo {
		int velocidadMaxima;
		String matricula;
	}
	
	//Clase que hereda de coche
	class Coche extends Vehiculo {
	}

**herencia multinivel:** es cuando una clase hereda de dos o mas clases padre

	class Vehiculo {
		int velocidadMaxima;
		String matricula;
	}
	
	//Clase que hereda de coche
	class Coche extends Vehiculo {
	}

	//Clase que hereda de coche
	class Coupe extends Coche {
	}

**herencia multiple:** consiste en que una clase hereda de dos o mas clases

	//Clase que hereda de coche y vehiculo
	class Porche extends Vehiculo, Coche {
	}

**Herencia jerarquica:** consiste en que de una clase base derivan otras clases. Por ejemplo de una clase base heredan otras dos clases de las que heredan otras dos clases.

Ejemplo pseudocodigo:
	
	CLASE A 
		CLASE B HEREDA DE A
			CLASE UNO HEREDA DE B
			CLASE DOS HEREDA DE B
		CLASE C HEREDA DE A
			CLASE PERRO HEREDA DE C
			CLASE GATO HEREDA DE C				CLASE D HEREDA DE A
			CLASE COCHE HEREDA DE D
			CLASE MOTO HEREDA DE D


**Herencia hibrida:** combina modelos de herencia.
Ejemplo pseudocodigo: 

	CLASE A 
		CLASE B HEREDA DE A
		CLASE C HEREDA DE A
		CLASE D HEREDA DE B Y DE C
						

En java se hereda con añadiendo extends a la clase e indicando despues del extends la clase de la que se quiere heredar

con final indicamos que no se quiere que se herede de la clase

ejemplo :

	final class Coche extends Vehiculo{	
	}

# POLIMORFISMO

Consiste en que las clases hijas implementan la misma funcion pero hacen distinta cosa

Una misma funcion implementada en dos clases con una relacion de dependencia ejecutara la funcion que este mas cercana en ese nivel de dependencia

Ejemplo:

		
	public static void main(String[] args){
		Coche coche = new Coche();
		coche.diHola();
	}
	
	class Vehiculo {
		public void diHola(){
			System.out.println("Hola!!");
		}
	}
	class Coche extends Vehiculo {
		public void diHola(){
	System.out.println("Soy un coche!!");
		}
	}

Los lenguajes no solo tienen polimorfismo a nivel de clase algunos de ellos tienen ademas  polimorfismo a nivel de funcion

# INTERFACES

Las interfaces son parecidas a las clases abstractas pero a diferencia de estas no implementan ninguna funcion sino que nos dicen lo que tenemos que implementar.

Las interfaces las utilizamos cuando queremos crear clases y que esas clases tengan unas funciones previamente definidas

Ejemplo interfaz:

	interface Vehiculo {
		int variable = 0;
		void Acelerar(int cuantaVelocidad);
		void Frenar(int cuantaVelocidad);
	}
	//Clase coche implementa la interfaz vehiculo
	class Coche implements Vehiculo{
		public void Acelerar(int cuantaVelocidad){}
		public void Frenar(int cuantaVelocidad){}
	}

En el momento en el que se implementan todas las funciones de una interfaz en una clase se dice que la interfaz esta implementada

Las interfaces se utilizan para unificar metodos esos metodos los vamos a implementar en una clase o mas.

La ventaja principal de una interfaz es que asegura que donde estas se implementen se tendra el mismo numero de funciones.