package parcial;
import java.util.ArrayList;
import java.util.Collections;

public class OfReclutamiento {
    private ArrayList<Guardian> guardianes;


    public OfReclutamiento(ArrayList<Guardian> guardianes) {
        this.guardianes = guardianes;
    }

    public void agregarGuardian(Guardian g) {
        this.guardianes.add(g);
        Collections.sort(this.guardianes);
    }

}
