import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("  __  __                  __  __                 _      _       _   ");
        System.out.println(" |  \\/  | ___ _ __  _   _|  \\/  |_   _ _ __   __| |__ _| (_) __ _| |  ");
        System.out.println(" | |\\/| |/ _ \\ '_ \\| | | | |\\/| | | | | '_ \\ / _` / _` | |/ _` | |  ");
        System.out.println(" | |  | |  __/ | | | |_| | |  | | |_| | | | | (_| | (_| | | (_| | |  ");
        System.out.println(" |_|  |_|\\___|_| |_|\\__,_|_|  |_|\\__,_|_| |_|\\__,_|\\__,_|_|\\__,_|_|  ");
        System.out.println("==================================================");
        System.out.println(" [1] Ver bandera de países participantes");
        System.out.println(" [2] Consultar fixture");
        System.out.println(" [3] Tabla de posiciones");
        System.out.println(" [4] Ver info de los países");
        System.out.println(" [5] Salir");
        System.out.println("==================================================");
        System.out.print("Elige una opción: ");

        boolean valido = false;

        int opcion = 0;
        do {
            try {
                opcion = teclado.nextInt();
                valido = true;
            } catch (Exception e) {
                System.out.println("Elija una opción válida");
            }
        } while (!valido);

        switch (opcion) {
            case 1:// Ver bandera
                

                /*
                 * ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄
                 * ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄
                 * █████████████████████████████████████████████████████████████████████████████
                 * ███████████████████████████████████████████
                 */
                /*
                 * ___ ___ _ _ _____ __ _
                 * | \/ | | | (_) / __ \ / _(_)
                 * | . . | __ _| |_ _ __ _ ____ | / \/ ___ _ __ | |_ _ __ _
                 * | |\/| |/ _` | __| '__| |_ / | | / _ \| '_ \| _| |/ _` |
                 * | | | | (_| | |_| | | |/ / | \__/\ (_) | | | | | | | (_| |
                 * \_| |_/\__,_|\__|_| |_/___| \____/\___/|_| |_|_| |_|\__, |
                 * __/ |
                 * |___/
                 * 
                 * Configuramos la matriz para que tome datos del archivo csv basándonos en el
                 * repositorio
                 * de Xaca
                 */

                char[][] matriz = new char[480][15];

                BufferedReader archivo = new BufferedReader(
                        new FileReader("recursos/Flags.csv"));

                String linea;
                int fila = 0;

                while ((linea = archivo.readLine()) != null && fila < matriz.length) {

                    String[] columnas = linea.split(";");

                    for (int columna = 0; columna < columnas.length; columna++) {
                        matriz[fila][columna] = columnas[columna].charAt(0);
                    }

                    fila++; // Lo que se logra con esto es que la matriz que estaba vacía, quede llena justo
                            // con los datos del CSV
                }

                /*
                 * ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄
                 * ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄
                 * █████████████████████████████████████████████████████████████████████████████
                 * ███████████████████████████████████████████
                 */
                /*
                 * ____ _ _ _
                 * / ___|___ _ __ | |_ _ __ ___ | | __| | ___ ___ _ __ _ __ ___ _ __ ___ ___
                 * | | / _ \| '_ \| __| '__/ _ \| | / _` |/ _ \ / _ \ '__| '__/ _ \| '__/ _ \/
                 * __|
                 * | |__| (_) | | | | |_| | | (_) | | | (_| | __/ | __/ | | | | (_) | | | __/\__
                 * \
                 * \____\___/|_| |_|\__|_| \___/|_| \__,_|\___| \___|_| |_| \___/|_| \___||___/
                 * 
                 * Solo opera con la varible flag, le "permite el paso" si está entre 1 y 48, si
                 * es decimal,
                 * negativo, un texto o no está dentro del rango, el programa vuelve a pedir
                 * el número de bandera hasta que sea válido.
                 * 
                 */

                boolean salir = false;
                int flag = 0;
                do {
                    flag = 0;
                    String[] paises = {
                            "Inglaterra", "España", "Francia", "Cabo Verde", "Arabia Saudita",
                            "Corea del Sur", "Congo RD", "Ecuador", "Estados Unidos", "Argentina",
                            "Brasil", "Canadá", "Costa de Marfil", "Jordania", "Alemania",
                            "Japón", "Colombia", "Bélgica", "Turquía", "Sudáfrica",
                            "Chequia", "Suiza", "Portugal", "Egipto", "Paraguay",
                            "Escocia", "Haití", "Argelia", "México", "Marruecos",
                            "Austria", "Noruega", "Bosnia y Herzegovina", "Túnez", "Croacia",
                            "Países Bajos", "Uruguay", "Qatar", "Australia", "Nueva Zelanda",
                            "Senegal", "Ghana", "Panamá", "Irak", "Suecia",
                            "Curazao", "Irán", "Uzbekistán"
                    };

                    // Imprimir la tabla una sola vez
                    System.out.println("+------+---------------------------+");
                    System.out.println("| Num  | País                      |");
                    System.out.println("+------+---------------------------+");
                    for (int i = 0; i < paises.length; i++) {
                        System.out.println("| " + (i + 1) + "\t| " + paises[i]);
                    }
                    System.out.println("+------+---------------------------+");

                    while (flag < 1 || flag > paises.length) {
                        System.out.print("Ingresa un número de país (1-" + paises.length + "): ");
                        try {
                            flag = teclado.nextInt();
                            if (flag < 1 || flag > paises.length) {
                                System.out.println("Inválido: debe estar entre 1 y " + paises.length);
                            }
                        } catch (Exception e) {
                            System.out.println("Inválido: ingresa un número");
                            teclado.nextLine(); // limpia el buffer
                            flag = 0;
                        }
                    }
                    

                    switch (flag) {

                        // -------------------------------------------------------------
                        // Case 1: Inglaterra (Filas 61-70)
                        // -------------------------------------------------------------
                        case 1:
                            System.out.println("--------------------------------");
                            for (fila = (61) - 1; fila < 70; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 2: España (Filas 71-80)
                        // -------------------------------------------------------------
                        case 2:
                            System.out.println("--------------------------------");
                            for (fila = (71) - 1; fila < 80; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 3: Francia (Filas 81-90)
                        // -------------------------------------------------------------
                        case 3:
                            System.out.println("--------------------------------");
                            for (fila = (81) - 1; fila < 90; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 4: Cabo Verde (Filas 91-100)
                        // -------------------------------------------------------------
                        case 4:
                            System.out.println("--------------------------------");
                            for (fila = (91) - 1; fila < 100; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 5: Arabia Saudita (Filas 271-280)
                        // -------------------------------------------------------------
                        case 5:
                            System.out.println("--------------------------------");
                            for (fila = (271) - 1; fila < 280; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 6: Corea del Sur (Filas 101-110)
                        // -------------------------------------------------------------
                        case 6:
                            System.out.println("--------------------------------");
                            for (fila = (101) - 1; fila < 110; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 7: Congo RD (Filas 111-120)
                        // -------------------------------------------------------------
                        case 7:
                            System.out.println("--------------------------------");
                            for (fila = (111) - 1; fila < 120; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 8: Ecuador (Filas 121-130)
                        // -------------------------------------------------------------
                        case 8:
                            System.out.println("--------------------------------");
                            for (fila = (121) - 1; fila < 130; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 9: Estados Unidos (Filas 341-350)
                        // -------------------------------------------------------------
                        case 9:
                            System.out.println("--------------------------------");
                            for (fila = (341) - 1; fila < 350; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 10: Argentina (Filas 291-300)
                        // -------------------------------------------------------------
                        case 10:
                            System.out.println("--------------------------------");
                            for (fila = (291) - 1; fila < 300; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 11: Brasil (Filas 321-330)
                        // -------------------------------------------------------------
                        case 11:
                            System.out.println("--------------------------------");
                            for (fila = (321) - 1; fila < 330; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 12: Canadá (Filas 381-390)
                        // -------------------------------------------------------------
                        case 12:
                            System.out.println("--------------------------------");
                            for (fila = (381) - 1; fila < 390; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 13: Costa de Marfil (Filas 301-310)
                        // -------------------------------------------------------------
                        case 13:
                            System.out.println("--------------------------------");
                            for (fila = (301) - 1; fila < 310; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 14: Jordania (Filas 371-380)
                        // -------------------------------------------------------------
                        case 14:
                            System.out.println("--------------------------------");
                            for (fila = (371) - 1; fila < 380; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 15: Alemania (Filas 131-140)
                        // -------------------------------------------------------------
                        case 15:
                            System.out.println("--------------------------------");
                            for (fila = (131) - 1; fila < 140; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 16: Japón (Filas 161-170)
                        // -------------------------------------------------------------
                        case 16:
                            System.out.println("--------------------------------");
                            for (fila = (161) - 1; fila < 170; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 17: Colombia (Filas 191-200)
                        // -------------------------------------------------------------
                        case 17:
                            System.out.println("--------------------------------");
                            for (fila = (191) - 1; fila < 200; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 18: Bélgica (Filas 141-150)
                        // -------------------------------------------------------------
                        case 18:
                            System.out.println("--------------------------------");
                            for (fila = (141) - 1; fila < 150; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 19: Turquía (Filas 181-190)
                        // -------------------------------------------------------------
                        case 19:
                            System.out.println("--------------------------------");
                            for (fila = (181) - 1; fila < 190; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 20: Sudáfrica (Filas 171-180)
                        // -------------------------------------------------------------
                        case 20:
                            System.out.println("--------------------------------");
                            for (fila = (171) - 1; fila < 180; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 21: Chequia (Filas 151-160)
                        // -------------------------------------------------------------
                        case 21:
                            System.out.println("--------------------------------");
                            for (fila = (151) - 1; fila < 160; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 22: Suiza (Filas 221-230)
                        // -------------------------------------------------------------
                        case 22:
                            System.out.println("--------------------------------");
                            for (fila = (221) - 1; fila < 230; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 23: Portugal (Filas 241-250)
                        // -------------------------------------------------------------
                        case 23:
                            System.out.println("--------------------------------");
                            for (fila = (241) - 1; fila < 250; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 24: Egipto (Filas 231-240)
                        // -------------------------------------------------------------
                        case 24:
                            System.out.println("--------------------------------");
                            for (fila = (231) - 1; fila < 240; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 25: Paraguay (Filas 211-220)
                        // -------------------------------------------------------------
                        case 25:
                            System.out.println("--------------------------------");
                            for (fila = (211) - 1; fila < 220; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 26: Escocia (Filas 201-210)
                        // -------------------------------------------------------------
                        case 26:
                            System.out.println("--------------------------------");
                            for (fila = (201) - 1; fila < 210; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 27: Haití (Filas 251-260)
                        // -------------------------------------------------------------
                        case 27:
                            System.out.println("--------------------------------");
                            for (fila = (251) - 1; fila < 260; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 28: Argelia (Filas 261-270)
                        // -------------------------------------------------------------
                        case 28:
                            System.out.println("--------------------------------");
                            for (fila = (261) - 1; fila < 270; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 29: México (Filas 11-20)
                        // -------------------------------------------------------------
                        case 29:
                            System.out.println("--------------------------------");
                            for (fila = (11) - 1; fila < 20; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 30: Marruecos (Filas 21-30)
                        // -------------------------------------------------------------
                        case 30:
                            System.out.println("--------------------------------");
                            for (fila = (21) - 1; fila < 30; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 31: Austria (Filas 1-10)
                        // -------------------------------------------------------------
                        case 31:
                            System.out.println("--------------------------------");
                            for (fila = (1) - 1; fila < 10; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 32: Noruega (Filas 31-40)
                        // -------------------------------------------------------------
                        case 32:
                            System.out.println("--------------------------------");
                            for (fila = (31) - 1; fila < 40; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 33: Bosnia y Herzegovina (Filas 41-50)
                        // -------------------------------------------------------------
                        case 33:
                            System.out.println("--------------------------------");
                            for (fila = (41) - 1; fila < 50; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 34: Túnez (Filas 51-60)
                        // -------------------------------------------------------------
                        case 34:
                            System.out.println("--------------------------------");
                            for (fila = (51) - 1; fila < 60; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 35: Croacia (Filas 281-290)
                        // -------------------------------------------------------------
                        case 35:
                            System.out.println("--------------------------------");
                            for (fila = (281) - 1; fila < 290; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 36: Países Bajos (Filas 311-320)
                        // -------------------------------------------------------------
                        case 36:
                            System.out.println("--------------------------------");
                            for (fila = (311) - 1; fila < 320; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 37: Uruguay (Filas 351-360)
                        // -------------------------------------------------------------
                        case 37:
                            System.out.println("--------------------------------");
                            for (fila = (351) - 1; fila < 360; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 38: Qatar (Filas 331-340)
                        // -------------------------------------------------------------
                        case 38:
                            System.out.println("--------------------------------");
                            for (fila = (331) - 1; fila < 340; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 39: Australia (Filas 391-400)
                        // -------------------------------------------------------------
                        case 39:
                            System.out.println("--------------------------------");
                            for (fila = (391) - 1; fila < 400; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 40: Nueva Zelanda (Filas 401-410)
                        // -------------------------------------------------------------
                        case 40:
                            System.out.println("--------------------------------");
                            for (fila = (401) - 1; fila < 410; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 41: Senegal (Filas 361-370)
                        // -------------------------------------------------------------
                        case 41:
                            System.out.println("--------------------------------");
                            for (fila = (361) - 1; fila < 370; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 42: Ghana (Filas 471-480)
                        // -------------------------------------------------------------
                        case 42:
                            System.out.println("--------------------------------");
                            for (fila = (471) - 1; fila < 480; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 43: Panamá (Filas 411-420)
                        // -------------------------------------------------------------
                        case 43:
                            System.out.println("--------------------------------");
                            for (fila = (411) - 1; fila < 420; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 44: Irak (Filas 461-470)
                        // -------------------------------------------------------------
                        case 44:
                            System.out.println("--------------------------------");
                            for (fila = (461) - 1; fila < 470; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 45: Suecia (Filas 431-440)
                        // -------------------------------------------------------------
                        case 45:
                            System.out.println("--------------------------------");
                            for (fila = (431) - 1; fila < 440; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 46: Curazao (Filas 421-430)
                        // -------------------------------------------------------------
                        case 46:
                            System.out.println("--------------------------------");
                            for (fila = (421) - 1; fila < 430; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 47: Irán (Filas 441-450)
                        // -------------------------------------------------------------
                        case 47:
                            System.out.println("--------------------------------");
                            for (fila = (441) - 1; fila < 450; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                        // -------------------------------------------------------------
                        // Case 48: Uzbekistán (Filas 451-460)
                        // -------------------------------------------------------------
                        case 48:
                            System.out.println("--------------------------------");
                            for (fila = (451) - 1; fila < 460; fila++) {
                                for (int columna = 0; columna < matriz[fila].length; columna++) {
                                    if (matriz[fila][columna] == '1') {
                                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '2') {
                                        System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '3') {
                                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '4') {
                                        System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '5') {
                                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '6') {
                                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '7') {
                                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '8') {
                                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                                    }
                                    if (matriz[fila][columna] == '9') {
                                        System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                                    }
                                    System.out.print(ConsoleColors.RESET);
                                }
                                System.out.println();
                            }
                            break;

                    }

                    System.out.print("Salir? (s/n): ");
                    char c = teclado.next().charAt(0);
                    if (c == 's') {
                        salir = true;
                    }

                } while (!salir);

                break;
            case 2:// Fixture
                String[] banner = {
                        " _____ _____  _______ _   _ ____  _____",
                        "|  ___|_ _\\ \\/ /_   _| | | |  _ \\| ____|",
                        "| |_   | | \\  /  | | | | | | |_) |  _|",
                        "|  _|  | | /  \\  | | | |_| |  _ <| |___",
                        "|_|   |___/_/\\_\\ |_|  \\___/|_| \\_\\_____|"
                };

                // Fila 0 = Grupo A, fila 1 = Grupo B, ... fila 11 = Grupo L
                String[][] grupos = {
                        { "México", "Sudáfrica", "Corea del Sur", "Chequia" },
                        { "Canadá", "Suiza", "Qatar", "Bosnia y Herzegovina" },
                        { "Brasil", "Marruecos", "Haití", "Escocia" },
                        { "Estados Unidos", "Paraguay", "Australia", "Turquía" },
                        { "Alemania", "Curazao", "Costa de Marfil", "Ecuador" },
                        { "Países Bajos", "Japón", "Túnez", "Suecia" },
                        { "Bélgica", "Egipto", "Irán", "Nueva Zelanda" },
                        { "España", "Cabo Verde", "Arabia Saudita", "Uruguay" },
                        { "Francia", "Senegal", "Noruega", "Irak" },
                        { "Argentina", "Argelia", "Austria", "Jordania" },
                        { "Portugal", "Colombia", "Uzbekistán", "Congo RD" },
                        { "Inglaterra", "Croacia", "Ghana", "Panamá" },
                };

                // {número, grupo, fecha (COL), hora (COL), equipo 1, equipo 2, estadio, ciudad}
                String[][] partidos = {
                        { "1", "A", "Jue 11 jun", "14:00", "México", "Sudáfrica", "Estadio Azteca",
                                "Ciudad de México" },
                        { "2", "A", "Jue 11 jun", "21:00", "Corea del Sur", "Chequia", "Estadio Akron", "Guadalajara" },
                        { "3", "B", "Vie 12 jun", "14:00", "Canadá", "Bosnia y Herzegovina", "BMO Field", "Toronto" },
                        { "4", "D", "Vie 12 jun", "20:00", "Estados Unidos", "Paraguay", "SoFi Stadium", "Inglewood" },
                        { "5", "C", "Sáb 13 jun", "20:00", "Haití", "Escocia", "Gillette Stadium", "Foxborough" },
                        { "6", "D", "Sáb 13 jun", "23:00", "Australia", "Turquía", "BC Place", "Vancouver" },
                        { "7", "C", "Sáb 13 jun", "17:00", "Brasil", "Marruecos", "MetLife Stadium",
                                "East Rutherford" },
                        { "8", "B", "Sáb 13 jun", "14:00", "Qatar", "Suiza", "Levi's Stadium", "Santa Clara" },
                        { "9", "E", "Dom 14 jun", "18:00", "Costa de Marfil", "Ecuador", "Lincoln Financial Field",
                                "Filadelfia" },
                        { "10", "E", "Dom 14 jun", "12:00", "Alemania", "Curazao", "NRG Stadium", "Houston" },
                        { "11", "F", "Dom 14 jun", "15:00", "Países Bajos", "Japón", "AT&T Stadium", "Arlington" },
                        { "12", "F", "Dom 14 jun", "21:00", "Suecia", "Túnez", "Estadio BBVA", "Monterrey" },
                        { "13", "H", "Lun 15 jun", "17:00", "Arabia Saudita", "Uruguay", "Hard Rock Stadium", "Miami" },
                        { "14", "H", "Lun 15 jun", "11:00", "España", "Cabo Verde", "Mercedes-Benz Stadium",
                                "Atlanta" },
                        { "15", "G", "Lun 15 jun", "20:00", "Irán", "Nueva Zelanda", "SoFi Stadium", "Inglewood" },
                        { "16", "G", "Lun 15 jun", "14:00", "Bélgica", "Egipto", "Lumen Field", "Seattle" },
                        { "17", "I", "Mar 16 jun", "14:00", "Francia", "Senegal", "MetLife Stadium",
                                "East Rutherford" },
                        { "18", "I", "Mar 16 jun", "17:00", "Irak", "Noruega", "Gillette Stadium", "Foxborough" },
                        { "19", "J", "Mar 16 jun", "20:00", "Argentina", "Argelia", "Arrowhead Stadium",
                                "Kansas City" },
                        { "20", "J", "Mar 16 jun", "23:00", "Austria", "Jordania", "Levi's Stadium", "Santa Clara" },
                        { "21", "L", "Mié 17 jun", "18:00", "Ghana", "Panamá", "BMO Field", "Toronto" },
                        { "22", "L", "Mié 17 jun", "15:00", "Inglaterra", "Croacia", "AT&T Stadium", "Arlington" },
                        { "23", "K", "Mié 17 jun", "12:00", "Portugal", "Congo RD", "NRG Stadium", "Houston" },
                        { "24", "K", "Mié 17 jun", "21:00", "Uzbekistán", "Colombia", "Estadio Azteca",
                                "Ciudad de México" },
                        { "25", "A", "Jue 18 jun", "11:00", "Chequia", "Sudáfrica", "Mercedes-Benz Stadium",
                                "Atlanta" },
                        { "26", "B", "Jue 18 jun", "14:00", "Suiza", "Bosnia y Herzegovina", "SoFi Stadium",
                                "Inglewood" },
                        { "27", "B", "Jue 18 jun", "17:00", "Canadá", "Qatar", "BC Place", "Vancouver" },
                        { "28", "A", "Jue 18 jun", "20:00", "México", "Corea del Sur", "Estadio Akron", "Guadalajara" },
                        { "29", "C", "Vie 19 jun", "19:30", "Brasil", "Haití", "Lincoln Financial Field",
                                "Filadelfia" },
                        { "30", "C", "Vie 19 jun", "17:00", "Escocia", "Marruecos", "Gillette Stadium", "Foxborough" },
                        { "31", "D", "Vie 19 jun", "22:00", "Turquía", "Paraguay", "Levi's Stadium", "Santa Clara" },
                        { "32", "D", "Vie 19 jun", "14:00", "Estados Unidos", "Australia", "Lumen Field", "Seattle" },
                        { "33", "E", "Sáb 20 jun", "15:00", "Alemania", "Costa de Marfil", "BMO Field", "Toronto" },
                        { "34", "E", "Sáb 20 jun", "19:00", "Ecuador", "Curazao", "Arrowhead Stadium", "Kansas City" },
                        { "35", "F", "Sáb 20 jun", "12:00", "Países Bajos", "Suecia", "NRG Stadium", "Houston" },
                        { "36", "F", "Sáb 20 jun", "23:00", "Túnez", "Japón", "Estadio BBVA", "Monterrey" },
                        { "37", "H", "Dom 21 jun", "17:00", "Uruguay", "Cabo Verde", "Hard Rock Stadium", "Miami" },
                        { "38", "H", "Dom 21 jun", "11:00", "España", "Arabia Saudita", "Mercedes-Benz Stadium",
                                "Atlanta" },
                        { "39", "G", "Dom 21 jun", "14:00", "Bélgica", "Irán", "SoFi Stadium", "Inglewood" },
                        { "40", "G", "Dom 21 jun", "20:00", "Nueva Zelanda", "Egipto", "BC Place", "Vancouver" },
                        { "41", "I", "Lun 22 jun", "19:00", "Noruega", "Senegal", "MetLife Stadium",
                                "East Rutherford" },
                        { "42", "I", "Lun 22 jun", "16:00", "Francia", "Irak", "Lincoln Financial Field",
                                "Filadelfia" },
                        { "43", "J", "Lun 22 jun", "12:00", "Argentina", "Austria", "AT&T Stadium", "Arlington" },
                        { "44", "J", "Lun 22 jun", "22:00", "Jordania", "Argelia", "Levi's Stadium", "Santa Clara" },
                        { "45", "L", "Mar 23 jun", "15:00", "Inglaterra", "Ghana", "Gillette Stadium", "Foxborough" },
                        { "46", "L", "Mar 23 jun", "18:00", "Panamá", "Croacia", "BMO Field", "Toronto" },
                        { "47", "K", "Mar 23 jun", "12:00", "Portugal", "Uzbekistán", "NRG Stadium", "Houston" },
                        { "48", "K", "Mar 23 jun", "21:00", "Colombia", "Congo RD", "Estadio Akron", "Guadalajara" },
                        { "49", "C", "Mié 24 jun", "17:00", "Escocia", "Brasil", "Hard Rock Stadium", "Miami" },
                        { "50", "C", "Mié 24 jun", "17:00", "Marruecos", "Haití", "Mercedes-Benz Stadium", "Atlanta" },
                        { "51", "B", "Mié 24 jun", "14:00", "Suiza", "Canadá", "BC Place", "Vancouver" },
                        { "52", "B", "Mié 24 jun", "14:00", "Bosnia y Herzegovina", "Qatar", "Lumen Field", "Seattle" },
                        { "53", "A", "Mié 24 jun", "20:00", "Chequia", "México", "Estadio Azteca", "Ciudad de México" },
                        { "54", "A", "Mié 24 jun", "20:00", "Sudáfrica", "Corea del Sur", "Estadio BBVA", "Monterrey" },
                        { "55", "E", "Jue 25 jun", "15:00", "Curazao", "Costa de Marfil", "Lincoln Financial Field",
                                "Filadelfia" },
                        { "56", "E", "Jue 25 jun", "15:00", "Ecuador", "Alemania", "MetLife Stadium",
                                "East Rutherford" },
                        { "57", "F", "Jue 25 jun", "18:00", "Japón", "Suecia", "AT&T Stadium", "Arlington" },
                        { "58", "F", "Jue 25 jun", "18:00", "Túnez", "Países Bajos", "Arrowhead Stadium",
                                "Kansas City" },
                        { "59", "D", "Jue 25 jun", "21:00", "Turquía", "Estados Unidos", "SoFi Stadium", "Inglewood" },
                        { "60", "D", "Jue 25 jun", "21:00", "Paraguay", "Australia", "Levi's Stadium", "Santa Clara" },
                        { "61", "I", "Vie 26 jun", "14:00", "Noruega", "Francia", "Gillette Stadium", "Foxborough" },
                        { "62", "I", "Vie 26 jun", "14:00", "Senegal", "Irak", "BMO Field", "Toronto" },
                        { "63", "G", "Vie 26 jun", "22:00", "Egipto", "Irán", "Lumen Field", "Seattle" },
                        { "64", "G", "Vie 26 jun", "22:00", "Nueva Zelanda", "Bélgica", "BC Place", "Vancouver" },
                        { "65", "H", "Vie 26 jun", "19:00", "Cabo Verde", "Arabia Saudita", "NRG Stadium", "Houston" },
                        { "66", "H", "Vie 26 jun", "19:00", "Uruguay", "España", "Estadio Akron", "Guadalajara" },
                        { "67", "L", "Sáb 27 jun", "16:00", "Panamá", "Inglaterra", "MetLife Stadium",
                                "East Rutherford" },
                        { "68", "L", "Sáb 27 jun", "16:00", "Croacia", "Ghana", "Lincoln Financial Field",
                                "Filadelfia" },
                        { "69", "J", "Sáb 27 jun", "21:00", "Argelia", "Austria", "Arrowhead Stadium", "Kansas City" },
                        { "70", "J", "Sáb 27 jun", "21:00", "Jordania", "Argentina", "AT&T Stadium", "Arlington" },
                        { "71", "K", "Sáb 27 jun", "18:30", "Colombia", "Portugal", "Hard Rock Stadium", "Miami" },
                        { "72", "K", "Sáb 27 jun", "18:30", "Congo RD", "Uzbekistán", "Mercedes-Benz Stadium",
                                "Atlanta" },
                };

                // Posición de cada dato dentro de una fila de partidos
                int posNumero = 0;
                int posGrupo = 1;
                int posFecha = 2;
                int posHora = 3;
                int posEquipo1 = 4;
                int posEquipo2 = 5;
                int posEstadio = 6;
                int posCiudad = 7;

                // Línea que separa las filas de la tabla de partidos
                String linea1 = "+-----+------------+-------+----------------------------------+--------------------------+------------------+";

                String texto = "";

                boolean salir1 = false;

                do {
                    /* ---------- Menú ---------- */
                    System.out.println();
                    System.out.print(ConsoleColors.CYAN_BOLD);
                    for (int i = 0; i < banner.length; i++) {
                        System.out.println(banner[i]);
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

                    /* ---------- Leer la opción (control de errores) ---------- */
                    int opcion2 = 0;
                    valido = false;
                    while (!valido) {
                        System.out.print("Ingresa un número de opción (1-4): ");
                        texto = ConsoleInput.getString();
                        try {
                            opcion2 = Integer.parseInt(texto.trim());
                            if (opcion < 1 || opcion > 4) {
                                System.out.println("Inválido: debe estar entre 1 y 4");
                            } else {
                                valido = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Inválido: ingresa un número");
                        }
                    }

                    if (opcion2 == 1 || opcion2 == 2) {
                        /* ---------- Ver grupos ---------- */
                        // Opción 2: se recorren los 12 grupos. Opción 1: solo el grupo elegido
                        int primerGrupo = 0;
                        int ultimoGrupo = grupos.length - 1;

                        if (opcion2 == 1) {
                            int indiceGrupo = -1;
                            while (indiceGrupo < 0) {
                                System.out.print("Ingresa la letra del grupo (A-L): ");
                                texto = ConsoleInput.getString().trim();
                                if (texto.length() == 1) {
                                    char letraLeida = Character.toUpperCase(texto.charAt(0));
                                    if (letraLeida >= 'A' && letraLeida < 'A' + grupos.length) {
                                        indiceGrupo = letraLeida - 'A';
                                    }
                                }
                                if (indiceGrupo < 0) {
                                    System.out.println("Inválido: debe ser una letra entre A y L");
                                }
                            }
                            primerGrupo = indiceGrupo;
                            ultimoGrupo = indiceGrupo;
                        }

                        for (int g = primerGrupo; g <= ultimoGrupo; g++) {
                            char letra = (char) ('A' + g);

                            // Armar el texto con los 4 equipos del grupo
                            String equipos = "";
                            for (int e = 0; e < grupos[g].length; e++) {
                                equipos = equipos + grupos[g][e];
                                if (e < grupos[g].length - 1) {
                                    equipos = equipos + ", ";
                                }
                            }

                            System.out.println();
                            System.out.println(ConsoleColors.YELLOW_BOLD + "GRUPO " + letra + ConsoleColors.RESET);
                            System.out.println("Equipos: " + equipos);
                            System.out.println(linea1);
                            System.out.printf("| %-3s | %-10s | %-5s | %-32s | %-24s | %-16s |\n",
                                    "#", "Fecha", "Hora", "Partido", "Estadio", "Ciudad");
                            System.out.println(linea1);

                            // Imprimir solo los partidos que pertenecen a este grupo
                            for (int i = 0; i < partidos.length; i++) {
                                if (partidos[i][posGrupo].equals(String.valueOf(letra))) {
                                    System.out.printf("| %-3s | %-10s | %-5s | %-32s | %-24s | %-16s |\n",
                                            partidos[i][posNumero], partidos[i][posFecha], partidos[i][posHora],
                                            partidos[i][posEquipo1] + " vs " + partidos[i][posEquipo2],
                                            partidos[i][posEstadio], partidos[i][posCiudad]);
                                }
                            }
                            System.out.println(linea1);
                            System.out.println("Horas en Colombia (UTC-5).");
                        }

                    } else if (opcion2 == 3) {
                        /* ---------- Ver un partido ---------- */
                        int numero = 0;
                        valido = false;
                        while (!valido) {
                            System.out.print("Ingresa el número del partido (1-" + partidos.length + "): ");
                            texto = ConsoleInput.getString();
                            try {
                                numero = Integer.parseInt(texto.trim());
                                if (numero < 1 || numero > partidos.length) {
                                    System.out.println("Inválido: debe estar entre 1 y " + partidos.length);
                                } else {
                                    valido = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Inválido: ingresa un número");
                            }
                        }

                        String[] p = partidos[numero - 1];
                        System.out.println();
                        System.out.println("+---------------------------------------------+");
                        System.out.printf("| PARTIDO %-35s |\n", p[posNumero] + " - GRUPO " + p[posGrupo]);
                        System.out.println("+---------------------------------------------+");
                        System.out.printf("| Equipo 1 : %-32s |\n", p[posEquipo1]);
                        System.out.printf("| Equipo 2 : %-32s |\n", p[posEquipo2]);
                        System.out.printf("| Fecha    : %-32s |\n", p[posFecha] + " 2026");
                        System.out.printf("| Hora     : %-32s |\n", p[posHora] + " (hora Colombia)");
                        System.out.printf("| Estadio  : %-32s |\n", p[posEstadio]);
                        System.out.printf("| Ciudad   : %-32s |\n", p[posCiudad]);
                        System.out.println("+---------------------------------------------+");

                    } else {
                        /* ---------- Salir ---------- */
                        salir1 = true;
                        System.out.println("Hasta luego.");
                    }

                } while (!salir1);

                break;
            case 3:// Tabla de posiciones
                   // Arreglo de los 48 clasificados
                String[] equipos = {
                        "Mexico", "Marruecos", "Noruega", "Austria", "Bosnia y Herzegovina",
                        "Tunez", "Inglaterra", "España", "Francia", "Cabo Verde",
                        "Corea del Sur", "Congo RD", "Ecuador", "Alemania", "Belgica",
                        "Chequia", "Japon", "Sudafrica", "Turquia", "Colombia",
                        "Escocia", "Paraguay", "Suiza", "Egipto", "Portugal",
                        "Haiti", "Argelia", "Arabia Saudi", "Croacia", "Argentina",
                        "Costa de Marfil", "Paises Bajos", "Brasil", "Qatar", "Estados Unidos",
                        "Uruguay", "Senegal", "Jordania", "Canada", "Australia",
                        "Nueva Zelanda", "Panama", "Curazao", "Suecia", "Iran",
                        "Uzbekistan", "Irak", "Ghana"
                };

                String[] columnas = { "PJ", "PG", "PE", "PP", "GF", "GC", "DG", "TA", "TR", "Pts" };

                // Matriz de posiciones
                int[][] tabla = new int[48][10];

                // Variables de paginación
                int equiposPorPagina = 10;
                int pagina = 0;
                int totalPaginas = (int) Math.ceil(equipos.length / (double) equiposPorPagina);

                int opcion1 = 0; // Inicializada en 0 por seguridad

                // Ciclo principal del menú
                System.out.println("  __  __ _    _ _   _ _____ _____          _       ___   ___ ___   __   ");
                System.out.println(" |  \\/  | |  | | \\ | |  __ \\_   _|   /\\   | |     |__ \\ / _ \\__ \\ / /   ");
                System.out.println(" | \\  / | |  | |  \\| | |  | || |    /  \\  | |        ) | | | | ) / /_   ");
                System.out.println(" | |\\/| | |  | | . ` | |  | || |   / /\\ \\ | |       / /| | | |/ / '_ \\  ");
                System.out.println(" | |  | | |__| | |\\  | |__| || |_ / ____ \\| |____  / /_| |_| / /| (_) | ");
                System.out.println(" |_|  |_|\\____/|_| \\_|_____/_____/_/    \\_\\______||____|\\___/____\\___/  ");
                System.out.println("         --- DE TABLA DE POSICIONES FIFA ---                  \n");

                do {
                    try {

                        System.out.println("Página " + (pagina + 1) + " de " + totalPaginas + "\n");

                        // Imprimir encabezado
                        System.out.printf("%-25s", "SELECCION");
                        for (int i = 0; i < columnas.length; i++) {
                            System.out.printf("%5s", columnas[i]);
                        }
                        System.out.println();

                        // Calcular límites de la página actual
                        int inicio = pagina * equiposPorPagina;
                        int fin = Math.min(inicio + equiposPorPagina, equipos.length);

                        // Mostrar los equipos
                        for (int i = inicio; i < fin; i++) {
                            System.out.printf("%-25s", equipos[i]);
                            for (int j = 0; j < 10; j++) {
                                System.out.printf("%5d", tabla[i][j]);
                            }
                            System.out.println();
                        }

                        // Menú de opciones
                        System.out.print(
                                "\n1. Página siguiente\n2. Página anterior\n3. Editar equipo\n4. Salir\nElige una opción: ");

                       
                        opcion1 = Integer.parseInt(teclado.nextLine());

                        switch (opcion1) {
                            case 1:
                                if (pagina < totalPaginas - 1) {
                                    pagina++;
                                } else {
                                    System.out.println("-> Ya estás en la última página.");
                                }
                                break;

                            case 2:
                                if (pagina > 0) {
                                    pagina--;
                                } else {
                                    System.out.println("-> Ya estás en la primera página.");
                                }
                                break;

                            case 3:
                                System.out.println("\n--- EDITAR EQUIPO ---");
                                for (int i = inicio; i < fin; i++) {
                                    System.out.println((i - inicio + 1) + ". " + equipos[i]);
                                }

                                System.out.print("Selecciona el número del equipo: ");
                                int equipoSeleccionado = Integer.parseInt(teclado.nextLine());
                                int fila2 = inicio + equipoSeleccionado - 1;
                            
                                if (fila2 >= inicio && fila2 < fin) {
                                    System.out.println("\nEditando: " + equipos[fila2]);
                                    for (int j = 0; j < 10; j++) {
                                        System.out.println((j + 1) + ". " + columnas[j] + " = " + tabla[fila2][j]);
                                    }

                                    System.out.print("\n¿Qué columna deseas editar? (1-10): ");
                                    int columna = Integer.parseInt(teclado.nextLine()) - 1;

                                    if (columna >= 0 && columna < 10) {
                                        System.out.print("Ingresa el nuevo valor para " + columnas[columna] + ": ");
                                        tabla[fila2][columna] = teclado.nextInt();
                                        do{                                            
                                                System.out.print("Escriba un valor positivo: ");
                                                tabla[fila2][columna] = teclado.nextInt();
                                        }while(tabla[fila2][columna] < 0);
                                        
                                        System.out.println("-> ¡Valor actualizado correctamente!");
                                    } else {
                                        System.out.println("-> Columna inválida.");
                                    }
                                } else {
                                    System.out.println("-> El equipo seleccionado no es válido.");
                                }
                                break;

                            case 4:
                                System.out.println("\nCerrando programa...");
                                break;

                            default:
                                System.out.println("-> Opción no válida, intenta de nuevo.");
                        }

                    } catch (NumberFormatException e) {
                        // SI EL USUARIO ESCRIBE LETRAS, EL PROGRAMA SALTA AQUÍ
                        System.out.println(
                                "\n-> ¡ERROR! Ingresaste una letra o un valor inválido. Vuelve a intentar usando solo números.");
                        // Opcion se queda igual, así que el bucle simplemente se repite y vuelve a
                        // mostrar el menú.
                    }

                } while (opcion1 != 4);

                break;
            case 4:
                String[] paises = {
                        "Inglaterra", "España", "Francia", "Cabo Verde", "Arabia Saudita",
                        "Corea del Sur", "Congo RD", "Ecuador", "Estados Unidos", "Argentina",
                        "Brasil", "Canadá", "Costa de Marfil", "Jordania", "Alemania",
                        "Japón", "Colombia", "Bélgica", "Turquía", "Sudáfrica",
                        "Chequia", "Suiza", "Portugal", "Egipto", "Paraguay",
                        "Escocia", "Haití", "Argelia", "México", "Marruecos",
                        "Austria", "Noruega", "Bosnia y Herzegovina", "Túnez", "Croacia",
                        "Países Bajos", "Uruguay", "Qatar", "Australia", "Nueva Zelanda",
                        "Senegal", "Ghana", "Panamá", "Irak", "Suecia",
                        "Curazao", "Irán", "Uzbekistán"
                };

                // Imprimir la tabla de selección una sola vez
                System.out.println("+------+---------------------------+");
                System.out.println("| Num  | País                      |");
                System.out.println("+------+---------------------------+");
                for (int i = 0; i < paises.length; i++) {
                    System.out.println("| " + (i + 1) + "\t| " + paises[i]);
                }
                System.out.println("+------+---------------------------+");

                // Control de errores
                int pais = 0;
                while (pais < 1 || pais > paises.length) {
                    System.out.print("Ingresa un número de país (1-" + paises.length + "): ");
                    try {
                        pais = teclado.nextInt();
                        if (pais < 1 || pais > paises.length) {
                            System.out.println("Inválido: debe estar entre 1 y " + paises.length);
                        }
                    } catch (Exception e) {
                        System.out.println("Inválido: ingresa un número");
                        teclado.nextLine(); // limpia el buffer
                        pais = 0;
                    }
                }

                System.out.println("Elegiste: " + paises[pais - 1]);

                System.out.println("");

                // Variables para los datos del país seleccionado
                String capital = "";
                String apariciones = "";
                String titular = "";

                switch (pais) {
                    case 1: // Inglaterra
                        capital = "Londres";
                        apariciones = "17";
                        titular = "Pickford; Alexander-Arnold, Stones, Guéhi, Colwill; Rice, Bellingham, Palmer; Saka, Kane, Foden";
                        break;
                    case 2: // España
                        capital = "Madrid";
                        apariciones = "17";
                        titular = "Unai Simón; Carvajal, Le Normand, Laporte, Cucurella; Rodri, Fabián Ruiz, Pedri; Lamine Yamal, Morata, Nico Williams";
                        break;
                    case 3: // Francia
                        capital = "París";
                        apariciones = "17";
                        titular = "Maignan; Koundé, Saliba, Upamecano, T. Hernández; Tchouaméni, Rabiot, Zaïre-Emery; Dembélé, Mbappé, Barcola";
                        break;
                    case 4: // Cabo Verde
                        capital = "Praia";
                        apariciones = "1";
                        titular = "Vozinha; Steven Moreira, Logan Costa, Roberto Lopes, Joao Paulo; Jamiro Monteiro, Kevin Pina, Deroy Duarte; Ryan Mendes, Bébé, Jovane Cabral";
                        break;
                    case 5: // Arabia Saudita
                        capital = "Riad";
                        apariciones = "7";
                        titular = "Al-Owais; Abdulhamid, Tambakti, Al-Bulaihi, Kadesh; Al-Khaibari, Kanno, Al-Juwayr; Al-Dawsari, Al-Buraikan, Yahya";
                        break;
                    case 6: // Corea del Sur
                        capital = "Seúl";
                        apariciones = "12";
                        titular = "Jo Hyeon-woo; Seol Young-woo, Kim Min-jae, Cho Yu-min, Lee Ki-je; Hwang In-beom, Park Yong-woo; Lee Kang-in, Jae-sung Lee, Son Heung-min; Hwang Hee-chan";
                        break;
                    case 7: // Congo RD
                        capital = "Kinchasa";
                        apariciones = "1 (1974 como Zaire)";
                        titular = "Mpasi; Kalulu, Mbemba, Baka, Masuaku; Pickel, Moutoussamy, Kakuta; Elia, Bakambu, Wissa";
                        break;
                    case 8: // Ecuador
                        capital = "Quito";
                        apariciones = "5";
                        titular = "Galíndez; Preciado, Félix Torres, Hincapié, Estupiñán; Moisés Caicedo, Alan Franco, Kendry Páez; Gonzalo Plata, Enner Valencia, Jeremy Sarmiento";
                        break;
                    case 9: // Estados Unidos
                        capital = "Washington D.C.";
                        apariciones = "12";
                        titular = "Turner; Scally, Richards, Ream, Robinson; McKennie, Adams, Musah; Weah, Balogun, Pulisic";
                        break;
                    case 10: // Argentina
                        capital = "Buenos Aires";
                        apariciones = "19";
                        titular = "Dibu Martínez; Molina, Romero, Otamendi, Tagliafico; De Paul, Enzo Fernández, Mac Allister; Messi, Lautaro Martínez, Julián Álvarez";
                        break;
                    case 11: // Brasil
                        capital = "Brasilia";
                        apariciones = "23";
                        titular = "Alisson; Danilo, Marquinhos, Gabriel Magalhães, Arana; Bruno Guimarães, Lucas Paquetá, Rodrygo; Raphinha, Endrick, Vinícius Jr.";
                        break;
                    case 12: // Canadá
                        capital = "Ottawa";
                        apariciones = "3";
                        titular = "Crépeau; Johnston, Bombito, Cornelius, Davies; Osorio, Eustáquio, Koné; Buchanan, Jonathan David, Larin";
                        break;
                    case 13: // Costa de Marfil
                        capital = "Yamusukro";
                        apariciones = "4";
                        titular = "Fofana; Singo, Kossounou, Ndicka, Konan; Kessié, Seri, Seko Fofana; Adingra, Haller, Simon Adingra";
                        break;
                    case 14: // Jordania
                        capital = "Amán";
                        apariciones = "1";
                        titular = "Abulaila; Nasib, Arab, Marie; Haddad, Al-Rashdan, Al-Rawabdeh, Al-Mardi; Al-Tamari, Olwan, Al-Naimat";
                        break;
                    case 15: // Alemania
                        capital = "Berlín";
                        apariciones = "21";
                        titular = "Ter Stegen; Kimmich, Tah, Rüdiger, Mittelstädt; Andrich, Pavlović; Musiala, Wirtz, Sané; Füllkrug";
                        break;
                    case 16: // Japón
                        capital = "Tokio";
                        apariciones = "8";
                        titular = "Suzuki; Sugawara, Itakura, Taniguchi, Ito; Endo, Morita; Doan, Kubo, Mitoma; Ueda";
                        break;
                    case 17: // Colombia
                        capital = "Bogotá";
                        apariciones = "7";
                        titular = "Vargas; Muñoz, Sánchez, Cuesta, Mojica; Lerma, Ríos, Arias; James Rodríguez, Jhon Córdoba, Luis Díaz";
                        break;
                    case 18: // Bélgica
                        capital = "Bruselas";
                        apariciones = "15";
                        titular = "Casteels; Castagne, Faes, Debast, De Cuyper; Onana, Tielemans, De Bruyne; Doku, Lukaku, Bakayoko";
                        break;
                    case 19: // Turquía
                        capital = "Ankara";
                        apariciones = "3";
                        titular = "Günok; Müldür, Demiral, Bardakcı, Kadıoğlu; Özcan, Yüksek; Arda Güler, Çalhanoğlu, Yıldız; Barış Alper Yılmaz";
                        break;
                    case 20: // Sudáfrica
                        capital = "Pretoria";
                        apariciones = "4";
                        titular = "Williams; Mudau, Xulu, Mvala, Modiba; Mokoena, Sithole; Morena, Zwane, Appollis; Makgopa";
                        break;
                    case 21: // Chequia
                        capital = "Praga";
                        apariciones = "2";
                        titular = "Staněk; Coufal, Holeš, Krejčí, Jurásek; Souček, Provod; Černý, Schick, Hložek; Kuchta";
                        break;
                    case 22: // Suiza
                        capital = "Berna";
                        apariciones = "13";
                        titular = "Sommer; Widmer, Akanji, Rodríguez; Aebischer, Xhaka, Freuler, Ndoye; Rieder, Embolo, Vargas";
                        break;
                    case 23: // Portugal
                        capital = "Lisboa";
                        apariciones = "9";
                        titular = "Diogo Costa; Dalot, Rúben Dias, Inácio, Nuno Mendes; João Neves, Vitinha, Bruno Fernandes; Bernardo Silva, Cristiano Ronaldo, Rafael Leão";
                        break;
                    case 24: // Egipto
                        capital = "El Cairo";
                        apariciones = "4";
                        titular = "El-Shenawy; Hany, Abdelmonem, Rabia, Hamdy; Fathi, Attia, Zizo; Mohamed Salah, Mostafa Mohamed, Marmoush";
                        break;
                    case 25: // Paraguay
                        capital = "Asunción";
                        apariciones = "9";
                        titular = "Gatito Fernández; Velázquez, Balbuena, Alderete, Alonso; Villasanti, Cubas, Diego Gómez; Miguel Almirón, Enciso, Pitta";
                        break;
                    case 26: // Escocia
                        capital = "Edimburgo";
                        apariciones = "9";
                        titular = "Gunn; Ralston, Porteous, Hendry, Tierney, Robertson; McTominay, Gilmour, McGregor; McGinn, Adams";
                        break;
                    case 27: // Haití
                        capital = "Puerto Príncipe";
                        apariciones = "2";
                        titular = "Placide; Arcus, Ade, Lambese, Experiénce; Sainte, Alceus, Louicius; Nazon, Pierrot, Duckens Nazon";
                        break;
                    case 28: // Argelia
                        capital = "Argel";
                        apariciones = "5";
                        titular = "Mandrea; Atal, Mandi, Tougai, Aït-Nouri; Bennacer, Zerrouki, Aouar; Mahrez, Bounedjah, Amoura";
                        break;
                    case 29: // México
                        capital = "Ciudad de México";
                        apariciones = "18";
                        titular = "Malagón; Jorge Sánchez, Montes, Johan Vásquez, Gallardo; Edson Álvarez, Luis Chávez, Erick Sánchez; Uriel Antuna, Santiago Giménez, Julián Quiñones";
                        break;
                    case 30: // Marruecos
                        capital = "Rabat";
                        apariciones = "7";
                        titular = "Bounou; Hakimi, Aguerd, Saïss, Mazraoui; Amrabat, Ounahi, Brahim Díaz; Ziyech, En-Nesyri, Ben Seghir";
                        break;
                    case 31: // Austria
                        capital = "Viena";
                        apariciones = "8";
                        titular = "Pentz; Posch, Danso, Wöber, Mwene; Seiwald, Laimer; Schmid, Baumgartner, Sabitzer; Arnautović";
                        break;
                    case 32: // Noruega
                        capital = "Oslo";
                        apariciones = "4";
                        titular = "Nyland; Ryerson, Ostigård, Hanche-Olsen, Wolfe; Berge, Thorsby, Ødegaard; Bobb, Haaland, Nusa";
                        break;
                    case 33: // Bosnia y Herzegovina
                        capital = "Sarajevo";
                        apariciones = "2";
                        titular = "Vasilj; Ahmedhodžić, Katić, Bičakčić, Kolašinac; Tahirović, Saric, Hajradinović; Gigović, Džeko, Demirović";
                        break;
                    case 34: // Túnez
                        capital = "Túnez";
                        apariciones = "7";
                        titular = "Ben Said; Kechrida, Meriah, Talbi, Abdi; Sassi, Skhiri, Laidouni; Rafia, Ben Romdhane, Achouri";
                        break;
                    case 35: // Croacia
                        capital = "Zagreb";
                        apariciones = "7";
                        titular = "Livaković; Stanišić, Šutalo, Gvardiol, Sosa; Modrić, Kovačić, Sučić; Kramarić, Budimir, Perišić";
                        break;
                    case 36: // Países Bajos
                        capital = "Ámsterdam";
                        apariciones = "12";
                        titular = "Verbruggen; Dumfries, De Vrij, Van Dijk, Aké; Schouten, Reijnders, Simons; Frimpong, Depay, Gakpo";
                        break;
                    case 37: // Uruguay
                        capital = "Montevideo";
                        apariciones = "15";
                        titular = "Rochet; Nández, Araújo, Giménez, Mathías Olivera; Ugarte, Valverde, Bentancur; Pellistri, Darwin Núñez, Maximiliano Araújo";
                        break;
                    case 38: // Qatar
                        capital = "Doha";
                        apariciones = "2";
                        titular = "Barsham; Pedro Miguel, Lucas Mendes, Khoukhi, Salman; Fatai, Waad, Gaber; Al-Haydos, Almoez Ali, Akram Afif";
                        break;
                    case 39: // Australia
                        capital = "Canberra";
                        apariciones = "7";
                        titular = "Ryan; Miller, Souttar, Rowles, Behich; Metcalfe, Irvine, O'Neill; Boyle, Yengi, Goodwin";
                        break;
                    case 40: // Nueva Zelanda
                        capital = "Wellington";
                        apariciones = "3";
                        titular = "Crocombe; Payne, Bindon, Pijnaker, Cacace; Bell, Stamenic, Garbett; Just, Wood, Old";
                        break;
                    case 41: // Senegal
                        capital = "Dakar";
                        apariciones = "4";
                        titular = "Édouard Mendy; Mendy, Koulibaly, Niakhaté, Jakobs; Pape Sarr, Idrissa Gueye, Lamine Camara; Ismaïla Sarr, Jackson, Sadio Mané";
                        break;
                    case 42: // Ghana
                        capital = "Acra";
                        apariciones = "5";
                        titular = "Ati-Zigi; Seidu, Djiku, Salisu, Mensah; Thomas Partey, Abdul Samed, Kudus; Ernest Nuamah, Inaki Williams, Jordan Ayew";
                        break;
                    case 43: // Panamá
                        capital = "Ciudad de Panamá";
                        apariciones = "2";
                        titular = "Mosquera; Murillo, Córdoba, Fariña, Miller, Davis; Carrasquilla, Martínez; Bárcenas, Fajardo, Rodríguez";
                        break;
                    case 44: // Irak
                        capital = "Bagdad";
                        apariciones = "2";
                        titular = "Hassan; Ali, Sulaka, Younis, Doski; Al-Ammari, Rashid, Iqbal; Jasim, Aymen Hussein, Bayesh";
                        break;
                    case 45: // Suecia
                        capital = "Estocolmo";
                        apariciones = "13";
                        titular = "Johansson; Krafth, Hien, Lindelöf, Augustinsson; Cajuste, Salétros; Kulusevski, Isak, Elanga; Gyökeres";
                        break;
                    case 46: // Curazao
                        capital = "Willemstad";
                        apariciones = "1";
                        titular = "Room; Markelo, Gaari, Martina, Floranus; Anita, Juninho Bacuna, Leah; Kuwas, Janga, Gorré";
                        break;
                    case 47: // Irán
                        capital = "Teherán";
                        apariciones = "7";
                        titular = "Beiranvand; Rezaeian, Kanaanizadegan, Khalilzadeh, Mohammadi; Ezatolahi, Ghoddos, Nourollahi; Jahanbakhsh, Taremi, Azmoun";
                        break;
                    case 48: // Uzbekistán
                        capital = "Tashkent";
                        apariciones = "1";
                        titular = "Yusupov; Alikulov, Khusanov, Eshmurodov, Nasrullaev; Shukurov, Hamrobekov; Turgunboev, Masharipov, Fayzullaev; Shomurodov";
                        break;
                    default:
                        System.out.println("Número inválido");
                        return;
                }

                // Impresión en tabla ASCII estilizada
                String nombrePais = paises[pais - 1];
                System.out.println(
                        "+-----------------------------------------------------------------------------------------------------------------------------------------------+");
                System.out.printf("| INFORMACIÓN GENERAL: %-85s |\n", nombrePais.toUpperCase());
                System.out.println(
                        "+--------------------------+--------------------------------------------------------------------------------------------------------------------+");
                System.out.printf("| Capital                  | %-87s |\n", capital);
                System.out.println(
                        "+-----------------------------------------------------------------------------------------------------------------------------------------------+");
                System.out.printf("| Apariciones Mundiales    | %-87s |\n", apariciones);
                System.out.println(
                        "+--------------------------+--------------------------------------------------------------------------------------------------------------------+");
                System.out.printf("| 11 Titular Mundial 2026  | %-87s |\n", titular);
                System.out.println(
                        "+--------------------------+--------------------------------------------------------------------------------------------------------------------+");

                break;
            case 5:

                break;

            default:
                System.out.println("Elija uno valido");
                break;
        }
        teclado.close();
    }
}
