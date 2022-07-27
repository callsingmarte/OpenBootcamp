# FUNCIONES
Las funciones son agrupaciones de sentencias que van a poder ser reutilizadas.
Normalmente llamaremos a las funciones metodos cuando estemos hablando de objetos y programacion orientada a objetos.
Las llamaremos funciones cuando no estemos hablando de objetos o comportamientos de un objeto

Es una mala practica repetir código por esto se recurre a las funciones

Ejemplo de una funcion:
```java
	public class Funciones {
		public static void main(String[] args){
			//Asi se invoca a la funcion
			holaMundo();
		}
		//Esto es una funcion
		/*
			private define la visibilidad de la funcion
			static quiere decir que la funcion pertenece a la clase
			void significa que no devuelve nada
		*/
		private static void holaMundo(){
			System.out.println("Hola Mundo");
		}	
		//Las funciones pueden recibir parametros o argumentos
		private static void holaMundo(String name){
			System.out.println("Hola" + name);
		}
		/* 
		Esta funcion devuelve una cadena de texto
		String es el tipo de dato que devuelve la funcion
		el retorno se indica con la palabra return
		*/
	private static String devolverHola(){
	return "hola"}
	}
```

## AMBITO DE UNA FUNCION

Modificadores de visibilidad de una funcion:

- **Private:** La funcion solo es accesible desde la clase en la que se ha creado
- **Public**: La funcion es accesible desde otras clases además de la clase en la que se ha creado
- **Protected:** Solo aquellas clases que estén en el mismo paquete o sean clases hijas pueden invocar la funcion
- Si la funcion no se define la funcion solo es accesible desde aquellas clases que se encuentren en el mismo paquete

## RETORNO DE UNA FUNCION

Las funciones de tipo void no devuelven nada si queremos que devuelvan algo hay que indicar el tipo de dato y utilizar la palabra return. Ejemplo:
```java
/*
	Esta funcion devuelve un tipo de dato entero
*/
private static int sum(int num1, int num2){
	return num1 + num2;
}
```
## SOBRECARGA DE FUNCIONES
Una funcion esta sobrecargada cuando hay otra funcion que tiene su mismo nombre pero tiene distintos parametros. 
Ejemplo:

```java
	private static void holaMundo(){
		System.out.println("Hola Mundo");
	}
	private static void holaMundo(String name){
	System.out.println("Hola"+ name);
}
	private static void holaMundo(Integer number){
	System.out.println("El numero es"+ number);
}
```
