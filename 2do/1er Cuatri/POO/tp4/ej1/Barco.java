package tp4.ej1;

public class Barco extends Elemento {
    public Barco(String nombre, int capacidad) {
        super(nombre, capacidad);
    }

    public boolean vaAntes(Elemento actual){
        return actual.getRecurso() <= this.getRecurso() ? true: false;
    }
}