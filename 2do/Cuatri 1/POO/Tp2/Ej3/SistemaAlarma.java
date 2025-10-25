public class SistemaAlarma{

    public static void main(String[] args) {
        Alarma alarma = new Alarma();

        //agrega sensores
        System.out.println(alarma.agregarSensor(new Sensor("habitacion")) +
                            alarma.agregarSensor(new Sensor("cocina")) +
                            alarma.agregarSensor(new Sensor("patio"))
        );
        
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa();
        
        //agrega sensores
        System.out.println(alarmaLuminosa.agregarSensor(new Sensor("habitacion")) +
                            alarmaLuminosa.agregarSensor(new Sensor("cocina")) +
                            alarmaLuminosa.agregarSensor(new Sensor("garage"))
        );
        //simula detectar algo
        alarma.sensorDetecta(0);

        //Comprueba los sensores
        System.out.println(alarma.comprobar() + alarmaLuminosa.comprobar());

        //simula detectar algo
        alarmaLuminosa.sensorDetecta(1);

        //omprueba los sensores
        System.out.println(alarmaLuminosa.comprobar());
        
    }
}