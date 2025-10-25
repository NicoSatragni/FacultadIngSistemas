package prefinal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Especializacion extends ElementoCurso{
    private ArrayList<ElementoCurso> componentes;

    public Especializacion(String nombre){
        super(nombre);
        this.componentes = new ArrayList<>();
    }
    
    @Override
    public double getDuracion() {
        double sum = 0;
        for (ElementoCurso e : componentes) {
            sum += e.getDuracion();
        }
        return sum;
    }

    public boolean aprobo(Habitante h) {
        for (ElementoCurso elementoCurso : componentes) {
            if (!elementoCurso.aprobo(h))
                return false;
        }
        return true;
    };

    @Override
    public Taller getTallerMayDuracion() {
        Taller may = null;
        for (ElementoCurso elementoCurso : componentes) {
            if (may == null || elementoCurso.getTallerMayDuracion().getDuracion() > may.getDuracion()) {
                may = elementoCurso.getTallerMayDuracion();
            }
        }
        return new Taller(may.getNombre(), may.getCalificacionMinima(), may.getCantHoras(), getPalabrasClaves(), may.getCalculador());
    }

    @Override
    public ElementoCurso getCopiaSinAprobar(Habitante h) {
        Especializacion copia = this.getInstancia();

        for (ElementoCurso elementoCurso : componentes) {
            copia.agregarComponente(elementoCurso.getCopiaSinAprobar(h));
        }
        if (copia.getComponentes().isEmpty()) return null;

        return copia;
    };

    public Especializacion getInstancia() {
        return new Especializacion(this.nombre);
    }

    public void agregarComponente(ElementoCurso e) {
        this.componentes.add(e);
    }
    public ArrayList<ElementoCurso> getComponentes() {
        return new ArrayList<>(this.componentes);
    }

    @Override
    public double getCreditos() {
        double sum = 0;
        for (ElementoCurso elementoCurso : componentes) {
            sum += elementoCurso.getCreditos();
        }
        return sum;
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
        Set<String> copia = new LinkedHashSet<>();

        for (ElementoCurso e : this.componentes) {
            copia.addAll(e.getPalabrasClaves());
        }
        return new ArrayList<>(copia);
    }

    
}
