package juegito_en_consola;

import java.util.List;

public class Personajes {
    /* 
     * Personaje stats:
     * Nombre
     * Vida
     * Daño Maximo
     * Habilidades
     */

     //? el daño de las habilidades se calculara restando al daño maximo

    public String NombrePersonaje;
    public List<String> HabilidadesPersonaje;
    public int VidaPersonaje,DañoMax;
    
    public Personajes(String nombre){
        //* llamar una funcion para calcular los stats de acuerdo al Nombre

        //* Obtener datos de los stats
        

        this.NombrePersonaje = nombre;

        //this.VidaPersonaje =
        //this.DañoMax =
    }

    private void Calcular_stats(String nombre){
        int vida,dañomax;

        if(nombre.equals("Dragon de Fuego")){
            HabilidadesPersonaje.add("Garras");
            HabilidadesPersonaje.add("Llamas");
            HabilidadesPersonaje.add("Tormenta Infernal");
            vida = 150;
            dañomax = 50;
        }else{
            if(nombre.equals("Dragon de Hielo")){
                HabilidadesPersonaje.add("Garras");
                HabilidadesPersonaje.add("Hielo");
                HabilidadesPersonaje.add("Tormenta Glacial");
                vida = 200;
                dañomax = 50;
            }else{
                if(nombre.equals("Dragon de Aire")){
                    HabilidadesPersonaje.add("Garras");
                    HabilidadesPersonaje.add("Viento");
                    HabilidadesPersonaje.add("Tormenta");
                }
            }
        }

        



    }
}


