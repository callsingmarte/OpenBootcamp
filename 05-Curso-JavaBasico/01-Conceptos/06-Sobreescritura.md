# SOBREESCRITURA

La sobreescritura permite modificar el comportamiento de un método, que tendra el mismo nombre que el método de la clase superior. Se indica que un metodo esta sobreescribiendo con la palabra reservada @Override
Ejemplo:
```java
class CocheElectrico extends Coche {
	String motorElectrico;
	public CocheElectrico(){
	}
	public CocheElectrico(String motorElectrico){
	this.motorElectrico = motorElectrico;
	}
	public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
		super(color, fabricante, modelo, peso largo);
		this.motorElectrico = motorElectrico;
	}
	//Esto es un metodo sobrecargado porque acelerar es un metodo que ya existe en la clase Coche
	@Override
	public void acelerar(Integer cantidad){
		Integer cantidadAjustada = cantidad * 2;
		super.acelerar(cantidad);	
	}
}
```

