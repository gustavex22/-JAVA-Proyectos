package Control_de_Actividades;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    /*
     *      Programa de control de Actividades
     * funciones:
     * ----------------
     * Menu [Listo]
     * Añadir Actividades [Terminado]
     * Ver Actividades [Terminado]
     * Eliminar actividades [Completado]
     * Marcas como Completado las actividades [ Completado]
     * ----------------
     */

    /* contruccion
     *  [Status] orden.Nombre de la Actividad : Descripcion
     */


    public static void Añadir_Actividad(String Nombre , String Descripcion , String Status, int Orden, ArrayList <ArrayList<String>> arreglo){
        arreglo.get(Orden).add(Status);
        arreglo.get(Orden).add(String.valueOf(Orden));
        arreglo.get(Orden).add(Nombre);
        arreglo.get(Orden).add(Descripcion);
    }


    public static void Reordenar_Datos(ArrayList <ArrayList<String>> arreglo, int index){
        //?Reordena los datos hacia arriba ,empezando desde la Fila eliminada
        for (int i = index; i < arreglo.size()-1; i++) {
            arreglo.set(i,arreglo.get(i+1));
        }
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
        for (int x = 0; x < 4; x++) {
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
                //*? arreglo para separar lso datos
                String [] Datos = new String[4];

                //?bulce para imprimir los datos
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

            case 3: //* Marcar como completado
                System.out.print("Que actividad desea Marcar?:");
                Option = sc.nextInt();

                Actividades_Datos.get(Option).set(0,"[Completado]");
                Option= 0;
                break;

            case 4://* Eliminacion de actividad

                System.out.println("Introduzca el Numero de Actividad:");
                Option = sc.nextInt();

                //* Elimina la fila seleccionada
                Actividades_Datos.get(Option).clear();

                //* Llamar funcion para reordenar datos
                    Reordenar_Datos(Actividades_Datos,Option);
                
                Option = 0;
                counter--;
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
