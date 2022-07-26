# INTRODUCCION

## HOLA MUNDO 
```java
	public class HelloWorld {
		public static void main(String[] args){
			System.out.println("Hola mundo");
		}
	}
```
## COMENTARIOS 
Los comentarios se pueden definir añadiendo // o  entre /* */ a delante o entre aquello que queramos comentar.

Los comentarios de documentación se definen con /**  y */
Se pueden añadir para mayor legibilidad en la documentación valores como @author, @param, etc ...
Ejemplo:

```java
	/**
	* Clase principal punto de entrada aplicación 
	* @author CallsignMarte
	*/
	public class Main {
		/**
		*	Funcion principal punto de entrada a la aplicacion
		*	@param args argumentos a recibir
		*	@since 1.0
		*/
		public static void main(String[] args){
			//Esto es un comentario
			/*
				Esto 
				tambien es 
				un comentario
			*/
		}
	}
```

## Variables y tipos de datos

**Tipos de dato primitivo** no pueden ser nulos.  

**Tipos de dato envoltorio** admiten el valor nulo

Existen varios tipos de variables estos son algunos:
```java
	public class Tipos {
		public static void main(String[] args){
			//Tipos de dato primitivos
			//tipos de variable enteros
			byte number1 = 1; //1 byte	
			short number2 = 2; //2 byte
			int number3 = 3; // 4 byte
			long number4 = 4; //8byte
			//tipo numeros de punto flotante
			float decimal1 = 4.9f;
			double decimal2 = 9.99d;
			//tipo caracter
			char caracter1 = 'a';
			//tipos booleano
			boolean condicion = true; // admite valores true o false
			//cadenas de texto
			String nombre = "Martin";
			String apellido = "Sanchez";
		//Tipos de dato envoltorio
		Integer numero = null;
		Long numero = 2L; 
		}
	}
```
## OPERADORES

**OPERADORES ARITMETICOS:** Son la suma (+), la resta (-), la multiplicacion (*), la división (/) y el promedio (%). 

**OPERADORES LÓGICOS O DE COMPARACION (BOOLEANOS):**
Son los operadores que se utilizan para comprobar si se cumplen condiciones y son : 
-  ">" Mayor que
-	">=" Mayor o igual que
-	"<" Menor que
-	"<=" Menor o igual que
-	"==" Igual que
-	"!=" No igual que
-	"&&" Y o and
-	"||" or o O
-	"!" No

**OPERADORES DE ASIGNACIÓN:**
Se utilizan para dar valor a una variable y son:
```
 = asigna un valor
 += Incrementa un valor 
 -= decrementa un valor
 /= divide un valor
 *= multiplica un valor
 %= Asigna el promedio de un valor
 ++ Incrementa un valor en 1
-- Decrementa un valor en 1
-  + Concatena cadenas de texto
```

## PALABRAS RESERVADAS
Las palabras reservadas son palabras que se utilizan para identificar tipos de datos, estructuras de control usadas por el compilador de java.
 <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html"> 
Listado de palabras reservadas de Java </a>

Para evitar confusiones se recomienda usar nombres de variables descriptivos no usar acentos ni eñes.
Como convencion se utiliza la primera letra en mayuscula para las clases y la primera letra en minuscula para las variables

