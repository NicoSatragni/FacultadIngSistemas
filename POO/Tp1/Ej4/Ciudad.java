/*
Un país tiene que controlar el gasto público de las ciudades con más de 100.000 
habitantes. Para ello, tiene información del monto recaudado por cada ciudad a través de 
cinco diferentes tipos de impuestos (denominados, aquí, de imp1, imp2, imp3, imp4 e 
imp5) e información acerca de gastos realizados en mantenimiento de la ciudad. Este 
país necesita un sistema que le informe cuales son las ciudades que gastan más de lo 
que recaudan, y las provincias que tienen más de la mitad de las ciudades en condición 
de déficit. Tener en cuenta la delegación de responsabilidades a la hora de plantear la( 
solución. Implementar en java 
 */

public class Ciudad {
    private String nombre;
    private int habitantes, maxImp;
    private double  gastos;
    private double[]  recaudado;
    private boolean enDeficit;

    public Ciudad(String nombre, int habitantes, double[] recaudado, double gastos){
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.recaudado = recaudado;
        this.gastos = gastos;
        this.enDeficit = ((sumaRecaudados(recaudado) - gastos) < 0) ? true : false;
    }

    private float sumaRecaudados(double[] recaudado){
        float suma = 0;
        for (double f : recaudado) {
            suma += f;
        }
        return suma;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public double  getGastos() {
        return gastos;
    }

    public void setGastos(float gastos) {
        this.gastos = gastos;
    }

    public double getRecaudado() {
        return recaudado(this.recaudado);
    }

    public void setRecaudado(double[] recaudado) {
        this.recaudado = recaudado;
    }

    public boolean isEnDeficit() {
        return enDeficit;
    }

    public void setEnDeficit(boolean enDeficit) {
        this.enDeficit = enDeficit;
    }
    
    private double recaudado(double[] impuestos){
        double cont = 0;
        for (double f : impuestos) {
            cont += f;
        }
        return cont;
    }

    public String getNombre(){
        return this.nombre;
    }
    

}
