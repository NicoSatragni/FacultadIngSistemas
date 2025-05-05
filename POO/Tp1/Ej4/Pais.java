import java.util.ArrayList;
public class Pais{
    private Provincia[] provincias;

    public Pais(Provincia[] provincias){
        this.provincias = provincias;
    }
    public Provincia[] getProvincias(){
        return this.provincias;
    }

    public arrayList Provincia[] getProvinciasDeficit(){
        arrayList Provincia provDeficit[];
        int actualProv = 0;
        for(Provincia prov : provincias){
            if prov.enDeficit(){
                arrayList provDeficit[actualProv] = prov;
                actualProv ++;
            }
        }
        return provDeficit;
    }

    public getProvinciasNoDeficit(){
        arrayList Provincia provDeficit[];
        int actualProv = 0;
        for(Provincia prov : provincias){
            if !prov.enDeficit(){
                arrayList provDeficit[actualProv] = prov;
                actualProv ++;
            }
        }
        return provDeficit;
    }
}