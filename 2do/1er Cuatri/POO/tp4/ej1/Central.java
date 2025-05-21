package tp4.ej1;

public abstract class Central {
    Cola colaPrimaria;
    Cola colaSecundaria;

    public Central(){
        this.colaPrimaria = new Cola();
        this.colaSecundaria = new Cola();
    }

    public abstract void vaciarColas();


}