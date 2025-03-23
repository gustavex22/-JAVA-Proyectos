package Ahorcado_en_Consola_juego;

import java.util.Scanner;

public class Ahorcado {
    /*
         * Simular el juego del ahorcado en java
         * Actividades:
         * Importar archivo txt como base de datos
         * Dibujar en pantalla
         * Introducir una Letra
         * Comparar las letra con las letra de las palabras
         */

        /*
         * Explicacion:
         * el codigo guardara la palabra en una variable string ,esta elejida aleatoriamente de un archivo txt
         * procedera a comparar la letra que introduzcamos con la variable
         * dibujara en consola como el ahorcado va actualizando su estado segun no acertemos en la palabra
         */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Palabra,Genero;
        int Opcion_User=0;

        //? Controla el bucle while de cada seccion del juego
        boolean Menu = true,Dibujado=true;

        //*Menu
        while (Menu) {

            System.out.println("#### Ahorcado The game#####");
            System.out.println("1. Jugar");
            System.out.println("2. Salir ");
            
            System.out.print("Introduce la Opcion:");
            Opcion_User = sc.nextInt();

            //?Opciones del menu
            switch (Opcion_User) {

                case 1:
                System.out.println("Iniciando Juego...");
                Menu = true;
                break;

                case 2:
                System.out.println("Saliendo..");
                Menu = false;
                    break;
            }

            while(Dibujado){
                int Estatus=11;
                String Ahorcado = "";

                switch (Estatus) {
                    case 0 :
                        Ahorcado = """
                                _______________
                                ||
                                ||
                                ||
                                ||
                                
                                ||
                                
                                ||
                                
                                ||
                                """;
                        break;

                    case 1:
                        Ahorcado = """
                                _______________
                                ||           |
                                ||
                                ||
                                ||
                                ||
                                
                                ||
                                
                                ||
                                """;
                        break;

                    case 2:
                    Ahorcado = """
                                _______________
                                ||           |
                                ||           |
                                ||           O
                                ||
                                ||
                                
                                ||
                                
                                ||
                                """;
                        break;
                    case 3:
                        Ahorcado = """
                                _______________
                                ||           |
                                ||           |
                                ||           O
                                ||           |
                                ||
                                
                                ||
                                
                                ||
                                """;
                        break;

                    case 4:
                        Ahorcado = """
                                _______________
                                ||           |
                                ||           |
                                ||           O
                                ||           |
                                ||          /|\\
                                ||
                                
                                ||
                                """;
                        break;

                    case 5:
                        Ahorcado = """
                                _______________
                                ||           |
                                ||           |
                                ||           O
                                ||           |
                                ||          /|\\
                                ||         / | \\
                                ||
                                
                                ||
                                """;
                        break;

                    case 6:
                        Ahorcado = """
                                _______________
                                ||           |
                                ||           |
                                ||           O
                                ||           |
                                ||          /|\\
                                ||         / | \\
                                ||          /
                                ||
                                """;
                        break;

                    case 7 :
                        Ahorcado = """
                                _______________
                                ||           |
                                ||           |
                                ||           O
                                ||           |
                                ||          /|\\
                                ||         / | \\
                                ||          / \\
                                ||
                                """;
                        break;

                    case 8:
                        Ahorcado = """
                                _______________
                                ||           |
                                ||           |
                                ||           O
                                ||           |
                                ||          /|\\
                                ||         / | \\
                                ||          / \\
                                ||         /   \\
                                """;
                        
                        break;
                
                    default:
                        break;
                }
                
                System.out.println(Ahorcado+"\n");
                Dibujado = false;


            }

            
        }
    }

}
