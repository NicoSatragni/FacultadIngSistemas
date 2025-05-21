/*
 * Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las computadoras
que dispone. Si no hay computadoras disponibles los procesos a ejecutar deben esperar en una
cola de espera que los ordena teniendo en cuenta sus requerimientos de memoria (los procesos
con mayor requerimiento de memoria serán atendidos en primer lugar). Las computadoras
disponibles para ejecutar procesos se ordenan en una cola que prioriza la selección de las
computadoras más rápidas.

 */
package tp4.ej1;


public class Computadora extends Elemento{
    private boolean enUso;
    
    public Computadora(String nombre, int velocidad) {
        super(nombre, velocidad);
        this.enUso = false;
    }

    public boolean isEnUso() {
        return enUso;
    }

    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }

    

    public boolean vaAntes(Elemento actual){
        return actual.getRecurso() <= this.getRecurso() ? true: false;
    }
    
    public int getVelocidad() {
        return this.recurso;
    }


}