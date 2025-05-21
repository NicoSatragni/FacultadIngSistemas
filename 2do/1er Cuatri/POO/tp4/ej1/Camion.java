package tp4.ej1;

public class Camion extends Elemento{
    private int capacidad;
    private String nombre;
    public Camion(String nombre, int fecha){
        super(nombre, fecha);
    }


    public boolean vaAntes(Elemento actual){
        return actual.getRecurso() <= this.getRecurso() ? true: false;
    }


    
}