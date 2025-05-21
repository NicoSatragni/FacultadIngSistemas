package tp4.ej1;


public class Proceso extends Elemento {
    private int reqMem;

    public Proceso(String nombre, int recurso) {
        super(nombre, recurso);
    }

    public int getRequisito() {
        return reqMem;
    }

    public boolean vaAntes(Elemento actual){
        return actual.getRecurso() <= this.getRecurso() ? true: false;
    }

    
}