import java.util.ArrayList;

public class EtapaExterna extends Etapa {
    public EtapaExterna(String nombre, String responsable) {
        super(nombre, responsable);
    }

    public EtapaExterna(String nombre, String responsable, ArrayList<ElemProyecto> subEtapas) {
        super(nombre, responsable, subEtapas);
    }


    @Override
    public ElemProyecto getCopia(Condicion c) {
        return null;
    }
}
