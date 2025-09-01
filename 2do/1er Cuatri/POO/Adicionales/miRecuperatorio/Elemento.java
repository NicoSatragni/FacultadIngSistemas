package miRecuperatorio;

import java.util.ArrayList;

public abstract class Elemento {
    protected String nombre;


    public abstract double getCostoTot();

    public abstract double getHorasEst();

    public abstract int getCantTotTareas();

    public abstract Tarea getTareaMayorCosto();

    public abstract ArrayList<Elemento> getCopia();

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
