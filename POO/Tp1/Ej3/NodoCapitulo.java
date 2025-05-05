public class NodoCapitulo{
    private NodoCapitulo siguiente, anterior, mayores, menores;
    private Capitulo capitulo;
    
    public NodoCapitulo(Capitulo capitulo){
        this.capitulo = capitulo;
        this.siguiente = null;
        this.anterior = null;
        this.mayores = null;
        this.menores = null;
    }

    public NodoCapitulo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCapitulo siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCapitulo getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCapitulo anterior) {
        this.anterior = anterior;
    }

    public Capitulo getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(Capitulo capitulo) {
        this.capitulo = capitulo;
    }

    public NodoCapitulo getMayores() {
        return mayores;
    }

    public void setMayores(NodoCapitulo mayores) {
        this.mayores = mayores;
    }

    public NodoCapitulo getMenores() {
        return menores;
    }

    public void setMenores(NodoCapitulo menores) {
        this.menores = menores;
    }


    
}