 # ESTRUCTURAS DE CONTROL
## CONDICIONAL
 Comprueban condiciones 
 ### IF ELSE
Se utiliza para comprobar si se cumple una o varias condiciones lógicas.
Ejemplo:
```java
	int number1 = 5;
	int number2 = 10;	
	int number3 = 20;
	int number4 = 1000;
	//Si se cumple la condición se ejecuta lo de dentro
	if(number1 < number2 && number2 < number3){
		System.out.println("verdadero");
		//Si la condición anterior no se cumple comprueba esta condición
		}else if(number3 < number4){
			Sytstem.out.println("false")
		//Si ninguna de las condiciones anteriores se cumple entra aqui
 		}else{
			System.out.println("no se cumplen las condiciones previas");		
		}
	System.out.println("fin");
```

### SWITCH
Es una estructura similar a la del if elseque permite comprobar para un valor multiples condiciones.
```java
String weather = "sunny";
switch (weather){
	case "sunny":
		System.out.println("El tiempo es soleado");
		break;
	case "cloudy":
		System.out.println("El tiempo es nublado")
		break;
	default: 
		System.out.println("No se ha podido identificar el clima");
}
```

## DE REPETICION
Son estrucuturas de control que repiten una serie de instrucciones mientras se cumpla una o varias condiciones.

### BUCLES FOR
```java
	for(int i = 0; i < 10; i++){
		System.out.println("Hola mundo");
		//Tambien admite otras estructuras de control como:
		if(){
		}
	}
```
### BUCLES WHILE
```java	
	int count = 0; 
	while(count < 10){
		System.out.println("Hola mundo " + count );	
		count++
	}
}
```
> ### SENTENCIAS CONTINUE  Y BREAK
>**continue:** Indica que se salte a la siguiente iteración de codigo.
**break:** Rompe el flujo de ejecución.
Ejemplo:
 ```java 
int count = 0;
while(count < 10){
	count++;
	if(count == 6)
		break; // Rompe el flujo de ejecución
		//continue; //salta el valor 6 y continua a la siguiente iteración
	System.out.println(count);
}
```

