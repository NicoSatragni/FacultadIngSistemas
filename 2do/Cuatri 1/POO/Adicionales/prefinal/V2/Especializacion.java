
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Especializacion extends ElemCurso {
    
    private ArrayList<ElemCurso> componenetes;


    


    public Especializacion(String nombre, ArrayList<ElemCurso> componenetes) {
        super(nombre);
        this.componenetes = componenetes;
    }

    @Override
    public double getCreditos() {
        double sum = 0;
        for (ElemCurso e : componenetes) {
            sum += e.getCreditos();
        }
        return sum;
    }

    @Override
    public double getDuracion() {
        double sum = 0;
        for (ElemCurso elemCurso : componenetes) {
            sum += elemCurso.getDuracion();
        }
        return sum;
    }

    @Override
    public ArrayList<String> getPClave() {
        Set<String> t = new LinkedHashSet<String>();

        for (ElemCurso c : componenetes) {
            t.addAll(c.getPClave());
        }
        return new ArrayList<String>(t);
    }

    @Override
    public boolean estaAprobado(Habitante h) {
        for (ElemCurso elemCurso : componenetes) {
            if(!elemCurso.estaAprobado(h))
                return false;
        }
        return true;
    }

    @Override
    public ElemCurso getTrayectoFormativo(Habitante h) {
        if(this.estaAprobado(h))
            return null;

        Especializacion rtn = new Especializacion(this.nombre, new ArrayList<ElemCurso>());
        
        for (ElemCurso elemCurso : componenetes) {
            ElemCurso t = elemCurso.getTrayectoFormativo(h);
            if(t != null)
                rtn.agregarComponentes(t);
        }
        return rtn;
    }

    
    
    
    public void setComponenetes(ArrayList<ElemCurso> componenetes) {
        this.componenetes = new ArrayList<ElemCurso>(componenetes);
    }
    
    public void agregarComponentes(ElemCurso e) {
        this.componenetes.add(e);
    }

    public ArrayList<ElemCurso> getComponenetes() {
        return new ArrayList<ElemCurso>(componenetes);
    }

    
}
