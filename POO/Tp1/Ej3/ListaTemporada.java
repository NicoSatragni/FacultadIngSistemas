

public class ListaTemporada {

    private NodoTemporada primerTemporada;
    private NodoTemporada ultimaTemporada;

    public ListaTemporada(){
        this.primerTemporada = null;
        this.ultimaTemporada = null;
    }

    public void agregarCapitulo(int numTemporada, Capitulo capitulo){
        NodoTemporada actual = this.primerTemporada;
        NodoCapitulo nuevoCapitulo = new NodoCapitulo(capitulo);
        
        while(actual != null && actual.getTemporadaNum() != numTemporada){
            actual = actual.getSiguiente();
        }

        if(actual != null){
            if(actual.getPrimerCapitulo() == null){
                actual.setPrimerCapitulo(nuevoCapitulo); 
            } else{
                NodoCapitulo capActual = actual.getPrimerCapitulo();
                while (capActual.getSiguiente() != null) {
                    capActual = capActual.getSiguiente();
                }
                capActual.setSiguiente(nuevoCapitulo);
                nuevoCapitulo.setAnterior(capActual);
            }
        }
    }

    public void agregarTemporada(int temporadaNum, Capitulo capitulo){

        NodoTemporada nuevoNodo = new NodoTemporada(temporadaNum);
        nuevoNodo.setPrimerCapitulo(new NodoCapitulo(capitulo));
        NodoTemporada actual = this.primerTemporada;
        

        if(this.primerTemporada == null){
            this.primerTemporada = nuevoNodo;
            this.ultimaTemporada = nuevoNodo;            
        }
        else if(nuevoNodo.getTemporadaNum() > this.ultimaTemporada.getTemporadaNum()){
            ultimaTemporada.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(this.ultimaTemporada);
            ultimaTemporada = nuevoNodo;

        }
        else if(nuevoNodo.getTemporadaNum() < this.primerTemporada.getTemporadaNum()){
            nuevoNodo.setSiguiente(actual);
            actual.setAnterior(nuevoNodo);
            this.primerTemporada.setSiguiente(nuevoNodo);
        } else{

            while(nuevoNodo.getTemporadaNum() > actual.getTemporadaNum()){
                actual = actual.getSiguiente();
            }

            nuevoNodo.setSiguiente(actual);
            nuevoNodo.setAnterior(actual.getAnterior());
            actual.setAnterior(nuevoNodo);
        }
    }

    public NodoTemporada getPrimerTemporada() {
        return primerTemporada;
    }

    public void setPrimerTemporada(NodoTemporada primerTemporada) {
        this.primerTemporada = primerTemporada;
    }

    public NodoTemporada getUltimaTemporada() {
        return ultimaTemporada;
    }

    public void setUltimaTemporada(NodoTemporada ultimaTemporada) {
        this.ultimaTemporada = ultimaTemporada;
    }

    // public ListaTemporada getTemporadas() {
    //     return this.temporadas;
    // }
    
}
