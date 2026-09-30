/*
 * Fixture del Mundial 2026 - Fase de grupos (72 partidos, 12 grupos)
 *
 * Datos guardados en dos matrices:
 *   GRUPOS   -> 12 filas (A..L) x 4 columnas (equipos)
 *   PARTIDOS -> 72 filas (uno por partido) x 8 columnas (ver constantes de abajo)
 *
 * Las fechas y horas están en hora de Colombia (UTC-5).
 * La FIFA publica los horarios en hora del Este de EE. UU. (ET, UTC-4 en junio),
 * por eso cada hora ya está convertida (ET - 1 hora).
 *
 * Lecturas por teclado: ConsoleInput.java (del profesor).
 */
public class Fixture {

    // Posición de cada dato dentro de una fila de PARTIDOS
    static final int NUM = 0;
    static final int GRUPO = 1;
    static final int FECHA = 2;
    static final int HORA = 3;
    static final int EQUIPO1 = 4;
    static final int EQUIPO2 = 5;
    static final int ESTADIO = 6;
    static final int CIUDAD = 7;

    static final int TOTAL_PARTIDOS = 72;
    static final int TOTAL_GRUPOS = 12;

    static final String[] BANNER = {
        " _____ _____  _______ _   _ ____  _____",
        "|  ___|_ _\\ \\/ /_   _| | | |  _ \\| ____|",
        "| |_   | | \\  /  | | | | | | |_) |  _|",
        "|  _|  | | /  \\  | | | |_| |  _ <| |___",
        "|_|   |___/_/\\_\\ |_|  \\___/|_| \\_\\_____|",
    };

    // Fila 0 = Grupo A, fila 1 = Grupo B, ... fila 11 = Grupo L
    static final String[][] GRUPOS = {
        {"México", "Sudáfrica", "Corea del Sur", "Chequia"},
        {"Canadá", "Suiza", "Qatar", "Bosnia y Herzegovina"},
        {"Brasil", "Marruecos", "Haití", "Escocia"},
        {"Estados Unidos", "Paraguay", "Australia", "Turquía"},
        {"Alemania", "Curazao", "Costa de Marfil", "Ecuador"},
        {"Países Bajos", "Japón", "Túnez", "Suecia"},
        {"Bélgica", "Egipto", "Irán", "Nueva Zelanda"},
        {"España", "Cabo Verde", "Arabia Saudita", "Uruguay"},
        {"Francia", "Senegal", "Noruega", "Irak"},
        {"Argentina", "Argelia", "Austria", "Jordania"},
        {"Portugal", "Colombia", "Uzbekistán", "Congo RD"},
        {"Inglaterra", "Croacia", "Ghana", "Panamá"},
    };

