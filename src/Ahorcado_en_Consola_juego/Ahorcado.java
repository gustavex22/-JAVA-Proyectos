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


        private static boolean Comparacion_Letra(char Letra_user, String Palabra){
            boolean Comparacion = false;
            int Letras_Palabra = Palabra.length();

            //? Compara cada letra de la palabra elegida con la letra introducida del usuario
            for (int index = 0; index < Letras_Palabra; index++) {
                if(Letra_user == Palabra.charAt(index)){
                    Comparacion = true;
                    break;
                }
            }
            return Comparacion;
        }


        public static void main(String[] args) {
        //* Definicion variables
        Scanner sc = new Scanner(System.in);
        String Palabra="hola",Genero="",Ahorcado ="";
        char Letra_User;
        int Opcion_User=0;
        int Estatus=0;


        //? Controla el bucle while de cada seccion del juego
        boolean Menu = true,Dibujado=false;

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
                Dibujado = true;
                Menu = false;
                break;

                case 2:
                System.out.println("Saliendo..");
                Menu = false;
                    break;
            }

            while(Dibujado){
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
                
                    case 9:

                    //?Termina el juego
                        System.out.println("Has Perdido");
                        Dibujado = false;
                        break;
                }
                
                System.out.println(Ahorcado+"\n");
                System.out.println("Introduce una Letra:");
                Letra_User= sc.next().toLowerCase().charAt(0);
                boolean Estado =Comparacion_Letra(Letra_User, Palabra);

                if(Estado){
                    System.out.println("Letra Correcta");
                    Estatus--;
                }else{
                    System.out.println("Letra Incorrecta");
                    Estatus++;
                }
            }
        }
        sc.close();
    }

}
