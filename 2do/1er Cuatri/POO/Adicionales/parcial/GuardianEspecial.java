package parcial;

import java.util.ArrayList;
public class GuardianEspecial extends Guardian {

    private int unidades;
    private int div;
    private int indice;

    public GuardianEspecial() {
        super(null, 0, 0, null);
    }
    public GuardianEspecial(String nombre, int energia, int rapidez, ArrayList<String> talentos, int unidades, int div, int indice) {
        super(nombre, energia, rapidez, new ArrayList<>(talentos));
        this.unidades = unidades;
        this.div = div;
        this.indice = indice;
    }
 

    @Override
    public double getRapidez() {
        return this.rapidez - this.unidades;
    }

    @Override
    public double getEnergia() {
        if (div > 0) {
            return this.energia / div;
        } else {
            return this.energia;
        }
    }
    
    @Override
    public ArrayList<String> getTalentos() {
        ArrayList<String> aux = new ArrayList<>();
        ArrayList<String> habilidades = super.getTalentos();
        if (indice >= 0 && indice < habilidades.size()) {
            aux.add(habilidades.get(indice));
        }
        return aux;
    }

}
