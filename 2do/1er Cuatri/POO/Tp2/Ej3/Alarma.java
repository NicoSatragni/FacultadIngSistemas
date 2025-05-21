/*Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o
ventana, se detectó un movimiento dentro del domicilio. Cuando se invoca al método
comprobar() de la alarma, la misma chequea si alguna de sus variables indica que
debe hacer sonar la señal sonora.
Implementar una clase denominada AlarmaLuminosa que, además de activar la
señal sonora, encienda una luz cuando alguno de los indicadores está activado.
Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase
Luz con el método encender().
*/

/*Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se
cambien por sensores que pueden sondear diferentes partes de la casa. Cada sensor
posee el nombre de la zona que controla y si está activado o no. Permitir que se
incorporen nuevos sensores. Modificar la alarma para que además de hacer sonar el
timbre, imprima por pantalla el nombre de la zona en conflicto (pueden ser más de
una). */
import java.util.ArrayList;
public class Alarma {
    // protected boolean vidrioRoto;
    // protected boolean puertaAbierta;
    // protected boolean movimientoDetectado;
    protected ArrayList<Sensor> sensores;
    protected Timbre timbre;

    public Alarma() {
        // this.vidrioRoto = false;
        // this.puertaAbierta = false;
        // this.movimientoDetectado = false;
        this.sensores = new ArrayList<Sensor>();
        this.timbre  = new Timbre();
    }



    public Sensor verificar() {
        for (Sensor sensor : sensores) {
            if (sensor.isActivado()) {
                return sensor;
            }
        }
        return null;
    }

    public String comprobar() {
        Sensor sensor = verificar();
        if (sensor != null) {
            return this.activar() + " Zona: " + sensor.getZona();
        }
        return "\nTodo en orden";
    }
    
    public String activar() {
        timbre.hacerSonar();
        return "\nAlarma activada.";
    }

    public String agregarSensor(Sensor sensor) {
        this.sensores.add(sensor);
        return "\nSensor agregado: " + sensor.getZona();
    }

    public void sensorDetecta(int pos){
        sensores.get(pos).detectar();
    }
}