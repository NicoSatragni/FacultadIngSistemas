public class NodoMaterias {
    private int cMateria;
    private double nFinales;
    private NodoMaterias siguiente;

    public NodoMaterias(int cMateria, double nFinales){
        this.cMateria = cMateria;
        this.nFinales = nFinales;
        this.siguiente = null;
    }

    public int getCMateria() {
        return cMateria;
    }

    public void setCMateria(int cMateria) {
        this.cMateria = cMateria;
    }

    public double getNFinales() {
        return nFinales;
    }

    public void setNFinales(double nFinales) {
        this.nFinales = nFinales;
    }

    public NodoMaterias getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMaterias siguiente) {
        this.siguiente = siguiente;
    }

    

}