    // {número, grupo, fecha (COL), hora (COL), equipo 1, equipo 2, estadio, ciudad}
    static final String[][] PARTIDOS = {
        {"1", "A", "Jue 11 jun", "14:00", "México", "Sudáfrica", "Estadio Azteca", "Ciudad de México"},
        {"2", "A", "Jue 11 jun", "21:00", "Corea del Sur", "Chequia", "Estadio Akron", "Guadalajara"},
        {"3", "B", "Vie 12 jun", "14:00", "Canadá", "Bosnia y Herzegovina", "BMO Field", "Toronto"},
        {"4", "D", "Vie 12 jun", "20:00", "Estados Unidos", "Paraguay", "SoFi Stadium", "Inglewood"},
        {"5", "C", "Sáb 13 jun", "20:00", "Haití", "Escocia", "Gillette Stadium", "Foxborough"},
        {"6", "D", "Sáb 13 jun", "23:00", "Australia", "Turquía", "BC Place", "Vancouver"},
        {"7", "C", "Sáb 13 jun", "17:00", "Brasil", "Marruecos", "MetLife Stadium", "East Rutherford"},
        {"8", "B", "Sáb 13 jun", "14:00", "Qatar", "Suiza", "Levi's Stadium", "Santa Clara"},
        {"9", "E", "Dom 14 jun", "18:00", "Costa de Marfil", "Ecuador", "Lincoln Financial Field", "Filadelfia"},
        {"10", "E", "Dom 14 jun", "12:00", "Alemania", "Curazao", "NRG Stadium", "Houston"},
        {"11", "F", "Dom 14 jun", "15:00", "Países Bajos", "Japón", "AT&T Stadium", "Arlington"},
        {"12", "F", "Dom 14 jun", "21:00", "Suecia", "Túnez", "Estadio BBVA", "Monterrey"},
        {"13", "H", "Lun 15 jun", "17:00", "Arabia Saudita", "Uruguay", "Hard Rock Stadium", "Miami"},
        {"14", "H", "Lun 15 jun", "11:00", "España", "Cabo Verde", "Mercedes-Benz Stadium", "Atlanta"},
        {"15", "G", "Lun 15 jun", "20:00", "Irán", "Nueva Zelanda", "SoFi Stadium", "Inglewood"},
        {"16", "G", "Lun 15 jun", "14:00", "Bélgica", "Egipto", "Lumen Field", "Seattle"},
        {"17", "I", "Mar 16 jun", "14:00", "Francia", "Senegal", "MetLife Stadium", "East Rutherford"},
        {"18", "I", "Mar 16 jun", "17:00", "Irak", "Noruega", "Gillette Stadium", "Foxborough"},
        {"19", "J", "Mar 16 jun", "20:00", "Argentina", "Argelia", "Arrowhead Stadium", "Kansas City"},
        {"20", "J", "Mar 16 jun", "23:00", "Austria", "Jordania", "Levi's Stadium", "Santa Clara"},
        {"21", "L", "Mié 17 jun", "18:00", "Ghana", "Panamá", "BMO Field", "Toronto"},
        {"22", "L", "Mié 17 jun", "15:00", "Inglaterra", "Croacia", "AT&T Stadium", "Arlington"},
        {"23", "K", "Mié 17 jun", "12:00", "Portugal", "Congo RD", "NRG Stadium", "Houston"},
        {"24", "K", "Mié 17 jun", "21:00", "Uzbekistán", "Colombia", "Estadio Azteca", "Ciudad de México"},
        {"25", "A", "Jue 18 jun", "11:00", "Chequia", "Sudáfrica", "Mercedes-Benz Stadium", "Atlanta"},
        {"26", "B", "Jue 18 jun", "14:00", "Suiza", "Bosnia y Herzegovina", "SoFi Stadium", "Inglewood"},
        {"27", "B", "Jue 18 jun", "17:00", "Canadá", "Qatar", "BC Place", "Vancouver"},
        {"28", "A", "Jue 18 jun", "20:00", "México", "Corea del Sur", "Estadio Akron", "Guadalajara"},
        {"29", "C", "Vie 19 jun", "19:30", "Brasil", "Haití", "Lincoln Financial Field", "Filadelfia"},
        {"30", "C", "Vie 19 jun", "17:00", "Escocia", "Marruecos", "Gillette Stadium", "Foxborough"},
        {"31", "D", "Vie 19 jun", "22:00", "Turquía", "Paraguay", "Levi's Stadium", "Santa Clara"},
        {"32", "D", "Vie 19 jun", "14:00", "Estados Unidos", "Australia", "Lumen Field", "Seattle"},
        {"33", "E", "Sáb 20 jun", "15:00", "Alemania", "Costa de Marfil", "BMO Field", "Toronto"},
        {"34", "E", "Sáb 20 jun", "19:00", "Ecuador", "Curazao", "Arrowhead Stadium", "Kansas City"},
        {"35", "F", "Sáb 20 jun", "12:00", "Países Bajos", "Suecia", "NRG Stadium", "Houston"},
        {"36", "F", "Sáb 20 jun", "23:00", "Túnez", "Japón", "Estadio BBVA", "Monterrey"},
        {"37", "H", "Dom 21 jun", "17:00", "Uruguay", "Cabo Verde", "Hard Rock Stadium", "Miami"},
        {"38", "H", "Dom 21 jun", "11:00", "España", "Arabia Saudita", "Mercedes-Benz Stadium", "Atlanta"},
        {"39", "G", "Dom 21 jun", "14:00", "Bélgica", "Irán", "SoFi Stadium", "Inglewood"},
        {"40", "G", "Dom 21 jun", "20:00", "Nueva Zelanda", "Egipto", "BC Place", "Vancouver"},
        {"41", "I", "Lun 22 jun", "19:00", "Noruega", "Senegal", "MetLife Stadium", "East Rutherford"},
        {"42", "I", "Lun 22 jun", "16:00", "Francia", "Irak", "Lincoln Financial Field", "Filadelfia"},
        {"43", "J", "Lun 22 jun", "12:00", "Argentina", "Austria", "AT&T Stadium", "Arlington"},
        {"44", "J", "Lun 22 jun", "22:00", "Jordania", "Argelia", "Levi's Stadium", "Santa Clara"},
        {"45", "L", "Mar 23 jun", "15:00", "Inglaterra", "Ghana", "Gillette Stadium", "Foxborough"},
        {"46", "L", "Mar 23 jun", "18:00", "Panamá", "Croacia", "BMO Field", "Toronto"},
        {"47", "K", "Mar 23 jun", "12:00", "Portugal", "Uzbekistán", "NRG Stadium", "Houston"},
        {"48", "K", "Mar 23 jun", "21:00", "Colombia", "Congo RD", "Estadio Akron", "Guadalajara"},
        {"49", "C", "Mié 24 jun", "17:00", "Escocia", "Brasil", "Hard Rock Stadium", "Miami"},
        {"50", "C", "Mié 24 jun", "17:00", "Marruecos", "Haití", "Mercedes-Benz Stadium", "Atlanta"},
        {"51", "B", "Mié 24 jun", "14:00", "Suiza", "Canadá", "BC Place", "Vancouver"},
        {"52", "B", "Mié 24 jun", "14:00", "Bosnia y Herzegovina", "Qatar", "Lumen Field", "Seattle"},
        {"53", "A", "Mié 24 jun", "20:00", "Chequia", "México", "Estadio Azteca", "Ciudad de México"},
        {"54", "A", "Mié 24 jun", "20:00", "Sudáfrica", "Corea del Sur", "Estadio BBVA", "Monterrey"},
        {"55", "E", "Jue 25 jun", "15:00", "Curazao", "Costa de Marfil", "Lincoln Financial Field", "Filadelfia"},
        {"56", "E", "Jue 25 jun", "15:00", "Ecuador", "Alemania", "MetLife Stadium", "East Rutherford"},
        {"57", "F", "Jue 25 jun", "18:00", "Japón", "Suecia", "AT&T Stadium", "Arlington"},
        {"58", "F", "Jue 25 jun", "18:00", "Túnez", "Países Bajos", "Arrowhead Stadium", "Kansas City"},
        {"59", "D", "Jue 25 jun", "21:00", "Turquía", "Estados Unidos", "SoFi Stadium", "Inglewood"},
        {"60", "D", "Jue 25 jun", "21:00", "Paraguay", "Australia", "Levi's Stadium", "Santa Clara"},
        {"61", "I", "Vie 26 jun", "14:00", "Noruega", "Francia", "Gillette Stadium", "Foxborough"},
        {"62", "I", "Vie 26 jun", "14:00", "Senegal", "Irak", "BMO Field", "Toronto"},
        {"63", "G", "Vie 26 jun", "22:00", "Egipto", "Irán", "Lumen Field", "Seattle"},
        {"64", "G", "Vie 26 jun", "22:00", "Nueva Zelanda", "Bélgica", "BC Place", "Vancouver"},
        {"65", "H", "Vie 26 jun", "19:00", "Cabo Verde", "Arabia Saudita", "NRG Stadium", "Houston"},
        {"66", "H", "Vie 26 jun", "19:00", "Uruguay", "España", "Estadio Akron", "Guadalajara"},
        {"67", "L", "Sáb 27 jun", "16:00", "Panamá", "Inglaterra", "MetLife Stadium", "East Rutherford"},
        {"68", "L", "Sáb 27 jun", "16:00", "Croacia", "Ghana", "Lincoln Financial Field", "Filadelfia"},
        {"69", "J", "Sáb 27 jun", "21:00", "Argelia", "Austria", "Arrowhead Stadium", "Kansas City"},
        {"70", "J", "Sáb 27 jun", "21:00", "Jordania", "Argentina", "AT&T Stadium", "Arlington"},
        {"71", "K", "Sáb 27 jun", "18:30", "Colombia", "Portugal", "Hard Rock Stadium", "Miami"},
        {"72", "K", "Sáb 27 jun", "18:30", "Congo RD", "Uzbekistán", "Mercedes-Benz Stadium", "Atlanta"},
    };

