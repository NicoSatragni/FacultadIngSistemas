public class Luz{
    private String nombre;
    private boolean luz;

    public Luz() {
        this.nombre = "soyLuz";
        this.luz = false;
    }

    public String encender() {
        this.luz = true;
        return " Luz encendida, en ";
    }
}