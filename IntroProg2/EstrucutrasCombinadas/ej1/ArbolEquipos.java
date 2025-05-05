package ej1;


public class ArbolEquipos {
    private NodoEquipo raiz;
    private ListaEquipos lista;

    public ArbolEquipos(){
        this.raiz = null;
        this.lista = new ListaEquipos();
    }

    public String insertarEquipo(NodoEquipo equipo){
        NodoEquipo rta = insertarEquipoRec(this.raiz, equipo);
        if(rta == null){
            return "Ya existe el equipo!";
        }
        else{
            this.raiz = rta;
            //rta.setSiguientePuntaje(null);
            lista.ordenarLista(equipo);
            return "Equipo ingresado con exito!";
        }
    }

    public NodoEquipo insertarEquipoRec(NodoEquipo actual, NodoEquipo equipo){
        if (actual == null){
            return equipo;
        } 
        else if(actual.getNombre().compareTo(equipo.getNombre()) < 0){
            actual.setMayores(insertarEquipoRec(actual.getMayores(), equipo));
        } 
        else if(actual.getNombre().compareTo(equipo.getNombre()) == 0){
            return null;
        }
        else{
            actual.setMenores(insertarEquipoRec(actual.getMenores(), equipo));
        }
        return actual;
    }

    public void imprimirInOrder(){
        NodoEquipo actual = this.raiz;
        imprimirInOrderRec(actual);
    }
    
    public void imprimirInOrderRec(NodoEquipo actual){
        if(actual != null){
            imprimirInOrderRec(actual.getMenores());
            System.out.println("Equipo: " + actual.getNombre() + " Puntaje: " + actual.getPuntaje());
            imprimirInOrderRec(actual.getMayores());
        }
    }

    public void imprimirLista(){
        NodoEquipo actual = this.lista.getPrimero();

        while (actual != null) {
            System.out.println(actual.getNombre() + " P: " + actual.getPuntaje());
            //System.out.println("ACAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA " + actual.getSiguientePuntaje().getNombre());
            actual = actual.getSiguientePuntaje();
        }
    }
}