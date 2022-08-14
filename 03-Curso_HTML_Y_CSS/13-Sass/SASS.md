# SASS
Es un preprocesador de css las siglas SASS vienen de **Sintactically Awesome StyleSheet**
SASS es un framework porque proporciona una serie de herramientas para css que nos permitiran escalar mucho mas que con css.

Se recomienda en visual Studio descargar la extension **Live Sass Compiler**

Hay dos tipos de archivos:
- **Sass:** omite las llaves y los puntos y comas de la hoja de estilos
ejemplo: 
```sass
	h1 
		color: red
		background-color: green
```
- **Scss:** se define como los css ejemplo: 
```scss
	h1{
		color: red;
		background-color: green
	}
```

Para importar un archivo scss o sass
hay que definir una hoja de estilos css que importaremos en el html y un fichero styles.css.map 
para que pueda interpretar el navegador el archivo scss o sass

## FORMAS DE IMPORTADO

Se puede importar un archivo scss mediante **@import** o mediante **@use** la diferencia entre @import y @use esque con @use se crea un espacio de nombres esto nos permite tener una variable definida con el mismo nombre en cada sitio pues luego cuando se vaya a utilizar no se sobreescribe como pasaria con el @import.

## DEFINICION DE VARIABLES

Las variables en SASS se definen con $ seguido del nombre de la variable.

Ejemplo:

```scss
	$text-color: #3f3f3f;
```

## DEFINICION DE MIXINS

Los mixins se definen mediante @mixin seguido del nombre del mixin, despues se pueden indicar los parametros que recibe y se define el cuerpo del mixin.
Ejemplo:
```scss
	@mixin formato-texto($bg-color: #f1f1f1){
		width: 50rem;
		color: $text-color;
		text-transform: uppercase;
		background-color: $bg-color;
	}
```

Un mixin se importa mediante **@include** ejemplo: 
```scss
 @include mixins.formato-texto();
```

## HERENCIA

Con la **@extends** se pueden heredar estilos definidos de una clase por ejemplo.

Ejemplo: 

```scss
.btn {
    border: none;
    padding: 0.25rem 0.5 rem;
    color: #2b2b2b;

    &:hover {
        background-color: cyan;
        color: red;
        cursor: pointer;
    }
}

.btn-2 {
    //Con @extend se heredan los estilos de .btn
    @extend .btn;
    margin: 0.5rem;
    border-radius: 0.25rem;
}
```
## COMPILAR UN FICHERO SASS

Se puede compilar un fichero sass con el comando 
> sass --watch styles.scss:styles.css
