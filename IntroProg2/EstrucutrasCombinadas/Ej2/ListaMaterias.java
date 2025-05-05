//package Ej2;
public class ListaMaterias {

    private NodoMaterias primero;

    public ListaMaterias(){
        this.primero = null;
    }

    public void insertarMateria(NodoMaterias insertar){
        NodoMaterias actual = this.primero;

        if(actual != null && (actual.getCMateria() < insertar.getCMateria())){

            while (actual.getSiguiente() != null && actual.getCMateria() <= insertar.getCMateria()) {
                actual = actual.getSiguiente();
            }

            insertar.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(insertar);


        } else {
            insertar.setSiguiente(actual);
            this.primero = insertar;
        }
    }

    public NodoMaterias getPrimero() {
        return primero;
    }

    public void setPrimero(NodoMaterias primero) {
        this.primero = primero;
    }

    
} 