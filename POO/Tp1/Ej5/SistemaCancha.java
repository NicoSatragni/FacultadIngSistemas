import java.util.Scanner;
public class SistemaCancha {
    int PrecioF = 400, precioPaddle = 100;
    public static void main(String args[]){

    }


    public void menu(Persona persona){
        System.out.println("Selecciona una opcion:\n  1.Futbol.\n  2.Paddle  \n  3.Salir");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Debes cobrar: " + cobrar(persona, precioF);
                break;
            case 2:
                System.out.println("Debes cobrar: " + cobrar(persona, precioPaddle);
                break;

            default:
                break;
        }
    }

    public double cobrar(Persona persona, int precio){
        return persona.isSocio() ? precio * 0.9 : precio;
    }