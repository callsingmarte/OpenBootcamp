# INTERRUPTORES

Un interruptor es una forma de control

Ejemplo: 
	
	VAR ESTACION = "VERANO"
	DISCIERNE(ESTACION)
		CASO "VERANO"
			IMPRIME "ES VERANO"
		CASO "INVIERNO"
			IMPRIME "ES INVIERNO"
		OTRO CASO 
			IMPRIME "OTRA ESTACION"

Ejemplo java
	
	switch(estacion){
		case "VERANO":
			System.out.println("es verano");
			break;
		case "INVIERNO":
			System.out.println("es invierno");
			break;
		default:	
			System.out.println(estacion);
			break;
		}