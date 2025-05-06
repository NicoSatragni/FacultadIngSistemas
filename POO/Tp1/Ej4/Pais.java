import java.util.ArrayList;
import java.util.Arrays;
public class Pais{
    private ArrayList<Provincia> provincias;
    private String nombre;
    public Pais(){
        this.nombre = "Argentina";
        this.provincias = new ArrayList<Provincia>(Arrays.asList(
            new Provincia("Buenos Aires", new Ciudad[]{
                new Ciudad("Necochea", 100000, new double[]{120.34, 103.52, 53.40}, 500.41),
                new Ciudad("Mar del Plata", 1000000, new double[]{1003.42, 1200.03, 1345.18, 5678.00}, 3800.23),
                new Ciudad("Quequen", 15000, new double[]{23.76, 34.10, 123.78}, 38000.71),
                new Ciudad("Balneario LA", 90000, new double[]{23.76, 34.10}, 3800.71)
                }
            ),
            new Provincia("Cordoba", new Ciudad[]{
                new Ciudad( "Cordoba Capital", 1000000, new double[]{ 1234.56, 456.89, 1895.98, 6754.00, 10087.23}, 12307.4),
                new Ciudad( "Mina Clavero", 300000, new double[]{ 1234.56, 456.89, 1895.98}, 8765.0),
                new Ciudad( "Rio Cuarto", 120000, new double[]{ 12.56, 456.89, 800.98, 23.00, 100.23}, 12307.4)
                }
            ),
            new Provincia("Chaco", new Ciudad[]{
                new Ciudad( "Las Palmas", 80000, new double[]{ 1234.56, 456.89}, 12307.4),
                new Ciudad( "Resistencia", 300000, new double[]{ 1234.56, 456.89, 3245.00}, 2765.0),
                new Ciudad( "Los Angeles", 120000, new double[]{ 12.56, 456.89, 800.98, 23.00, 100.23}, 12307.4)
                }
            )

        ));
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
}