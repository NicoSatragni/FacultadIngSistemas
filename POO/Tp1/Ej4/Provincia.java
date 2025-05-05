public class Provincia{
    private Ciudad[] ciudades;
    private boolean enDeficit;
    private String nombre;

    public Provincia (String nombre,  Ciudad[] ciudades){
        this.ciudades = ciudades;
        this.nombre = nombre;
        this.enDeficit = enDeficit(); 
    }




    public boolean enDeficit(){
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

    public Ciudad[] getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudad[] ciudades) {
        this.ciudades = ciudades;
    }

    public boolean isEnDeficit() {
        return enDeficit;
    }

    public void setEnDeficit(boolean enDeficit) {
        this.enDeficit = enDeficit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    
}