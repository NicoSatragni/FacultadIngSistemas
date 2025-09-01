package parcial2;

import java.util.ArrayList;
import java.util.List;

import Recu2.Criterios.Criterio;

public class Poni extends ElemDefensa implements Comparable<Poni> {
    protected String nombre;
    protected double poderMagico;
    protected double velocidad;
    protected ArrayList<String> habilidades;

    public Poni (String nombre, double poderMagico, double velocidad, List<String> habilidades){
        this.nombre = nombre;
        this. poderMagico = poderMagico;
        this.velocidad = velocidad;
        this.habilidades = new ArrayList<>(habilidades);
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public double getPoderMagico() {
        return this.poderMagico;
    }

    @Override
    public double getVelocidad() {
        return this.velocidad;
    }

    @Override
    public ArrayList<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

    @Override
    public ArrayList<Poni> buscarPonis(Criterio c) {
        ArrayList<Poni> rtn = new ArrayList<>();
        if(c.cumple(this)) rtn.add(this);
        return rtn;
    }
    
    @Override
    public int compareTo(Poni p) {
        if (this.getPoderMagico() - p.getPoderMagico() != 0) {
            return (this.getPoderMagico() - p.getPoderMagico()) > 0 ? 1 : -1;
        }
        if (this.getVelocidad() - p.getVelocidad() != 0) {
            return this.getVelocidad() - p.getVelocidad() > 0 ? 1 : -1;
        }            
        return (this.getHabilidades().size() - p.getHabilidades().size());
}
