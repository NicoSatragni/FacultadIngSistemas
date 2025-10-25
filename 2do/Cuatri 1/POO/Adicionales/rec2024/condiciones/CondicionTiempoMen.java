package rec2024.condiciones;

import rec2024.ElementoEvaluacion;

public class CondicionTiempoMen implements Condicion{
    private double tiempo;

    public CondicionTiempoMen(double tiempo) {
        this.tiempo = tiempo;
    }

    
    @Override
    public boolean cumple(ElementoEvaluacion e) {
        return tiempo > e.tiempoEstimado();
    }
}
