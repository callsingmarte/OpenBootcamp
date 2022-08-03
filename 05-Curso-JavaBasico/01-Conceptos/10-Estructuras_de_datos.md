# ESTRUCTURAS DE DATOS

## ARRAYS
```java
	//Esta es una forma de definir un array
	int[] numeros = new int[]{2, 3, 4}	
	//Esta es otra forma de definir un array
	String[] nombres = new String[4];
nombres[0] = "Paco";
nombres[1] = "Pepe";
nombres[2] = "Juan";
nombres[3] = "Ramon";

//Asi podemos recorrer un array
for(i = 0; i < nombres.length(); i++){
	System.out.println(nombres[i]);
}
```

## LISTAS

```java
	//Asi definimos una lista
	List<String> palabras = new ArrayList<>();
	//Con add añadimos elementos a la lista 
	palabras.add("palabra 1");
	
	//De esta forma podemos recorrer una lista
	for(String palabra : palabras){
		System.out.println(palabra);
	}
	//Tambien podemos definir una lista de objetos
List <Coche> coches = new ArrayList<>();
//Asi añadimos un objeto a la lista
coches.add(new Coche("honda"));
```

## MAPAS
Son estructuras de datos que permiten trabajar con clave valor.

```java
	Map<String, String> personas = new HasMap<>();
	personas.put("12345678H", "Nombre apellido 1");
	personas.put("12345678L", "Nombre apellido 2");
	personas.put("12345678P", "Nombre apellido 3");
	//Para recorrer el hasmap
	for(String key : personas.keySet()){
		System.out.println(key);	
	}
	for(String value : personas.values()){
		System.out.println(value);	
	}
for(Map.Entry<Sring, String> pair : personas.entrySet(){
	System.out.println(pair.getKey() + " / " + pair.getValue()
}
	
```

