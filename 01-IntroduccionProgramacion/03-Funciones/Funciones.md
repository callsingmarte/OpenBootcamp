## ¿PARA QUE SIRVE UNA FUNCIÓN?
>Una función nos evita tener que repetir código

- Cuando en un programa tenemos que hacer muchas veces la misma tarea creamos una función. Cada lenguaje define una función de manera diferente.


## COMPOSICIÓN DE UNA FUNCION
- Las funciones tienen una cosa que se llama firma, este prototipo consiste en 
como se llama la función, que valores va a aceptar la función y que tipos de datos va a retornar la función si retorna alguno.

Ejemplo de una funcion en java:
		
	public static int suma (int a, int b) {
	return a + b;
	}

- El cuerpo de la función es donde la función implementa su lógica


- Hay dos formas de pasar valores a las funciones

>**Paso por valor:** Es cuando se pasa  una copia tanto del valor como el tipo de dato

>**Paso por referencia:** es cuando se pasa una dirección de memoria como parametro y la función modifica el contenido de la dirección de memoria. Tiene la ventaja de que se ahorra en memoria

- **Funciones recursivas:** Son aquellas que se invocan así misma

- Un callback es asignar el nombre de una función a una variable y llamar indirectamente a la funcion. Se llama callback porque invoca hacia atrás.