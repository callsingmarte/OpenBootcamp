# EL COMPILADOR

Un compilador recoge un flujo de caracteres de entrada y genera una salida.

Tiene multiples fases:

1. **ANALIZADOR LEXICO:** el compilador lee el codigo fuente y lo tokeniza es decir lo lee a caracteres. Todos los compiladores tienen su analizador léxico.

2. **FASE DEL ANALISIS SINTACTICO:**
el compilador va leyendo los tokens generados previamente en el analizador léxico y comprueba si tiene sentido.

3. **FASE GENERACION DE CODIGO INTERMEDIO**: se genera un codigo que esta mejor representado en estructuras de datos esta estructura de datos se conoce como abstract syntax tree (arbol sintactico abstracto) 

4. **FASE OPTIMIZACION DE CODIGO INTERMEDIO:** Esta fase no necesariamente la tienen todos los compiladores, en esta fase el compilador puede eliminar codigo redundante

5. **FASE DE GENERACION DE CODIGO:**	el compilador genera código maquina o un codigo para ser interpretado

Las fases de un compilador son siempre las mismas pero cambia la implementación


## LENGUAJES COMPILADOS E INTERPRETADOS

Un lenguaje compilado se compila a codigo maquina y por tanto se ejecuta directamente a traves del procesador del sistema operativo.

C C++ RUST Y GO son lenguajes compilados.

Los lenguajes interpretados no son ejecutados directamente por el sistema operativo ni de la cpu,
convierten el codigo fuente en Bytecode y se ejecutan a traves de una maquina virtual o un interprete.

BYTECODE -> JVM -> Resultado final

Un lenguaje compilado siempre será mas rapido que un lenguaje interpretado porque se ejecuta directamente en el procesador.

Los lenguajes hibridos combinan lo bueno del lenguaje compilado e interpretado. 

Las ventajas de un lenguaje interpretado es que es mas sencillo de depurar.

El lenguaje compilado requiere que se genere un codigo maquina para cada arquitectura, mientras que el lenguaje interpretado puede ejecutarse en multiples arquitecturas.