package ej1;
public class ListaEquipos {
    private NodoEquipo primero;

    public ListaEquipos(){
        this.primero = null;
    }

    public void ordenarLista(NodoEquipo insertar){
        if(this.primero != null){
            NodoEquipo actual = this.primero;
            if(actual.getPuntaje() > insertar.getPuntaje()){
                insertar.setSiguientePuntaje(actual);
                this.primero = insertar;
            } else{

                while (actual.getSiguientePuntaje() != null && actual.getSiguientePuntaje().getPuntaje() < insertar.getPuntaje() ){
                    actual = actual.getSiguientePuntaje();
                }
                insertar.setSiguientePuntaje(actual.getSiguientePuntaje());
                actual.setSiguientePuntaje(insertar);
            }


        } else{
            this.primero = insertar;
        }
    }

    public NodoEquipo getPrimero() {
        return primero;
    }

    public void setPrimero(NodoEquipo primero) {
        this.primero = primero;
    }


    
}
