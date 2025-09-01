package prefinal;
import java.util.ArrayList;
import java.util.List;

import prefinal.CalculadoresCreditos.CalculadorCreditos;

public class Taller extends ElementoCurso {
    private double calificacionMinima;
    private double cantHoras;
    private ArrayList<String> pClave;
    private CalculadorCreditos calculador;

    public Taller(String nombre, Double calificacionMinima, Double cantHoras, List<String> pClave, CalculadorCreditos c) {
        super(nombre);
        this.calificacionMinima = calificacionMinima;
        this.cantHoras = cantHoras;
        this.pClave = new ArrayList<>(pClave);
        this.calculador = c;
    }

    @Override
    public double getDuracion() {
        return this.cantHoras;
    }

    @Override
    public boolean aprobo(Habitante h) {
        return h.aprobo(this);
    }

    @Override
    public Taller getTallerMayDuracion() {
        return this;
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
        return  new ArrayList<String>(this.pClave);
    }

    @Override
    public ElementoCurso getCopiaSinAprobar(Habitante h) {
        if (!h.aprobo(this))
            return new Taller(this.getNombre(), this.getCalificacionMinima(), this.getCantHoras(), this.getPalabrasClaves(), this.getCalculador());
        
        return null;
    }

    @Override
    public double getCreditos() {
        return this.calculador.calculate(this);
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacionMinima() {
        return calificacionMinima;
    }

    public double getCantHoras() {
        return cantHoras;
    }

    public ArrayList<String> getpClave() {
        return pClave;
    }

    public CalculadorCreditos getCalculador() {
        return this.calculador;
    }   


    

    

}
