package ej5;

import ej5.criterios.CriterioBusqueda;
import java.util.ArrayList;

public class PoliticaRentabilidad {
    private ArrayList <CriterioBusqueda> criterios;

    

    public PoliticaRentabilidad() {
        this.criterios = new ArrayList<>();
    }



    public String agregarCriterio(CriterioBusqueda c){
        criterios.add(c);
        return "Criterio agregado con exito!";
    }

    public boolean esRentable(Pelicula pelicula) {
        for (CriterioBusqueda criterio : criterios) {
            if (!criterio.cumple(pelicula)) {
                return false;
            }
        }
        return true;
    }

}