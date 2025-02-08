package Control_de_Actividades;

import java.util.Scanner;

public class principal {
    /*
     * Programa de control de Actividades
     * funciones:
     * Menu [Listo]
     * Añadir Actividades
     * Ver Actividades
     * Eliminar actividades
     * Marcas como Completado las actividades
     */

    /* contruccion
     *  [Status] Nombre de la Actividad : Descripcion
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Option=0;


        System.out.println("""

                __Control de Actividades__

                1.Ver Actividades
                2.Añadir Actividades
                3.Marcar como completado una ACT.
                4.Eliminar Actividad
                """);

//? Entrada de datos:Simple codigo para guardar la opcion elegida en una Variable

        System.out.print("Introducir Opcion:");
        Option = sc.nextInt();
    }
}
