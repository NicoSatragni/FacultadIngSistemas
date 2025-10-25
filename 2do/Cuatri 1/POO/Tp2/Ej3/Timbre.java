public class Timbre{
    private boolean activo;

    public Timbre() {
        this.activo = false;
    }

    public void hacerSonar() {
        if (this.activo) {
            System.out.println("Timbre sonando");
        }
    }
}