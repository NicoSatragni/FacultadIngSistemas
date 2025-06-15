package A2;
import java.util.ArrayList;

public class Medicamento {
    private String nombre, laboratorio;
    private int precio;
    private ArrayList<String> enfermedades;
    
    public Medicamento(String nombre, String laboratorio, int precio, ArrayList<String> enfermedades) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
        this.enfermedades = enfermedades;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public int getPrecio() {
        return precio;
    }

    public ArrayList<String> getEnfermedades() {
        return enfermedades;
    }

    
    

}