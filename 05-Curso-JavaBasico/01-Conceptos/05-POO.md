# PROGRAMACION ORIENTADA A OBJETOS

> Extension util para IntelliJ: Tabnine Ai Code Co... 

## CREAR CLASES
Las clases se componen de atributos, constructores y métodos que definen su comportamiento.
Ejemplo:
```java
	Public classs Coche {
		//atributos 
		String color;
		String fabricante; 
		String modelo;
		Double peso;
		Double largo;
		//constructores
		public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
		//this indica el valor de la propiedad del objeto
		this.color = color
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.peso = peso;
		this.largo = largo;
		}
		//comportamiento
		public void acelerar(Integer cantidad){
			if(cantidad > 0 && cantidad <= 120){
				this.velocidad += cantidad;
			}
		}
		
		// Este metodo permite invocar a una clase con el system.out.println para que muestre sus datos
		@Override
		public String toString(){
			return "Coche{" +
					"color'=" + color + '\'' + 
					", fabricante='" + fabricante + '\'' +
					", modelo='" + modelo + '\'' +
					", peso=" + peso + 
					", largo=" + largo +
					", velocidad=" + velocidad +
					'}';
		}
	}
```
## CREAR OBJETOS
Los objetos se crean a partir de las clases. En este ejemplo usaremos la clase creada anteriormente para crear un objeto.
Ejemplo:
```java
	public class CocheMain {
		public static void main(String[] args){
			//Asi es como se crea un objeto
			Coche cocheObj = new Coche();
			//Asi creamos un objeto e inicializamos sus propiedades
			Coche cocheObj2 = new Coche("rojo", "honda", "civic", 1430.45, 5.4);
		}
		//De esta forma llamamos al metodo del objeto
		cocheObj2.acelerar(50);
		//Cambia la propiedad del objeto 
		cocheObj2.peso = 1320.5,
	}
```

## HERENCIA
Permite reutilizar codigo entre clases. Se utiliza cuando queremos que una clase muy parecida a otra pueda añadir mas propiedades y/o comportamientos.

Ejemplo:
```java
//Con extends heredamos de la clase Coche
public class CocheElectrico extends Coche{
	String motorEletrico;
	public CocheElectrico(){
	}
	public CocheElectrico(String motorElectrico){
		this.motorElectrico = motorElectrico;
	}
}
```
Cuando creamos un objeto de la clase que hereda podemos acceder a las propiedades y metodos de la clase.
Ejemplo:
```java
public class cocheMain{
	public static void main(String[] args){
		CocheElectrico cocheElectrico = new CocheElectrico();		cocheElectrico.acelerar(20);
		cocheElectrico.color = "verde";
	}
}

```
## EL METODO SUPER
Nos permite invocar a un constructor de la clase superior permitiendo reutilizar código desde una clase hija por una clase base. El método super se utiliza en casos de herencia.

Ejemplo: 

```java
public class CocheElectrico extends Coche{
	String motorEletrico;
	public CocheElectrico(){
	}
	public CocheElectrico(String motorElectrico){
		this.motorElectrico = motorElectrico;
	}
	public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
		//LLama al constructor de la clase Coche 
		super(color, fabricante, modelo, peso, largo);
		this.motorElectrico = motorElectrico;
	}
}		
```



