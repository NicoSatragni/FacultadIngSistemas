

import java.util.ArrayList;

import Elementos.Enfermedad;
import Elementos.ProductoQuimico;

public class Cultivo{
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesF;

    public Cultivo(String nombre, ArrayList<Enfermedad> enfermedadesF){
        this.nombre = nombre;
        this.enfermedadesF = enfermedadesF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Enfermedad> getEnfermedadesF() {
        return enfermedadesF;
    }

    public void setEnfermedadesF(ArrayList<Enfermedad> enfermedadesF) {
        this.enfermedadesF = enfermedadesF;
    }

    public ArrayList<ProductoQuimico> productosUtiles(ArrayList<ProductoQuimico> productos){
        ArrayList<ProductoQuimico> pCompatibles = new ArrayList<>();
        for (ProductoQuimico prod : productos) {
            if (esUtil(prod)) {
                pCompatibles.add(prod);
            }
        }
        return pCompatibles;
    }

    public boolean esUtil(ProductoQuimico producto){
        if(producto.esCompatible(this.nombre)){
            for(Enfermedad enfermedad : this.enfermedadesF){
                if(producto.trataEnfermedad(enfermedad.getSintomas())){
                    return true;
                }
            }
        }
        return false;
    }

     
}