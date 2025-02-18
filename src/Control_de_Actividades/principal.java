package Control_de_Actividades;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    /*
     *      Programa de control de Actividades
     * funciones:
     * Menu [Listo]
     * Añadir Actividades [Terminado] [En pruebas]
     * Ver Actividades [Terminado]
     * Eliminar actividades
     * Marcas como Completado las actividades
     */

    /* contruccion
     *  [Status] orden.Nombre de la Actividad : Descripcion
     */


    public static void Añadir_Actividad(String Nombre , String Descripcion , String Status, int Orden, ArrayList <ArrayList<String>> arreglo){
        arreglo.get(Orden).add(Status);
        arreglo.get(Orden).add(Orden+"");
        arreglo.get(Orden).add(Nombre);
        arreglo.get(Orden).add(Descripcion);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean control = true;
        int counter = 0;
        int Option=0;

        //* base de datos donde se guardaran las tareas
        //? uso un arraylist dentro de otro para simular una matriz de un array normal bruh , aprovechando la flexibilidad del arraylist

        ArrayList <ArrayList<String>> Actividades_Datos = new ArrayList<>();

        //* Inicializar filas del arreglo
        for (int x = 0; x < 3; x++) {
            Actividades_Datos.add(new ArrayList<>());
            
        }

        while (control) {
            
        System.out.println("""

                __Control de Actividades__
                

                1.Ver Actividades
                2.Añadir Actividades
                3.Marcar como completado una ACT.
                4.Eliminar Actividad
                5.Salir
                """);

//? Entrada de datos:Simple codigo para guardar la opcion elegida en una Variable

        System.out.print("Introducir Opcion:");
        Option = sc.nextInt();

//? Proceso:Switch para realizar la accion correspondiente a la opcion elegida
        

        switch (Option) {
            case 1://* Ver actividades
                String [] Datos = new String[4];

                for (int index = 0; index < counter ; index++) {
                    for (int f = 0; f < Actividades_Datos.get(index).size() ; f++) {
                        
                        Datos[f] = Actividades_Datos.get(index).get(f);
                        
                    }
                    System.out.println(""+Datos[0]+" "+Datos[1]+"."+Datos[2]+":\n"+Datos[3]+"\n");

                }

                break;
        
            case 2://* Añadir Actividad

            //* definicion de variables

                String nombre,descripcion,status;
                int orden= 0;

                //* entrada y igualacion de datos

                System.out.println("Introduzca el nombre de la tarea");
                nombre = sc.next();
                sc.nextLine();

                System.out.println("Introduzca la descripcion:");
                descripcion = sc.nextLine();

                orden = counter;

                status = "[Pendiente]";

                //* llamada a la funcion añadir_datos

                Añadir_Actividad(nombre,descripcion,status,orden,Actividades_Datos);
                counter++;
                break;

            case 3://* Eliminacion de actividad
                System.out.println("Introduzca el Numero de Actividad:");
                Option = sc.nextInt();

                Actividades_Datos.get(Option).clear();

                //* Llamar funcion para reordenar datos




                
                Option = 0;
                break;


            case 5://* Salir
                control = false;
                break;
            
            default:
                break;
        }



        }
        
    }
}
