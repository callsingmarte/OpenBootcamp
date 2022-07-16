# CONDICIONALES

## LOGICAS 

- "Y" = 2 o Mas condiciones deben cumplirse
- "O" = 1 o ninguna o mas condiciones deben cumplirse
	
---
## COMPARATIVAS

- "MAYOR QUE" >
- "MENOR QUE" < 
- "MAYOR O IGUAL QUE" >=
- "MENOR O IGUAL QUE" <=
- "IGUAL A" ==	
- "DISTINTO A" !=
---
### EJEMPLOS:
- 	40 MAYOR QUE 30 => CIERTO
-	40 MAYOR QUE 30 => FALSO

>Si = if

>En CASO CONTRARIO SI = else if

>EN CASO CONTRARIO = ELSE

	SI(ESTACION IGUAL A "VERANO") IF	ENTONCES 
	AQUI ACCIONES A TOMAR
	EN CASO CONTRARIO SI (ESTACION 	IGUAL A "PRIMAVERA") ENTONCES ELSE IF
	SALIR DE PASEO()
	EN CASO CONTRARIO ENTONCES ELSE
	PONERSE EL ABRIGO()
	
---
### EJEMPLO EN JAVA

	if(estacion == "primavera"){
      	system.our.println("primavera");
	}else if(estacion == "verano"){
      	system.our.println("verano");
	}else{
		system.our.println("otra estación");
	}