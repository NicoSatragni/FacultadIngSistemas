import java.util.ArrayList;
public class Pais{
    private ArrayList<Provincia> provincias;
    private String nombre;
    public Pais(){
        this.nombre = "Argentina";
        this.provincias = new ArrayList<Provincia>(Arrays.asList(
            new Provincia("Buenos Aires", new Ciudad[]{
                new Ciudad("Necochea", 100000, new float[]{120.3, 103.5 53.4}, 500),
                new Ciudad("Mar del Plata", 1000000, new float[]{1003.45, 1200.0, 1345.89, 5678}, 3800),
                new Ciudad("Quequen", 15000, new float[]{23.76, 34.0, 123.78}, 3800);
            }),
            new Provincia("Cordoba", new Ciudad[]{
                new Ciudad( "Cordoba Capital", 1000000, new float[]{ 1234.56, 456.89, 1895.98, 6754.00, 10087.23}, 12307.45),
                new Ciudad( "Mina Clavero", 300000, new float[]{ 1234.56, 456.89, 1895.98}, 8765),
                new Ciudad( "Rio Cuarto", 120000, new float[]{ 12.56, 456.89, 800.98, 23.00, 100.23}, 12307.45)
            })

        ));
    }
     
    }

    public Provincia[] getProvincias(){
        return this.provincias;
    }





    public ArrayList<Provincia>  getProvinciasDeficit(){
        ArrayList<Provincia> ProvsDeficit = new ArrayList<Provincia>();
        int actualProv = 0;
        for(Provincia prov : provincias){
            if prov.enDeficit(){
                provsDeficit.add(prov);
            }
        }
        return provsDeficit;
    }

    public getProvinciasNoDeficit(){
        ArrayList<Provincia> ProvsNoDeficit = new ArrayList<Provincia>();
        int actualProv = 0;
        for(Provincia prov : provincias){
            if !prov.enDeficit(){
                provsNoDeficit.add(prov);
            }   
        }
        return provsNoDeficit;
    }
}