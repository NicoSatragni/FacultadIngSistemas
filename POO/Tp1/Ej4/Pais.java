import java.util.ArrayList;
import java.util.Arrays;
public class Pais{
    private ArrayList<Provincia> provincias;
    private String nombre;

    public Pais(String nombre, ArrayList<Provincia> provincias){
        this.nombre = nombre;
        this.provincias = provincias;
    }
     
    

    public ArrayList<Provincia> getProvincias(){
        return this.provincias;
    }





    public ArrayList<Provincia>  getProvinciasDeficit(){
        ArrayList<Provincia> ProvsDeficit = new ArrayList<Provincia>();
        int actualProv = 0;
        for(Provincia prov : this.provincias){
            if(prov.isEnDeficit()){
                ProvsDeficit.add(prov);
            }
        }
        return ProvsDeficit;
    }

    public ArrayList<Provincia> getProvinciasNoDeficit(){
        ArrayList<Provincia> ProvsNoDeficit = new ArrayList<Provincia>();
        int actualProv = 0;
        for(Provincia prov : this.provincias){
            if (!prov.isEnDeficit()){
                ProvsNoDeficit.add(prov);
            }   
        }
        return ProvsNoDeficit;
    }

    public boolean enDeficit(){
        if(getProvinciasDeficit().size() > getProvinciasNoDeficit().size()){
            return true;
        } else{
            return false;
        }
    }

    public String imprimirDeficit(){
        if(this.enDeficit()){
            return ( "\nEl pais esta en deficit, la mayoria de sus provincias gastan mas de lo que recaudan" );
        } else{
            return( "\nEl pais NO esta en deficit, la mayoria de sus provincias recaudan mas de lo que gastan" );

        }
    }
}