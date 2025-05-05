public class Provincia{
    private Ciudad[] ciudades;
    private boolean enDeficit;
    private String nombre;

    public Provincia (nombre,  Ciudad[] ciudades){
        this.ciudades = ciudades;
        this.nombre = nombre
        this.enDeficit = promedioDeficit(); 
    }


    private boolean promedioDeficit(){
        float nDeficit = 0;
        int deficit = 0;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.getHabitantes() > 99999){
                if ((ciudad.getGastos() - ciudad.getRecaudado()) < 0){
                    deficit ++;
                } else{
                    nDeficit ++;
                }
            }
        }

        return nDeficit < deficit ? true : false;
    }



    
}