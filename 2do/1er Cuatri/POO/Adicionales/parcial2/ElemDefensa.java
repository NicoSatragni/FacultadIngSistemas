package parcial2;

import java.util.ArrayList;

import parcial2.Criterios.*;

public abstract class ElemDefensa {
    public abstract ArrayList<Poni> buscarPonis(Criterio c);
    public abstract double getPoderMagico();
    public abstract double getVelocidad();
    public abstract ArrayList<String> getHabilidades(); 
}
