

public class GastoPublico{
    public static void main(String args[]){

        Pais Argentina = new Pais();

        for( Provincia provincia : Argentina.getProvincias() ){
            System.out.println("Provincia: " + provincia.getNombre());
        };

        for( Provincia provincia : Argentina.getProvinciasDeficit() ){
            System.out.println("Provincia: " + provincia.getNombre() + " Esta en deficit");
        };

        for( Provincia provincia : Argentina.getProvinciasNoDeficit() ){
            System.out.println("Provincia: " + provincia.getNombre() + " Esta en superavit");
        };


        for ( Provincia provincia :Argentina.getProvincias()){
            System.out.print("\n");
            for (Ciudad ciudad : provincia.enDeficit() ){
                System.out.println("  La ciudad: " + ciudad.getNombre() + " De " + provincia.getNombre() + " Esta en deficit");
            }
        }

        System.out.println(Deficit(Argentina));
    }

    public static String Deficit(Pais pais){
        if(pais.enDeficit()){
            return ( "\nEl pais esta en deficit, la mayoria de sus provincias gastan mas de lo que recaudan" );
        } else{
            return( "\nEl pais NO esta en deficit, la mayoria de sus provincias recaudan mas de lo que gastan" );

        }
    }

}