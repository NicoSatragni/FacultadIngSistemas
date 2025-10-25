import java.util.ArrayList;

public class TallerOpt extends Taller {
    private int div;


    

    public TallerOpt(String nombre, double calificacionMin, double duracion, ArrayList<String> pClave, Calculator c,
            int div) {
        super(nombre, calificacionMin, duracion, pClave, c);
        this.div = div;
    }




    @Override
    public double getCreditos() {
        return super.getCreditos() / div;
    }
}
s