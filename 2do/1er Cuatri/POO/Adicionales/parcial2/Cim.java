package parcial2;
import java.util.ArrayList;

public class Cim extends Escuadra{
    int indice;
    public Cim( int inidice, ArrayList<ElemDefensa> miembros) {
        super(miembros);
        this.indice = indice;
    }

    @Override
    public double getPoderMagico() {
        double max = -1;
        for (ElemDefensa miembro : this.miembros) {
            max = (miembro.getPoderMagico() > max) ? miembro.getPoderMagico() : max;
        }
        return max;
    }

    @Override
    public double getVelocidad() {
        if (this.indice <= this.miembros.size()) {
            return this.miembros.get(indice).getVelocidad();
        }
        return 0;
    }

    
}
