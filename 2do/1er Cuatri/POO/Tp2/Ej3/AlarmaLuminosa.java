public class AlarmaLuminosa extends Alarma{
    private Luz luz = new Luz();

    public AlarmaLuminosa() {
        super();
        this.luz = new Luz();
    }

    @Override
    public String activar() {
        super.activar();
        return "Alarma activada." +  this.luz.encender();
    }
    
}