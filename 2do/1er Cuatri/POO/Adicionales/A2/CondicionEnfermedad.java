package A2;
public class CondicionEnfermedad implements CondicionBusqueda {
    private String palabra;

    public CondicionEnfermedad(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Medicamento med) {
        for (String enf : med.getEnfermedades()) {
            if (enf.equalsIgnoreCase(palabra)) {
                return true;
            }
        }
        return false;
    }
    
}
