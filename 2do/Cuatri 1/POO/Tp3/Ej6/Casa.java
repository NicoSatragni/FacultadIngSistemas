package Tp2.Ej6;
import java.util.ArrayList;

public class Casa {
    private String nombre;
    private ArrayList<String> cualidades;
    private int lugares;
    private ArrayList<Casa> casasEnemigas;


    public Casa (String nommbre, int lugares, ArrayList<String> cualidades, ArrayList<CasasEnemigas> casasEnemigas) {
        this.nombre = nommbre;
        this.cualidades = new ArrayList<String>();
        this.lugares = lugares;
        this.casasEnemigas = new ArrayList <CasasEnemigas>();
    }
}