    /* ---------- Lectura con validación ---------- */

    // Pide un entero entre min y max; repite hasta que sea válido
    static int leerEntero(String mensaje, int min, int max) {
        int valor = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            String texto = ConsoleInput.getString();
            try {
                valor = Integer.parseInt(texto.trim());
                if (valor < min || valor > max) {
                    System.out.println("Inválido: debe estar entre " + min + " y " + max);
                } else {
                    valido = true;
                }
            } catch (Exception e) {
                System.out.println("Inválido: ingresa un número");
            }
        }
        return valor;
    }

    // Pide una letra de grupo (A-L) y devuelve su índice (0-11)
    static int leerGrupo() {
        int indice = -1;
        while (indice < 0) {
            System.out.print("Ingresa la letra del grupo (A-L): ");
            String texto = ConsoleInput.getString();
            if (texto != null && texto.trim().length() == 1) {
                char letra = Character.toUpperCase(texto.trim().charAt(0));
                if (letra >= 'A' && letra < 'A' + TOTAL_GRUPOS) {
                    indice = letra - 'A';
                }
            }
            if (indice < 0) {
                System.out.println("Inválido: debe ser una letra entre A y L");
            }
        }
        return indice;
    }

    /* ---------- Impresión ---------- */

    static void imprimirMenu() {
        System.out.println();
        System.out.print(ConsoleColors.CYAN_BOLD);
        for (int i = 0; i < BANNER.length; i++) {
            System.out.println(BANNER[i]);
        }
        System.out.println(ConsoleColors.RESET);
        System.out.println("+------+-------------------------------------------+");
        System.out.println("| Num  | Opción                                    |");
        System.out.println("+------+-------------------------------------------+");
        System.out.println("| 1    | Ver los partidos de un grupo              |");
        System.out.println("| 2    | Ver los partidos de todos los grupos      |");
        System.out.println("| 3    | Ver hora e integrantes de un partido      |");
        System.out.println("| 4    | Salir                                     |");
        System.out.println("+------+-------------------------------------------+");
    }

    static void imprimirEncabezadoTabla() {
        String linea = "+-----+------------+-------+----------------------------------+--------------------------+------------------+";
        System.out.println(linea);
        System.out.printf("| %-3s | %-10s | %-5s | %-32s | %-24s | %-16s |\n",
            "#", "Fecha", "Hora", "Partido", "Estadio", "Ciudad");
        System.out.println(linea);
    }

    static void imprimirFilaPartido(String[] p) {
        System.out.printf("| %-3s | %-10s | %-5s | %-32s | %-24s | %-16s |\n",
            p[NUM], p[FECHA], p[HORA], p[EQUIPO1] + " vs " + p[EQUIPO2], p[ESTADIO], p[CIUDAD]);
    }

    // Imprime los 4 equipos y los 6 partidos del grupo indicado
    static void verGrupo(int indiceGrupo) {
        char letra = (char) ('A' + indiceGrupo);
        System.out.println();
        System.out.println(ConsoleColors.YELLOW_BOLD + "GRUPO " + letra + ConsoleColors.RESET);
        System.out.println("Equipos: " + String.join(", ", GRUPOS[indiceGrupo]));
        imprimirEncabezadoTabla();
        for (int i = 0; i < PARTIDOS.length; i++) {
            if (PARTIDOS[i][GRUPO].equals(String.valueOf(letra))) {
                imprimirFilaPartido(PARTIDOS[i]);
            }
        }
        System.out.println("+-----+------------+-------+----------------------------------+--------------------------+------------------+");
        System.out.println("Horas en Colombia (UTC-5).");
    }

    // Imprime la ficha de un partido específico (número 1-72)
    static void verPartido(int numero) {
        String[] p = PARTIDOS[numero - 1];
        System.out.println();
        System.out.println("+---------------------------------------------+");
        System.out.printf("| PARTIDO %-35s |\n", p[NUM] + " - GRUPO " + p[GRUPO]);
        System.out.println("+---------------------------------------------+");
        System.out.printf("| Equipo 1 : %-32s |\n", p[EQUIPO1]);
        System.out.printf("| Equipo 2 : %-32s |\n", p[EQUIPO2]);
        System.out.printf("| Fecha    : %-32s |\n", p[FECHA] + " 2026");
        System.out.printf("| Hora     : %-32s |\n", p[HORA] + " (hora Colombia)");
        System.out.printf("| Estadio  : %-32s |\n", p[ESTADIO]);
        System.out.printf("| Ciudad   : %-32s |\n", p[CIUDAD]);
        System.out.println("+---------------------------------------------+");
    }

    /* ---------- Programa principal ---------- */

    public static void main(String[] args) {
        boolean salir = false;
        do {
            imprimirMenu();
            int opcion = leerEntero("Ingresa un número de opción (1-4): ", 1, 4);

            switch (opcion) {
                case 1:
                    verGrupo(leerGrupo());
                    break;
                case 2:
                    for (int g = 0; g < TOTAL_GRUPOS; g++) {
                        verGrupo(g);
                    }
                    break;
                case 3:
                    verPartido(leerEntero("Ingresa el número del partido (1-" + TOTAL_PARTIDOS + "): ", 1, TOTAL_PARTIDOS));
                    break;
                case 4:
                    salir = true;
                    System.out.println("Hasta luego.");
                    break;
            }
        } while (!salir);
    }
}
