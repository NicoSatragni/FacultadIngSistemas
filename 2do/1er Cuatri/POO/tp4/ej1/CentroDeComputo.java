package tp4.ej1;

public class CentroDeComputo extends Central {
    //private Cola colaPrimaria;
    //private Cola colaSecundaria;

    public CentroDeComputo() {
        //this.colaPrimaria = new Cola();
        //this.colaSecundaria = new Cola();
        super();
    }

    public void agregarComputadora(Computadora computadora) {
        colaPrimaria.agregar(computadora);
    }

    public void agregarProceso(Proceso proceso) {
        colaSecundaria.agregar(proceso);
    }
    
    public void vaciarColas() {
        for(int proceso = 0; proceso < colaSecundaria.getElementos().size(); proceso++){
            for(int computadora = 0; proceso < colaPrimaria.getElementos().size(); proceso++){
                if(! ( (Computadora) colaPrimaria.getElementos().get(computadora) ).isEnUso()){
                    colaSecundaria.getElementos().remove(0);
                    ( (Computadora) colaPrimaria.getElementos().get(computadora) ).setEnUso(true) ;
                }
            }
        }
    }

}