
public class ej1{

    public static void main(String[] args){
        Persona Nico = new Persona(12345678, "Nicola", "Satragni", "18/05/1995", 'M', 70, 1.71, 20);
        Persona Marcos = new Persona(87654321, "Marcos", "Sincovich", "05/07/2008", 'M', 65, 1.80, 15);
        
        Persona Juan = new Persona(46759832);
        Persona Marito = new Persona(43215269, "Marito", "Hernandez", "29/03/2025");

        System.out.println("\n"+ Nico.toString());
        System.out.println("\n"+ Marcos.toString());
        System.out.println("\n"+ Juan.toString());
        System.out.println("\n"+ Marito.toString());
        System.out.println("\nTiene: "+ Marito.getEdad());
        System.out.println("\nEsta en forma? "+ Nico.enForma());
        System.out.println("\nEs coherente? "+ Nico.esCoherente());
        System.out.println("\nEs su cumpleanos? "+ Nico.esCumpleanos());
        System.out.println("\nEs votante?  "+ Marcos.esVotante());
        System.out.println("\nEs Mayor?  "+ Marcos.esMayor());
        System.out.println("\nEs Su Cumpleanos? "+ Marito.esCumpleanos());
    }
}