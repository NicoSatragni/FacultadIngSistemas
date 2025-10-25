

public class ArbolCapitulos{
    NodoCapitulo raiz;

    public ArbolCapitulos(){
        this.raiz = null;
    }

    public ArbolCapitulos(NodoCapitulo raiz){
        this.raiz = raiz;
    }

    public NodoCapitulo buscarCapitulo(NodoCapitulo capitulo){
        NodoCapitulo actual = this.raiz;

        return buscarCapituloRec(actual, capitulo);
    }

    private NodoCapitulo buscarCapituloRec(NodoCapitulo actual, NodoCapitulo capitulo){
        if(actual != null){
            if(actual.getCapitulo().getTitulo().compareTo(capitulo.getCapitulo().getTitulo()) == 0){
                return actual;
            } else if(actual.getCapitulo().getTitulo().compareTo(capitulo.getCapitulo().getTitulo()) < 0){
                return buscarCapituloRec(actual.getMayores(), capitulo);
            } else {
                return buscarCapituloRec(actual.getMenores(), capitulo);
            }
        }
        return actual;
    }

    public void insertarCapitulos(NodoTemporada temporada){
        while(temporada != null){
            NodoCapitulo capitulo = temporada.getPrimerCapitulo();
            while(capitulo != null){
                this.raiz = insertarCapitulo(this.raiz, capitulo);
                capitulo = capitulo.getSiguiente();
            }
            temporada = temporada.getSiguiente();
        }

    }



    private NodoCapitulo insertarCapitulo(NodoCapitulo actual, NodoCapitulo capitulo){
        if(actual == null){
            return capitulo;
        } else if(actual.getCapitulo().getTitulo().compareTo(capitulo.getCapitulo().getTitulo()) < 0){
            actual.setMayores(insertarCapitulo(actual.getMayores(), capitulo));
        } else {
            actual.setMenores(insertarCapitulo(actual.getMenores(), capitulo));
        }
        return capitulo;
    }

}