import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FlagStandardAporte {
    public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    

/*                                                                                                                                                                                                                                                                                                                 
▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ 
████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████                                                   
*/ 
/*
___  ___      _        _       _____              __ _       
|  \/  |     | |      (_)     /  __ \            / _(_)      
| .  . | __ _| |_ _ __ _ ____ | /  \/ ___  _ __ | |_ _  __ _ 
| |\/| |/ _` | __| '__| |_  / | |    / _ \| '_ \|  _| |/ _` |
| |  | | (_| | |_| |  | |/ /  | \__/\ (_) | | | | | | | (_| |
\_|  |_/\__,_|\__|_|  |_/___|  \____/\___/|_| |_|_| |_|\__, |
                                                        __/ |
                                                       |___/ 

Configuramos la matriz para que tome datos del archivo csv basándonos en el repositorio
de Xaca
*/


char[][] matriz = new char[480][15];

BufferedReader archivo = new BufferedReader(
    new FileReader("recursos/Flags.csv")
);

String linea;
int fila = 0;

while ((linea = archivo.readLine()) != null && fila < matriz.length) {

    String[] columnas = linea.split(";");

    for (int columna = 0; columna < columnas.length; columna++) {
        matriz[fila][columna] = columnas[columna].charAt(0);
    }

    fila++; //Lo que se logra con esto es que la matriz que estaba vacía, quede llena justo con los datos del CSV
}

/*                                                                                                                                                                                                                                                                                                                 
▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ 
████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████                                                   
*/
/*
    ____            _             _       _                                          
  / ___|___  _ __ | |_ _ __ ___ | |   __| | ___    ___ _ __ _ __ ___  _ __ ___  ___ 
 | |   / _ \| '_ \| __| '__/ _ \| |  / _` |/ _ \  / _ \ '__| '__/ _ \| '__/ _ \/ __|
 | |__| (_) | | | | |_| | | (_) | | | (_| |  __/ |  __/ |  | | | (_) | | |  __/\__ \
  \____\___/|_| |_|\__|_|  \___/|_|  \__,_|\___|  \___|_|  |_|  \___/|_|  \___||___/

  Solo opera con la varible flag, le "permite el paso" si está entre 1 y 48, si es decimal,
  negativo, un texto o no está dentro del rango, el programa vuelve a pedir
  el número de bandera hasta que sea válido.
                                                                                
*/
int flag = 0;

do{
        try{
            while (flag <= 0 || flag > 48) {
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
                System.out.println("+------+---------------------------+");
                System.out.println("| Case | País                      |");
                System.out.println("+------+---------------------------+");

                for (int i = 0; i < paises.length; i++) {
                    System.out.println("| " + (i + 1) + "\t| " + paises[i]);
                }

                System.out.println("+------+---------------------------+");
                System.out.print("Ingresa un número de bandera (1-48): ");
                
                flag = sc.nextInt();

                if(flag <= 0 || flag > 48){
                    System.out.println("--------------------------------"); 
                    System.out.println("Inválido");
                    System.out.println("El número de bandera debe estar entre 1 y 48");
                    System.out.println("--------------------------------");  
                }
            }
        }
        
        catch (Exception e) {
            System.out.println("--------------------------------");  
            System.out.println("Inválido");
            System.out.println("--------------------------------");  
            sc.nextLine(); // Limpio
            flag = 0;
        }

}
while(flag <= 0 || flag > 48); 

/*                                                                                                                                                                                                                                                                                                                 
▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ 
████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████                                                   
*/
/*
 _____          _ _       _      ______                 _                    
/  ___|        (_) |     | |     | ___ \               | |                   
\ `--.__      ___| |_ ___| |__   | |_/ / __ _ _ __   __| | ___ _ __ __ _ ___ 
 `--. \ \ /\ / / | __/ __| '_ \  | ___ \/ _` | '_ \ / _` |/ _ \ '__/ _` / __|
/\__/ /\ V  V /| | || (__| | | | | |_/ / (_| | | | | (_| |  __/ | | (_| \__ \
\____/  \_/\_/ |_|\__\___|_| |_| \____/ \__,_|_| |_|\__,_|\___|_|  \__,_|___/
                                                                                                   
*/


switch (flag) {
    case 1:

    System.out.println("--------------------------------");  

    for (fila = (381)-1; fila < 390; fila++) {

        for (int columna = 0; columna < matriz[fila].length; columna++) {

            if(matriz[fila][columna]=='1'){
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='2'){
		 			System.out.print(ConsoleColors.ORANGE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='3'){
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='4'){
		 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='5'){
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='6'){
		 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='7'){
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='8'){
		 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='9'){
		 			System.out.print(ConsoleColors.BROWN_BACKGROUND+"   ");
		 		}
            System.out.print(ConsoleColors.RESET);
        }

    System.out.println();
    }
    break;
    case 2:
        System.out.println("Bandera 2");
        break;
    // HACER UN CASE PARA CADA PAIS

    case 15:

        System.out.println("--------------------------------");  

    for (fila = (131)-1; fila < 140; fila++) {

        for (int columna = 0; columna < matriz[fila].length; columna++) {

            if(matriz[fila][columna]=='1'){
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='2'){
		 			System.out.print(ConsoleColors.ORANGE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='3'){
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='4'){
		 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='5'){
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='6'){
		 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='7'){
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='8'){
		 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='9'){
		 			System.out.print(ConsoleColors.BROWN_BACKGROUND+"   ");
		 		}
            System.out.print(ConsoleColors.RESET);
        }
           
    System.out.println();
    }
    break;

    case 16:

        System.out.println("--------------------------------");  

    for (fila = (161)-1; fila < 170; fila++) {

        for (int columna = 0; columna < matriz[fila].length; columna++) {

            if(matriz[fila][columna]=='1'){
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='2'){
		 			System.out.print(ConsoleColors.ORANGE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='3'){
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='4'){
		 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='5'){
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='6'){
		 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='7'){
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='8'){
		 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='9'){
		 			System.out.print(ConsoleColors.BROWN_BACKGROUND+"   ");
		 		}
            System.out.print(ConsoleColors.RESET);
        }
           
    System.out.println();
    }
    break;

    case 17:

        System.out.println("--------------------------------");  

    for (fila = (191)-1; fila < 200; fila++) {

        for (int columna = 0; columna < matriz[fila].length; columna++) {

            if(matriz[fila][columna]=='1'){
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='2'){
		 			System.out.print(ConsoleColors.ORANGE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='3'){
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='4'){
		 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='5'){
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='6'){
		 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='7'){
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='8'){
		 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='9'){
		 			System.out.print(ConsoleColors.BROWN_BACKGROUND+"   ");
		 		}
            System.out.print(ConsoleColors.RESET);
        }
           
    System.out.println();
    }
    break;

    case 18:

        System.out.println("--------------------------------");  

    for (fila = (141)-1; fila < 150; fila++) {

        for (int columna = 0; columna < matriz[fila].length; columna++) {

            if(matriz[fila][columna]=='1'){
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='2'){
		 			System.out.print(ConsoleColors.ORANGE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='3'){
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='4'){
		 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='5'){
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='6'){
		 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='7'){
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='8'){
		 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='9'){
		 			System.out.print(ConsoleColors.BROWN_BACKGROUND+"   ");
		 		}
            System.out.print(ConsoleColors.RESET);
        }
           
    System.out.println();
    }
    break;

    case 19:

        System.out.println("--------------------------------");  

    for (fila = (181)-1; fila < 190; fila++) {

        for (int columna = 0; columna < matriz[fila].length; columna++) {

            if(matriz[fila][columna]=='1'){
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='2'){
		 			System.out.print(ConsoleColors.ORANGE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='3'){
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='4'){
		 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='5'){
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='6'){
		 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='7'){
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='8'){
		 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='9'){
		 			System.out.print(ConsoleColors.BROWN_BACKGROUND+"   ");
		 		}
            System.out.print(ConsoleColors.RESET);
        }
           
    System.out.println();
    }
    break;

    case 20:

        System.out.println("--------------------------------");  

    for (fila = (171)-1; fila < 180; fila++) {

        for (int columna = 0; columna < matriz[fila].length; columna++) {

            if(matriz[fila][columna]=='1'){
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='2'){
		 			System.out.print(ConsoleColors.ORANGE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='3'){
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='4'){
		 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='5'){
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='6'){
		 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='7'){
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='8'){
		 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='9'){
		 			System.out.print(ConsoleColors.BROWN_BACKGROUND+"   ");
		 		}
            System.out.print(ConsoleColors.RESET);
        }
           
    System.out.println();
    }
    break;

    case 21:

        System.out.println("--------------------------------");  

    for (fila = (151)-1; fila < 160; fila++) {

        for (int columna = 0; columna < matriz[fila].length; columna++) {

            if(matriz[fila][columna]=='1'){
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='2'){
		 			System.out.print(ConsoleColors.ORANGE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='3'){
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='4'){
		 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='5'){
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='6'){
		 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='7'){
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='8'){
		 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='9'){
		 			System.out.print(ConsoleColors.BROWN_BACKGROUND+"   ");
		 		}
            System.out.print(ConsoleColors.RESET);
        }
           
    System.out.println();
    }
    break;

    }

sc.close();
archivo.close();
}
}
