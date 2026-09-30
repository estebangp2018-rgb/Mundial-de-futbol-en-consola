import java.util.Scanner;

public class tablaPosiciones {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

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

        String[] columnas = {"PJ", "PG", "PE", "PP", "GF", "GC", "DG", "TA", "TR", "Pts"};
        
        // Matriz de posiciones
        int[][] tabla = new int[48][10];

        // Variables de paginación
        int equiposPorPagina = 10;
        int pagina = 0;
        int totalPaginas = (int) Math.ceil(equipos.length / (double) equiposPorPagina);
        
        int opcion = 0; // Inicializada en 0 por seguridad

        // Ciclo principal del menú
        do {
            try {
                System.out.println("\n--- TABLA DE POSICIONES MUNDIAL 2026 ---");
                System.out.println("Página " + (pagina + 1) + " de " + totalPaginas + "\n");

                // Imprimir encabezado
                System.out.printf("%-25s", "SELECCION");
                for (String col : columnas) {
                    System.out.printf("%5s", col);
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
                System.out.print("\n1. Página siguiente\n2. Página anterior\n3. Editar equipo\n4. Salir\nElige una opción: ");
                
                // LEEMOS COMO TEXTO Y CONVERTIMOS A NÚMERO (Evita el bug del Scanner)
                opcion = Integer.parseInt(teclado.nextLine());

                switch (opcion) {
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
                        int fila = inicio + equipoSeleccionado - 1;

                        if (fila >= inicio && fila < fin) {
                            System.out.println("\nEditando: " + equipos[fila]);
                            for (int j = 0; j < 10; j++) {
                                System.out.println((j + 1) + ". " + columnas[j] + " = " + tabla[fila][j]);
                            }

                            System.out.print("\n¿Qué columna deseas editar? (1-10): ");
                            int columna = Integer.parseInt(teclado.nextLine()) - 1;

                            if (columna >= 0 && columna < 10) {
                                System.out.print("Ingresa el nuevo valor para " + columnas[columna] + ": ");
                                tabla[fila][columna] = Integer.parseInt(teclado.nextLine());
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
                System.out.println("\n-> ¡ERROR! Ingresaste una letra o un valor inválido. Vuelve a intentar usando solo números.");
                // Opcion se queda igual, así que el bucle simplemente se repite y vuelve a mostrar el menú.
            }
            
        } while (opcion != 4);

        teclado.close();
    }
}