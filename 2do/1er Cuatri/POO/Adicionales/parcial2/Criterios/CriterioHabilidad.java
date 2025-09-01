package parcial2.Criterios;

import parcial2.Poni;

public class CriterioHabilidad implements Criterio {
    
    protected String habilidadReq;

    public CriterioHabilidad(String habilidad) {
        this.habilidadReq = habilidad;
    }

    @Override
    public boolean cumple(Poni p) {
        return p.getHabilidades().contains(habilidadReq);
    }
}
