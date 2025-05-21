package tp4.ej1;
public class CentroPuerto extends Central {
    private boolean dockLibre;
    private boolean tolvaLibre;


    public CentroPuerto(){
        super();
        this.dockLibre = true;
        this.tolvaLibre = true;
    }


    public boolean isDockLibre(){
        return dockLibre;
    }

    public boolean isTolvaLibre(){
        return tolvaLibre;
    }

    public void vaciarColas(){
        if(this.dockLibre){
            this.colaPrimaria.getElementos().remove(0);
        }
        if(this.tolvaLibre){
            this.colaSecundaria.getElementos().remove(0);
        }
    }

}