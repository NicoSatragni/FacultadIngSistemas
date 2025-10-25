package V2;
import V2.condiciones.Condicion;
import java.util.ArrayList;
public abstract class ElementoDefensa {
    public abstract double getEnergiaEmocional();
    public abstract double getRapidezPensamiento();
    public abstract ArrayList<String> getTalentosPsiquicos();
    public abstract ArrayList<GuardianMental> buscarGuardianes(Condicion c);
}
