
# INTERFACES

Una interfaz se define con la palabra interface. Una interfaz define un conjunto de metodos  que deberan de incluir las clases que quieran implementar la interfaz.

Los metodos de una interfaz no pueden tener cuerpo.

Las interfaces nos permiten desacoplar codigo es decir si hay algun cambio en el comportamiento se modifica la clase que implementa la interfaz sin necesidad de modificar la clase desde donde se invoca a la clase que implementa la interfaz.

Ejemplo:

```java
public interface CocheService{
	public Coche crearCocheDemo();	
}
```
Con la palabra implements se indica que una clase implementa una interfaz. Esto obliga a que la clase declare y defina todos los metodos de la interfaz.
Ejemplo:

```java	
public class CocheServiceClassicImpl implements CocheService{
	@Override 
	public Coche 	crearCocheDemo(){
		return new CocheElectrico();
	}
}
```
La instancia de esta clase seria:
```java
public class InterfaceMain {
	public static void main(String[] args){
		CocheService service1 = new CocheServiceClassicImpl();
		CocheService service2 = new CocheServiceSportImpl();
		Coche coche1 = service1.crearCocheDemo();
		Coche coche1 = service2.crearCocheDemo();
	}
}
```


