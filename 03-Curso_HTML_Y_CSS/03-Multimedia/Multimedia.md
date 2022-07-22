# MULTIMEDIA
## IMAGENES
Para poder utilizar imagenes se empleara la etiqueta **img**
**El atributo src:** define la ruta de la imágen.
**El atributo alt:** se define por si no se puedera cargar la imagen para mostrar un texto alternativo
Ejemplo:
>	< img src="imagenes/logohtml.webp" alt="Logo HTML5" />

## VIDEOS Y AUDIOS
Un video se define entre las etiquetas **video**
Un audio se define entre las etiquetas **audio**
- Con la etiqueta **source** se indica la fuente del video o audio

### ATRIBUTOS DE VIDEOS Y AUDIOS
- el atributo **controls** Habilita los controles del video 
- el atributo **autoplay** Hace que se ejecute el video al cargar la pagina
- el atributo **muted** silencia el video
- el atributo **loop** vuelve a reproducir el video una vez finalizado

Ejemplo video y audio:
>	< video controls autoplay muted>
			< source  src="video" type="video/mp4">
		</ video>
		< audio controls>
				< source  src="audio" type="audio/mp3">
		</ audio>
