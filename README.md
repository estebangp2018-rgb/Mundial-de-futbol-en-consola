# Mundial de Fútbol en Consola

Programa en Java que muestra en la consola información del Mundial 2026: las banderas de las 48 selecciones dibujadas con matrices, la tabla de posiciones, el fixture de la fase de grupos y datos de cada país.


## Equipo

- Esteban Gonzalez Posada
- Emanuel Zuluaga Jaramillo

## Archivos

- `ConsoleColors.java`: colores para la consola.
- `ConsoleInput.java`: lectura por teclado (viene del repo del profesor).
- `FlagStandardOP.java`: dibuja las banderas en los 4 tamaños.
- `tablaPosiciones.java`: tabla de posiciones.
- `Fixture.java`: calendario de partidos.
- `Info.java`: información de cada país.
- `FlagStandard.java` y `FlagStandardAporte.java`: versiones anteriores de las banderas.
- `recursos/Flags.csv`: colores de las 48 banderas.
- `presentacion/Presentacion_Mundial.pptx`: presentación de la exposición.

## Cómo ejecutarlo

Necesitamos el JDK instalado (`javac -version` y `java -version` deben funcionar) y una terminal con colores y UTF-8, como la de VS Code.

Desde la carpeta principal del repositorio (para que encuentre `recursos/Flags.csv`):

```bash
javac -encoding UTF-8 *.java
java FlagStandardOP
java tablaPosiciones
java Fixture
java Info
```

## Banderas

El `Flags.csv` tiene las 48 banderas una debajo de otra, cada una de 10 filas por 15 columnas. Cada celda es un número del 1 al 9 que representa un color:

| Número | Color | Número | Color |
|---|---|---|---|
| 1 | Amarillo | 6 | Verde |
| 2 | Naranja | 7 | Blanco |
| 3 | Rojo | 8 | Negro |
| 4 | Morado | 9 | Café |
| 5 | Azul | | |

El programa carga el archivo en una matriz de 480 x 15 y pinta cada celda con un fondo de color. Para los tamaños más chicos, cada celda nueva toma el color de la celda del centro del bloque que le corresponde en la bandera original.

| Tamaño | Filas x Columnas |
|---|---|
| Grande | 10 x 15 |
| Mediano | 6 x 9 |
| Pequeño | 4 x 6 |
| Ícono | 2 x 3 |

## Tabla de posiciones

Es una matriz de 48 equipos (filas) por 10 columnas: PJ, PG, PE, PP, GF, GC, DG, TA, TR y Pts. Se muestra en una tabla formateada de 10 equipos por página, con opciones para ir a la página siguiente o anterior y para editar cualquier valor de un equipo.

## Fixture

Los datos están en dos matrices: los grupos (12 grupos x 4 equipos) y los partidos (72 partidos x 8 datos: número, grupo, fecha, hora, los dos equipos, estadio y ciudad).

El menú tiene cuatro opciones:

1. Ver los partidos de un grupo (se ingresa la letra de la A a la L).
2. Ver los partidos de todos los grupos.
3. Ver la hora e integrantes de un partido (se ingresa el número del 1 al 72).
4. Salir.

Todas las entradas se validan, así que si se ingresa algo inválido el programa lo vuelve a pedir.

Las fechas y horas están en hora de Colombia. La FIFA publica los horarios en hora del Este de EE. UU. y en junio Colombia va una hora atrás. Solo está la fase de grupos (del 11 al 27 de junio de 2026).

## Información de países

Se elige un país de la lista y el programa muestra su capital, sus apariciones en copas del mundo y su once titular.

## Recursos

- [Enunciado del taller](https://xacarana.com/cursos/logica/#/6/1)
- [Repo del profesor (banderas_java)](https://github.com/xaca/banderas_java)
- [Calendario oficial de la FIFA](https://www.fifa.com/en/tournaments/mens/worldcup/canadamexicousa2026/match-schedule)
- [Calendario en Bracket Mundial 2026](https://bracketmundial2026.com/calendario)
- [W3Schools: arreglos en Java](https://www.w3schools.com/java/java_arrays.asp)
- [W3Schools: arreglos multidimensionales](https://www.w3schools.com/java/java_arrays_multi.asp)
- [GeeksforGeeks: arreglos multidimensionales](https://www.geeksforgeeks.org/multidimensional-arrays-in-java/)

Presentación de la exposición: [Presentacion_Mundial.pptx](presentacion/Presentacion_Mundial.pptx)
