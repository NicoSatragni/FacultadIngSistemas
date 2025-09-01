package parcial2;

import java.util.ArrayList;
import java.util.List;

public class PoniEspecial extends Poni {
    private int reduccionVel;
    private int divPoder;
    private int habilidadMostrar;

    public PoniEspecial(String nombre, double poderMagico, double velocidad, List<String> habilidades, int reduccionVel, int divPoder) {
        this(nombre, poderMagico, velocidad, habilidades, reduccionVel, divPoder, 0);
    }

    public PoniEspecial(String nombre, double poderMagico, double velocidad, List<String> habilidades, int reduccionVel, int divPoder, int habilidadMostrar) {
        super(nombre, poderMagico, velocidad, habilidades);
        this.reduccionVel = reduccionVel;
        this.divPoder = (divPoder > 0) ? divPoder : 1;
        this.habilidadMostrar = habilidadMostrar;
    }

    @Override
    public double getVelocidad() {
        return super.getVelocidad() - reduccionVel;
    }

    @Override
    public double getPoderMagico() {
        return super.getPoderMagico() / divPoder;
    }

    @Override
    public ArrayList<String> getHabilidades() {
        ArrayList<String> rtn = new ArrayList<String>(); 
        if (habilidadMostrar <= this.habilidades.size()){
            rtn.add(this.habilidades.get(habilidadMostrar));
        }
        return rtn;
    }

    

    
}
