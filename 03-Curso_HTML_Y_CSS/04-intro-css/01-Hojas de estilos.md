# HOJAS DE ESTILOS
## INTRODUCCION CSS

Los CSS o Cascade style sheet son hojas de estilos en cascada que nos permiten definir los estilos de una pagina web.

Ejemplo de una definición de estilos:
	
```css
	/* Esto es un comentario
	Probando colores y fuentes */ 
	h1{
		color: red 
/*  propiedad: valor */
	}
```
## SELECTORES
Permiten afectar a etiquetas concretas en lugar de todas las etiquetas de un mismo tipo.
ejemplo selectores:
- Hoja de estilos
```css
	/* # define un selector de tipo id*/
	p#primera-noticia{
		color: green;
		font-size: 12pt;
	}
	/* selectores de clase se definen con un punto . */
	.encabezado{
			font-size: 24pt;
			text-transform:uppercase;
	}
	/*Selector universal define estilos en todos los elementos*/
	*{
		color: red;
	}
```
- html 
```html
<html>
	<head>
		<title> Trabajando con Css </title>
		<link rel="stylesheet" href="estilos.css" />
	</head>
	<body>	
		<h2 class="encabezado"> seccion de noticias</h2>
		<p id="primera-noticia"> Esta es la primera noticia</p>
	<body>
</html>
```


## FORMAS DE IMPORTAR HOJAS DE ESTILOS
1. Importando una hoja de estilos local o en remoto
```html

<!DOCTYPE html>

<html lang="en">

<head>

<!-- Definicion de estilos-->

<link rel="stylesheet" href="introestilos.css">

</head>

<body>
</body>

</html>

```

2. Definiendo estilos desde el head

```html

<!DOCTYPE html>

<html lang="en">

<head>
	<style>
		html {
				padding: 15px;
		}
		p {
		color: red
		}
	</style>
</head>

<body>
	<p>Hola</p>
</body>

</
```
3. Definiendo estilos en linea como un atributo  de la etiqueta
```html

<!DOCTYPE html>

<html lang="en">

<head>
<title > utilidades Css </title>
</head>

<body>
	<p>Hola</p>
	<button style="padding: 10 px; border: none; border-radius: 10 px;">Botón personalizado </button> 
</body>	
```

