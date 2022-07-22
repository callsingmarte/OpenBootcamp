 # FORMULARIOS
Los formularios sirven para recopilar datos de usuarios.
## La etiqueta form 
agrupa una serie de elementos en las que el usuario  introduce sus datos.
- **El atributo action** hace referencia a la url a la que nosotros queremos enviar un formulario.
- Existen los métodos 
	- **Get** para recuperar la informacion.
	- **Post** para enviar la informacion

## La etiqueta label
 se suele utilizar para  indicar a que campo pertenece un input o para etiquetar los inputs.
-	**El atributo for:** hace referencia a un input que tenga el mismo id.

## Inputs
 son campos donde los usuarios introducen su informacion
- **El atributo name** sirve para que se puedan acceder a los resultados de la petición del formulario.
- **El atributo required** sirve para obligar a que ese campo sea completado
- **type password** indica que el input es de tipo contraseña
- **type text** indica que el input es de tipo texto
- **type number** indica que el input es de tipo numerico
- **type date** indica que el input es de tipo fecha

Ejemplo: 

	<label for="nombreusuario"> Nombre de usuario
	</label>
	<input  type="text" name = "nombreusuario" id="nombeusuario />

Existen tambien los campos area de texto (textarea) para introducir textos

## Botones
- **type submit** envia los datos de un formulario
- **type reset**  permite resetear los datos de un formulario
