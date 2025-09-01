package miRecuperatorio;
import java.util.ArrayList;

public class Tarea extends Elemento {
    private double precioHora;
    private double horasEstimadas;
    private ArrayList<String> requisitos;

    public Tarea(String nombre, double precioHora, double horasEstimadas) {
        this.nombre = nombre;
        this.precioHora = precioHora;
        this.horasEstimadas = horasEstimadas;
        this.requisitos = new ArrayList<String>();
    }

    public void addRequisito(String req){
        this.requisitos.add(req);
    }

    public double getCostoTarea() {
        return this.precioHora * this.horasEstimadas;
    }

    @Override
    public double getCostoTot() {
        return getCostoTarea();
    }

    @Override
    public double getHorasEst() {
        return this.horasEstimadas;
    }

    @Override
    public int getCantTotTareas() {
        return 1;
    }

    @Override
    public Tarea getTareaMayorCosto() {
        return this;
    }

    @Override
    public Elemento getCopia(Criterio c) {
        if(c.cumple(this)) {

            Tarea tarea = new Tarea(nombre, precioHora, horasEstimadas);
            
            for (String reqString : this.requisitos) {
                tarea.addRequisito(reqString);
            }
            return tarea;
        }
        return null;
    }

    public ArrayList<String> getRequisitos() {
        return new ArrayList<String>(this.requisitos);
    }

    public double getPrecioHora() {
        return this.precioHora;
    }

}
