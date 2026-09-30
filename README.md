# ⚽ Mundial de Fútbol en Consola

Aplicación en **Java** que simula, desde la consola, la información del Mundial 2026 (48 selecciones, 12 grupos): banderas dibujadas con matrices, información de cada país y el fixture de la fase de grupos.

Proyecto del taller **Arreglos y Matrices** del curso de *Lógica de Programación* (UPB).

---

## 👥 Equipo de trabajo

| Integrante

| Esteban Gonzalez Posada
| Emanuel Zuluaga Jaramillo

**Grupos del Mundial asignados:** _(completar: los 4 grupos asignados, ej. A, B, C y D)_
---

## ✅ Estado del proyecto

- [x] **Paso 1 – Banderas:** las 48 banderas en 4 tamaños (Grande, Mediano, Pequeño, Ícono)
- [x] **Paso 3 – Fixture:** 72 partidos de la fase de grupos, consulta por grupo y por partido
- [x] **Información de países:** capital, apariciones en mundiales y once titular 2026
- [x] **Paso 2 – Tabla de posiciones:**
- [ ] **Paso 4 – Archivo plano y menú principal unificado:** _(completar según avance)_

---

## 🗂️ Estructura del repositorio

```
Mundial-de-futbol-en-consola/
├── README.md
├── ConsoleColors.java       # Colores ANSI para la consola
├── ConsoleInput.java        # Lecturas por teclado (del profesor)
├── FlagStandardOP.java      # Banderas en 4 tamaños
├── Info.java                # Información de cada país
├── Fixture.java             # Fixture de la fase de grupos
└── recursos/
    └── Flags.csv            # Matriz de colores de las 48 banderas
```

---

## ▶️ Cómo ejecutar

**Requisitos**

- JDK 17 o superior (`java -version` y `javac -version` deben funcionar)
- Una terminal con soporte de colores ANSI y UTF-8 (Terminal de VS Code, Windows Terminal, etc.)

**Compilar** (desde la carpeta raíz del repositorio, para que `recursos/Flags.csv` se encuentre):

```bash
javac -encoding UTF-8 *.java
```

**Ejecutar cada programa:**

```bash
java FlagStandardOP   # Banderas
java Info             # Información de países
java Fixture          # Fixture
```

---

## 🏳️ Banderas

- El archivo `recursos/Flags.csv` guarda las 48 banderas una debajo de otra: cada una ocupa **10 filas × 15 columnas** (480 filas en total).
- Cada celda es un dígito de `1` a `9` que representa un color:

| Dígito | Color | Dígito | Color |
|---|---|---|---|
| 1 | Amarillo | 6 | Verde |
| 2 | Naranja | 7 | Blanco |
| 3 | Rojo | 8 | Negro |
| 4 | Morado | 9 | Café |
| 5 | Azul | | |

- El programa carga el CSV en una matriz `char[480][15]` y dibuja la bandera pintando cada celda con un fondo de color (`ConsoleColors`).
- **Tamaños** (todos con proporción 2:3):

| Tamaño | Filas × Columnas |
|---|---|
| Grande | 10 × 15 (original) |
| Mediano | 6 × 9 |
| Pequeño | 4 × 6 |
| Ícono | 2 × 3 |

  Para reducir, cada celda nueva toma el color de la celda central del bloque que le corresponde en la bandera original.

---

## 📅 Fixture

`Fixture.java` guarda el calendario en dos matrices:

- `GRUPOS[12][4]`: los 4 equipos de cada grupo (A a L).
- `PARTIDOS[72][8]`: número, grupo, fecha, hora, equipo 1, equipo 2, estadio y ciudad.

**Menú:**

| Opción | Qué hace |
|---|---|
| 1 | Muestra los equipos y los 6 partidos de un grupo (se pide la letra A-L) |
| 2 | Muestra los partidos de los 12 grupos |
| 3 | Muestra la hora, los integrantes, el estadio y la ciudad de un partido (1-72) |
| 4 | Salir |

- Todas las entradas se validan: letras fuera de A-L, números fuera de rango o texto vuelven a pedirse.
- **Las fechas y horas están en hora de Colombia (UTC-5).** La FIFA publica los horarios en hora del Este de EE. UU. (ET); en junio, Colombia va una hora atrás de ET.
- El fixture cubre la **fase de grupos** (11 al 27 de junio de 2026). Las rondas eliminatorias dependen de los resultados.

---

## 🔗 Recursos utilizados

- [Enunciado del taller – Lógica UPB](https://xacarana.com/cursos/logica/#/6/1)
- [Código del profesor: banderas_java](https://github.com/xaca/banderas_java) (incluye `ConsoleInput.java`)
- [Calendario oficial de partidos – FIFA](https://www.fifa.com/en/tournaments/mens/worldcup/canadamexicousa2026/match-schedule)
- [Calendario del Mundial 2026 – Bracket Mundial 2026](https://bracketmundial2026.com/calendario)
- [W3Schools – Java Arrays](https://www.w3schools.com/java/java_arrays.asp)
- [W3Schools – Java Multidimensional Arrays](https://www.w3schools.com/java/java_arrays_multi.asp)
- [Sintaxis básica de Markdown – GitHub](https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)

---

## 📎 Enlaces del taller

- Presentación: _(completar enlace)_
