

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

        System.out.println(Argentina.imprimirDeficit());
        //hola puto
        
        System.exit(0);
    }



}
