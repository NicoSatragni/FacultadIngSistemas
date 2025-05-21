package tp4.ej1;
import java.util.ArrayList;



public class Cola {

    protected ArrayList<Elemento> elementos;

    //Constructor
    public Cola() {
        this.elementos = new ArrayList<>();
    }




    // Agrega computadoras o procesos a la cola 
    public String agregar(Elemento insertar){
        Elemento actual = elementos.get(0);

        for (int i = 0; i < elementos.size(); i++) {
            if (insertar.vaAntes(this.elementos.get(i))) {
                elementos.add(i, insertar);
                return "Elemento ingresado con exito!";
            }
        }
        elementos.add(insertar);
        return "Elemento ingresado con exito!";

    }

    public ArrayList<Elemento> getElementos() {
        return this.elementos;
    }

}