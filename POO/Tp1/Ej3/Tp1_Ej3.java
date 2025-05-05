
import java.util.Scanner;
public class Tp1_Ej3 {

    public static void main(String[] args){
        Serie serie = cargarDatosDePrueba();
        ArbolCapitulos capitulos = new ArbolCapitulos();

        capitulos.insertarCapitulos(serie.getTemporadas().getPrimerTemporada());

        ingresarCalificacion("juan", capitulos);

        Capitulo cap = capitulos.buscarCapitulo(new NodoCapitulo(new Capitulo("juan"))).getCapitulo();
        System.out.println("\nCapitulo: " + "\n Titulo: " + cap.getTitulo() + "\n Descripcion: " + cap.getDescripcion() + "\n Calificacion: " + cap.getCalificacion() + "\n Visto: " + (cap.isFlag() ? "Sí" : "No"));

        System.out.println("Capítulos vistos en temporada 1: " + serie.capitulosVistosTemporada(1));
        System.out.println("Capítulos vistos en toda la serie: " + serie.capitulosVistosSerie());
        System.out.println("Promedio temporada 1: " + serie.promedioCalificacionesTemporada(1));
        System.out.println("Promedio serie: " + serie.promedioCalificacionesSerie());
        System.out.println("¿Serie completa vista? " + (serie.isVista() ? "Sí" : "No"));
    }



    public static void ingresarCalificacion(String tituloCapitulo, ArbolCapitulos capitulos) {
        NodoCapitulo capituloBuscar = new NodoCapitulo(new Capitulo(tituloCapitulo));

        Capitulo capitulo = capitulos.buscarCapitulo(capituloBuscar) != null ? capitulos.buscarCapitulo(capituloBuscar).getCapitulo() : null;

        Scanner scanner = new Scanner(System.in);
        int calificacion;
        boolean valido = false;
        if (capitulo != null) {
            while (!valido) {
                System.out.print("Ingrese la calificación del capítulo (1 a 5): ");
                try {
                    calificacion = scanner.nextInt();
                    if (calificacion >= 1 && calificacion <= 5) {
                        valido = true;
                        capitulo.setCalificacion(calificacion);
                        System.out.println("Calificación guardada con éxito.");
                    } else {
                        System.out.println("La calificación no es correcta, debe ser entre 1 y 5.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: ingrese un número válido entre 1 y 5.");
                    scanner.nextLine(); // Limpiar el buffer
                }
            }
        } else {
            System.out.println("No existe el capitulo!");
        }
    }

    public static Serie cargarDatosDePrueba() {
        Serie serie = new Serie("Breaking Java", "Una serie sobre código que explota", "Juan Dev", "Drama");

        // Temporada 1
        Capitulo cap1 = new Capitulo("Inicio", "Hola Mundo", true, 5);
        Capitulo cap2 = new Capitulo("Variables", "Qué es una variable", true, 4);
        serie.getTemporadas().agregarTemporada(1, cap1);
        serie.getTemporadas().agregarCapitulo(1, cap2);

        // Temporada 2
        Capitulo cap3 = new Capitulo("Clases", "POO básica", true, 3);
        Capitulo cap4 = new Capitulo("Herencia", "POO avanzada", true, 2);
        serie.getTemporadas().agregarTemporada(2, cap3);
        serie.getTemporadas().agregarCapitulo(2, cap4);

        // Temporada 3
        Capitulo cap5 = new Capitulo("Polimorfismo", "Más POO", true, 5);
        Capitulo cap6 = new Capitulo("Interfaces", "POO nivel dios", true, 5);
        Capitulo cap7 = new Capitulo("juan", "Hola Juan", false, -1);
        serie.getTemporadas().agregarTemporada(3, cap5);
        serie.getTemporadas().agregarCapitulo(3, cap6);
        serie.getTemporadas().agregarCapitulo(3, cap7);

        return serie;
    }





}