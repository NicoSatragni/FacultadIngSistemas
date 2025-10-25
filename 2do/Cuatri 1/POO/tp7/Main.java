package tp7;

import java.util.ArrayList;
import tp7.condiciones.*;

public class Main {
    public static void main(String[] args) {
        // Palabras clave
        ArrayList<String> pClave1 = new ArrayList<>();
        pClave1.add("Partido");
        pClave1.add("Goleada");

        ArrayList<String> pClave2 = new ArrayList<>();
        pClave2.add("Espectáculo");
        pClave2.add("Divorcio");

        ArrayList<String> pClave3 = new ArrayList<>();
        pClave3.add("Fútbol");

        // Noticias
        Noticia n1 = new Noticia("Ultimo momento", "Intro1", "Texto muy largo de más de 200 caracteres...".repeat(10), "Juan Pérez", "Link1", pClave1);
        Noticia n2 = new Noticia("Divorcio famoso", "Intro2", "Texto corto", "Ana López", "Link2", pClave2);
        Noticia n3 = new Noticia("Goleada histórica", "Intro3", "Texto de fútbol", "Juan Pérez", "Link3", pClave1);
        Noticia n4 = new Noticia("Partido final", "Intro4", "Texto de partido", "Carlos Ruiz", "Link4", pClave3);

        // Sub-sección
        Contenedor divorcios = new Contenedor("Divorcios", "fotoDivorcios");
        divorcios.agregarContenido(n2);
        divorcios.agregarContenido(n3);

        // Sección
        Contenedor espectaculos = new Contenedor("Espectáculos", "fotoEspectaculos");
        espectaculos.agregarContenido(n1);
        espectaculos.agregarContenido(divorcios);

        Contenedor futbol = new Contenedor("Fútbol", "fotoFutbol");
        futbol.agregarContenido(n4);

        Contenedor deportes = new Contenedor("Deportes", "fotoDeportes");
        deportes.agregarContenido(futbol);

        // Categoría principal
        Contenedor generales = new Contenedor("Generales", "fotoGenerales");
        generales.agregarContenido(espectaculos);
        generales.agregarContenido(deportes);

        // Test: contar noticias
        System.out.println("Cantidad de noticias en Generales: " + generales.contarNoticias());

        // Test: buscar noticias por autor
        CondicionBusqueda cAutor = new CondicionAutor("Juan Pérez");
        ArrayList<Noticia> noticiasJuan = generales.buscar(cAutor);
        System.out.println("Noticias de Juan Pérez: " + noticiasJuan.size());

        // Test: buscar noticias por palabra clave
        CondicionBusqueda cPClave = new CondicionPClave("Partido");
        ArrayList<Noticia> noticiasPartido = generales.buscar(cPClave);
        System.out.println("Noticias con palabra clave 'Partido': " + noticiasPartido.size());

        // Test: filtrar estructura por palabra clave (copia)
        ContenidoSitio filtrado = generales.filtrar(cPClave);
        System.out.println("Filtrado (estructura copia) por 'Partido': " + (filtrado != null ? filtrado.getPath("") : 0));

        // Test: obtener paths
        ArrayList<String> paths = generales.getPath("Generales");
        System.out.println("Mapa del sitio:");
        for (String path : paths) {
            System.out.println(path);
        }
    }
}