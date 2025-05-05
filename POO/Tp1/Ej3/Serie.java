

public class Serie {

    private String titulo, descripcion, creador, genero;
    private ListaTemporada temporadas;

    public Serie(String titulo, String descripcion, String creador, String genero){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ListaTemporada();
    }


    public int capitulosVistosTemporada(int temporada){
        NodoTemporada tempActual = this.temporadas.getPrimerTemporada();

        while (tempActual.getTemporadaNum() != temporada) {
            tempActual = tempActual.getSiguiente();
        }
        
        NodoCapitulo capActual = tempActual.getPrimerCapitulo();
        
        return sumaCapsVistos(capActual);
    }

    public int capitulosVistosSerie(){
        int capsVistos = 0;
        NodoTemporada tempActual = this.temporadas.getPrimerTemporada();
  
        while(tempActual != null){
            capsVistos += capitulosVistosTemporada(tempActual.getTemporadaNum());
            tempActual = tempActual.getSiguiente();
        }
        return capsVistos;
    }

    private int sumaCapsVistos(NodoCapitulo capActual){
        //Capitulo capActual = capituloActual.getCapitulo();
        int capsVistos = 0;

        while (capActual != null) {
            
            if (capActual.getCapitulo().isFlag()) {
                capsVistos ++;
            }
            capActual = capActual.getSiguiente();
        }
        return capsVistos;
    }

    public boolean isVista(){
        NodoTemporada tempActual = temporadas.getPrimerTemporada();
        while (tempActual != null){
            if (!isTempVista(tempActual)){
                return false;
            }
            tempActual = tempActual.getSiguiente();
        }
        return true;
    }
    

    public boolean isTempVista(NodoTemporada actual){
        NodoCapitulo capActual = actual.getPrimerCapitulo();
        boolean tempVista = true;
        while (capActual != null) {
            if (!capActual.getCapitulo().isFlag()){
                return false;
            }
            capActual = capActual.getSiguiente();
        }
        return true;
    }

    public float promedioCalificacionesTemporada(int temporada){
        NodoTemporada tempActual = this.temporadas.getPrimerTemporada();

        while (tempActual.getTemporadaNum() != temporada) {
            tempActual = tempActual.getSiguiente();
        }

        NodoCapitulo capActual = tempActual.getPrimerCapitulo();

        float suma = 0, cont = 0;
        while (capActual != null) {
            if (capActual.getCapitulo().getCalificacion() > 0){
                suma += capActual.getCapitulo().getCalificacion();
                cont ++;
            }
            capActual = capActual.getSiguiente();
        }
        return (cont > 0 ? (suma / cont) : 0);
    }

    public float promedioCalificacionesSerie(){
        float promedio = 0;
        int cantDeCaps = 0;
        NodoTemporada tempActual = this.temporadas.getPrimerTemporada();

        while (tempActual != null) {
            NodoCapitulo capActual = tempActual.getPrimerCapitulo();
            while( capActual != null){
                if(capActual.getCapitulo().getCalificacion() > 0){
                    promedio += capActual.getCapitulo().getCalificacion();
                    cantDeCaps ++;
                }
                capActual = capActual.getSiguiente();
            }
            tempActual = tempActual.getSiguiente();
        }
        return promedio > 0 ? (promedio / cantDeCaps) : 0;
    }

    public Capitulo getCaptitulo(int temporada, String capitulo){
        
        NodoTemporada tempActual = this.temporadas.getPrimerTemporada();
        
        while (tempActual.getTemporadaNum() != temporada) {
            tempActual = tempActual.getSiguiente();
        }

        NodoCapitulo capActual = tempActual.getPrimerCapitulo();

        while (capActual.getCapitulo().getTitulo().compareTo(capitulo) != 0){
            capActual = capActual.getSiguiente();
        }

        return capActual.getCapitulo();
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getCreador() {
        return creador;
    }


    public void setCreador(String creador) {
        this.creador = creador;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public ListaTemporada getTemporadas() {
        return temporadas;
    }


    public void setTemporadas(ListaTemporada temporadas) {
        this.temporadas = temporadas;
    }





}