# BUCLES

Un bucle consiste en que un fragmento de codigo se va a ejecutar mientras se cumpla una condición

## BUCLE WHILE
Este buble se repite mientras la condición se cumpla.
Casi todos los lenguajes de programación tienen el bucle while 
	
- Ejemplo pseudocodigo:
		
		VAR CONTADOR = 10
		MIENTRAS CONTADOR MAYOR A 0
			RESTA 1 AL CONTADOR
- Ejemplo java:

		int contador = 10
		while(contador > 0){	
			System.out.println(contador);
			contador = contador-1;
		}

## BUCLE DO WHILE
Este bucle se ejecuta siempre la primera vez aunque la condición no se haya cumplido y luego se repite mientras la condición se cumpla
	
-	Ejemplo: 
	
		VAR CONTADOR = 10
		HAZ 
			RESTA 1 AL CONTADOR
		MIENTRAS (CONTADOR SEA MAYOR QUE 10)
		
- Ejemplo java
		
		int contador = 2
		do {			System.out.println(contador);
			contador = contador - 1;
		}while(contador > 2);

## BUCLE FOR
Un bucle for se suele dividir en tres partes, este bucle se ejecuta mientras se cumpla la condición

"PARA"(INICIALIZACION; COMPARACION; ACCION)

- Ejemplo java: 
	
		for(int contador = 1; contador < 10; contador = contador +1){
			System.out.println(contador);		
		}

		for(int i = 0; valores.length){
			System.out.println(valores[i])
		}
		

## BUCLE INFINITO 

Es un bucle que se repite indefinidamente

	ejemplo java: 
		for(;;;){
		}		
	