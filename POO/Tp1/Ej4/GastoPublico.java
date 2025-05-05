public class GastoPublico{
    public static void main(String args[]){

        Pais Argentina = new Pais();

        for( Provincia provincia : Argentina.getProvincias() ){
            System.out.println(provincia.getNombre());
        }
    }
}