7. Implementar un programa que inicialice una tabla con nuestros 10 números favoritos. A
continuación, pedir al usuario el índice de un elemento que será eliminado de la tabla.
Continuaremos eliminando elementos hasta que el índice introducido sea negativo o
hasta que no existan más elementos que borrar. Es imprescindible controlar que el
índice leído corresponde a un dato válido.

8. Se creará un programa que genere una tabla de caracteres de 20 elementos cargado con
vocales de manera aleatoria. Contar e imprimir el número de veces que aparece cada vocal.
Nota: se puede utilizar un vector de frecuencias de repetición para las 5 vocales.

9. Se creará un programa que genere una tabla de caracteres de 20 elementos cargado con
vocales de manera aleatoria. Contar e imprimir el número de veces que aparece cada vocal.
Nota: se puede utilizar un vector de frecuencias de repetición para las 5 vocales.

10. Leer y almacenar n números enteros en una tabla, a partir de la que se construiran otras
dos tablas con los elementos con valores pares e impares de la primera, respectivamente.

11. Desarrollar el juego la cámara secreta, que consiste abrir una cámara mediante su
combinación secreta, que está formado por una combinación de dígitos del uno al cinco.
El jugador especificará cuál es la longitud de la combinación, a mayor longitud mayor
será la dificultad del juego. La aplicación genera, de forma aleatoria, una combinación
secreta que el usuario tendrá que acertar. En cada intento se muestra como pista, para
cada dígito de la combinación introducido por el jugador, si es mayor, menor o igual
que el correspondiente en la combinación secreta.


Refactorización Realizada:

Renombrado de la Clase:

El nombre de la clase fue modificado a Ejer11CámaraSecreta para seguir las convenciones estándar de Java (PascalCase) y hacerla más descriptiva.
Modularización del Código:

La lógica para generar la combinación secreta se movió a un método separado generarCombinacionSecreta, lo que mejora la legibilidad y facilita su mantenimiento.
Cierre Adecuado de Recursos:

El Scanner se cierra correctamente después de su uso para liberar recursos y evitar posibles fugas.
Uso de StringBuilder:

Se utiliza StringBuilder para construir la cadena de la combinación secreta de manera más eficiente que la concatenación de cadenas.
Comentarios Javadoc:

Se añadieron comentarios para explicar el propósito del método generarCombinacionSecreta, mejorando la documentación del código.
Depuración:

Se incluye una línea de impresión de la combinación secreta para facilitar la depuración, que puede ser eliminada en un entorno de producción.
