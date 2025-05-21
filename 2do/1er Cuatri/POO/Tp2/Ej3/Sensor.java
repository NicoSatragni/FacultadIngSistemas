public class Sensor {
    private String nombre;
    private boolean estado;

    public Sensor(String nombre) {
        this.nombre = nombre;
        this.estado = false;
    }

    public String getZona() {
        return nombre;
    }
    public boolean isActivado() {
        return estado;
    }
    public void detectar() {
        this.estado = true;
    }
}