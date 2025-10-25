
import java.util.ArrayList;

public class Coleccion extends ElementoMuseo {

    final static double TOPE_EXTRA = 0.75;
    protected ArrayList<ElementoMuseo> articulos;
    protected double valorExtra;

    

    public Coleccion(String nombre, double valorExtra) {
        super(nombre);
        this.valorExtra = valorExtra;
        this.articulos = new ArrayList<ElementoMuseo>();
    }

    public Coleccion(String nombre, double valorExtra, ArrayList<ElementoMuseo> articulos) {
        super(nombre);
        this.valorExtra = valorExtra;
        this.articulos = new ArrayList<ElementoMuseo>(articulos);
    }

    @Override
    public int getCantidadArt() {
        return this.articulos.size();
    }

    @Override
    public ElementoMuseo getCopia(Criterio c) {
        Coleccion copia = new Coleccion(this.nombre, this.valorExtra);
        
        for (ElementoMuseo elementoMuseo : articulos) {
            ElementoMuseo temp = elementoMuseo.getCopia(c);
            if(temp != null)
                copia.agregarElemento(temp);
        }
        return copia.getElementos().isEmpty() ? null : copia;
    }

    @Override
    public Articulo getArtMayorPrecio() {
        Articulo max = null;
        for (ElementoMuseo elementoMuseo : articulos) {
            Articulo temp = elementoMuseo.getArtMayorPrecio();
            if(max == null || (temp != null && temp.getPrecio() > max.getPrecio()))
                max = temp;
        }
        return max;
    }

    @Override
    public double getPrecio() {
        double sum = 0;
        double cantArticulos = 0;
        for (ElementoMuseo e : articulos) {
            sum += e.getPrecio();
            cantArticulos += e.getCantidadArt();
        }
        double mult = cantArticulos*valorExtra;

        return mult <TOPE_EXTRA ? mult*sum : sum*TOPE_EXTRA;

    }
    
    public void agregarElemento(ElementoMuseo e) {
        this.articulos.add(e);
    }

    private ArrayList<ElementoMuseo> getElementos() {
        return new ArrayList<ElementoMuseo>(this.articulos);
    }

}
