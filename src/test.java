import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

    private static void añadirTarea(List<String[]> tareas, String numeracion, String nombre, String descripcion, String estado) {
        String tarea = String.format("%s :\n %s .", nombre, descripcion);
        tareas.add(new String[]{numeracion, tarea, estado});
    }

    private static void reOrdenarDatos(List<String[]> tareas) {
        for (int i = 0; i < tareas.size() - 1; i++) {
            if (tareas.get(i)[1] == null && tareas.get(i)[2] == null) {
                tareas.set(i, tareas.get(i + 1));
                tareas.set(i + 1, new String[]{null, null, null});
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, N_Tarea = 0;
        boolean H = true;
        List<String[]> tareas = new ArrayList<>();

        while (H) {
            System.out.println("""
                --Bienvenido a tu lista de tareas:
                1. Añadir tarea
                2. Ver tareas
                3. Marcar tarea completada
                4. Eliminar tarea
                5. Salir
                """);

            System.out.print("Introducir opción: ");
            try {
                opcion = entrada.nextInt();
                entrada.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1: // Adición de tareas
                        if (N_Tarea < 7) {
                            String numeracion = " " + N_Tarea + ".";
                            System.out.print("Introduzca el nombre: ");
                            String nombre = entrada.nextLine();
                            System.out.print("Introduzca la Descripción: ");
                            String descripcion = entrada.nextLine();
                            String estado = "[Pendiente]";
                            añadirTarea(tareas, numeracion, nombre, descripcion, estado);
                            N_Tarea++;
                        } else {
                            System.out.println("Error: superas la cantidad máxima de tareas.");
                        }
                        break;

                    case 2: // Ver tareas
                        for (int i = 0; i < tareas.size(); i++) {
                            String[] tarea = tareas.get(i);
                            System.out.println(tarea[2] + tarea[0] + tarea[1] + "\n");
                        }
                        break;

                    case 3: // Marcar tarea como completada
                        System.out.print("Introduce qué tarea quieres marcar: ");
                        opcion = entrada.nextInt();
                        if (opcion < tareas.size()) {
                            tareas.get(opcion)[2] = "[Completado]";
                            System.out.println("Tarea marcada con éxito.");
                        } else {
                            System.out.println("Tarea no encontrada.");
                        }
                        break;

                    case 4: // Eliminar tarea
                        System.out.print("Introducir la tarea que quieres eliminar: ");
                        opcion = entrada.nextInt();
                        if (opcion < tareas.size()) {
                            tareas.remove(opcion);
                            reOrdenarDatos(tareas);
                            N_Tarea--;
                            System.out.println("Tarea eliminada con éxito.");
                        } else {
                            System.out.println("Tarea no encontrada.");
                        }
                        break;

                    case 5:
                        System.out.println("Saliendo del programa.");
                        H = false;
                        break;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                entrada.nextLine(); // Limpiar el buffer
            }
        }
        entrada.close();
    }
}
