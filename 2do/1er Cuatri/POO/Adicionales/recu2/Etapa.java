
import java.util.ArrayList;
public class Etapa extends ElemProyecto {
    protected String responsable;
    protected ArrayList<ElemProyecto> subEtapas;

    

    public Etapa(String nombre, String responsable) {
        this(nombre, responsable, new ArrayList<>());
    }

    public Etapa(String responsable, String nombre, ArrayList<ElemProyecto> subEtapas) {
        super(nombre);
        this.responsable = responsable;
        this.subEtapas = subEtapas;
    }

    public void agregarElemento(ElemProyecto e) {
        this.subEtapas.add(e);
    }


    public ArrayList<ElemProyecto> getSubEtapas() {
        return new ArrayList<>(this.subEtapas);
    }

    @Override
    public ElemProyecto getCopia(Condicion c) {
        Etapa copia = new Etapa(this.nombre, this.responsable);

        for (ElemProyecto elemento : this.subEtapas) {
            ElemProyecto tmp = elemento.getCopia(c);
            if (tmp != null) copia.agregarElemento(tmp);
        }
        return (copia.getSubEtapas().isEmpty()) ? null : copia;
    }

    @Override
    public double getCosto() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getDuracion() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Tarea getTareaMayCosto() {
        // TODO Auto-generated method stub
        return null;
    }
    
    
    
}
