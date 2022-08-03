# POLIMORFISMO

Polimorfismo significa multiples formas, nos permite usar estructuras y bucles para poder iterar sobre una lista de objetos a pesar de que estos sean de un tipo diferente.

Cuando no utilizamos polimorfismo trabajamos con una clase concreta.
Cuando usamos polimorfismo trabajamos con la clase que está por encima con el objetivo de poder tratar a todos los objetos por igual.

Podemos aplicar el polimorfismo cuando tenemos multiples clases que heredan de una  por ejemplo:
```java
public class PolimorfismoMain {
	public static void main(String [] args){
		Coche coche1 = new Coche();
		CocheElectrico coche2 = new CocheElectrico();
		CocheHibrido coche3 = new CocheHibrido();
		//Polimorfismo
		Coche coche4 = new CocheElectrico();
		Coche coche5 = new CocheHibrido();
		//Instance of sirve para saber de que clase es un objeto
	if(coche4 instanceof CocheElectrico){
		System.out.println("coche electrico");
		}
			if(coche4 instanceof CocheHibrido){
		System.out.println("coche hibrido");
		}

	}
}
```



