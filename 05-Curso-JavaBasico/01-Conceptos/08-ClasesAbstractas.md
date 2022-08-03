
# CLASES ABSTRACTAS

Es un tipo de clase que no se puede instanciar y se utiliza normalmente cuando hay herencia.

Una clase abstracta es igual que una clase normal con la particularidad de que no se puede instanciar. Se fuerza con las clases abstractas a que los desarrolladores usen las clases hijas.

Utilizando la palabra reservada abstract definimos una clase abstracta. Ejemplo:
```java
public abstract class  Coche {
	String  color;

	String  fabricante;

	String  modelo;

	Double  peso;

	Double  largo;

	public  Coche(String  color, String  fabricante, String  modelo, Double  peso, Double  largo){

	this.color = color

	this.fabricante = fabricante;

	this.modelo = modelo;

	this.peso = peso;

	this.largo = largo;

	}

	public  void  acelerar(Integer  cantidad){

	if(cantidad > 0 && cantidad <= 120){

	this.velocidad += cantidad;

	}

	}

@Override
	
	public  String  toString(){

	return  "Coche{" +

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

```java
public  class  CocheMain {

public  static  void  main(String[] args){
	
		//Como no podemos instanciar objetos de la clase abstracta hay que crearlos de las clases hijas
		Coche  cocheObj = new  CocheHibrido();

	Coche  cocheObj2 = new  CocheElectrico("rojo", "honda", "civic", 1430.45, 5.4,"motor");

	}

	cocheObj2.acelerar(50);

	cocheObj2.peso = 1320.5,

}
```

