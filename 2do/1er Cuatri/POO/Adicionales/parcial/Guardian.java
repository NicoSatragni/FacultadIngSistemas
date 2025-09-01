package parcial;
import java.util.ArrayList;
import parcial.condiciones.Condicion;
public class Guardian extends ElementoDefensa implements Comparable<Guardian> {
    protected int energia;
    protected int rapidez;
    protected ArrayList<String> talentos;

    public Guardian(String nombre, int energia, int rapidez, ArrayList<String> talentos) {
        this.nombre = nombre;
        this.energia = energia;
        this.rapidez = rapidez;
        this.talentos = new ArrayList<>(talentos);
    }

    @Override
    public double getEnergia() {
        return this.energia;
    }

    
    @Override
    public double getRapidez() {
        return this.rapidez;
    }
    
    @Override
    public ArrayList<String> getTalentos() {
        return new ArrayList<>(this.talentos);
    }

    @Override
    public ArrayList<Guardian> getElementos(Condicion c) {
        ArrayList<Guardian> aux = new ArrayList<>();
        if (c.cumple(this)) {
            aux.add(this);
        }
        return aux;
    };

    @Override
    public int compareTo(Guardian g) {
        if (this.rapidez != g.getRapidez()) {
            return Double.compare(this.rapidez, g.getRapidez());
        } else if (this.energia != g.getEnergia()) {
            return Double.compare(this.energia, g.getEnergia());
        } else {
            return Double.compare(this.getTalentos().size(), g.getTalentos().size());
        }
    }

}