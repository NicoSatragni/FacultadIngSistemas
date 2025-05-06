import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Provincia{
    private Ciudad[] ciudades;
    private boolean enDeficit;
    private String nombre;

    public Provincia (String nombre,  Ciudad[] ciudades){
        this.ciudades = ciudades;
        this.nombre = nombre;
        this.enDeficit = isEnDeficit(); 
    }




    public ArrayList<Ciudad> enDeficit(){
        //float noDeficit = 0;
        ArrayList<Ciudad> ciuadesDeficit = new ArrayList<Ciudad>();
        for (Ciudad ciudad : this.ciudades) {
            if (ciudad.getHabitantes() > 99999){
                if ((ciudad.getRecaudado() - ciudad.getGastos()) < 0){
                    ciuadesDeficit.add(ciudad);
                }
            }
        }

        return ciuadesDeficit;
    }

    public Ciudad[] getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudad[] ciudades) {
        this.ciudades = ciudades;
    }

    public boolean isEnDeficit() {
        return enDeficit().size() > this.ciudades.length;
    }

    public void setEnDeficit(boolean enDeficit) {
        this.enDeficit = enDeficit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    
}