public class NodoTemporada {

    private NodoTemporada anterior;
    private NodoTemporada siguiente;

    private int temporadaNum;
    private NodoCapitulo primerCapitulo;

    public NodoTemporada(int temporadaNum) {
        this.temporadaNum = temporadaNum;
        this.anterior = null;
        this.siguiente = null;
        this.primerCapitulo = null;
    }

    public NodoTemporada getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoTemporada anterior) {
        this.anterior = anterior;
    }

    public NodoTemporada getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTemporada siguiente) {
        this.siguiente = siguiente;
    }

    public int getTemporadaNum() {
        return temporadaNum;
    }

    public void setTemporadaNum(int temporadaNum) {
        this.temporadaNum = temporadaNum;
    }

    public NodoCapitulo getPrimerCapitulo() {
        return primerCapitulo;
    }

    public void setPrimerCapitulo(NodoCapitulo primerCapitulo) {
        this.primerCapitulo = primerCapitulo;
    }


    
}