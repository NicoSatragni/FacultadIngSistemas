public class Provincia{
    private Ciudad[] ciudades;
    private boolean enDeficit;

    public Provincia (Ciudad[] ciudades){
        this.ciudades = ciudades;

        this.enDeficit = promedioDeficit(); 
    }


    private boolean promedioDeficit(){
        float nDeficit = 0;
        int deficit = 0;
        for (Ciudad ciudad : ciudades) {
            if ((ciudad.getGastos() - ciudad.getRecaudado()) < 0){
                deficit ++;
            } else{
                nDeficit ++;
            }
        }

        return nDeficit < deficit ? true : false;
    }
}