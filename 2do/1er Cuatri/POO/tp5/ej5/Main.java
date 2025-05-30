/*
 * Una plataforma de streaming de video permite a sus usuarios consultar su catálogo de películas
disponibles. De cada película se guarda el título, la sinopsis, los géneros (“acción”, “terror”,
“drama”, etc), el director, los actores, el año de estreno, la duración de la película (en minutos),
y la edad mínima requerida para ver la película.
La plataforma debe permitir realizar búsquedas de películas según diversos criterios, por
ejemplo:
● Buscar todas las películas que en el título contenga la palabra “luna”.
● Buscar todas las películas que contengan un género específico (por ejemplo, “terror”).
● Buscar todas las películas en las que haya actuado Will Smith y cuyo director NO haya
sido Martin Scorsese.
● Buscar todas las películas que se hayan grabado antes del 2015 y cuya duración sea
menor a 95 minutos.
A su vez, dado que algunas películas son más exitosas que otras, a la hora de analizar si
adquirir la licencia de una nueva película, la plataforma analiza si la película resultará rentable o
no. Una película será rentable si cumple con ciertos criterios que hace que los usuarios prefieran
verla. Por ejemplo, el CEO de la plataforma observó que los usuarios suelen ver:
● Películas cuya duración sea menor a 120 minutos, que no sean del género “comedia”.
● Películas posteriores del 2017, a no ser que se trate de películas del género “infantil” o
“documental”.
Dado que las preferencias de los clientes cambian con el tiempo, el CEO de la plataforma de
streaming desea poder cambiar en tiempo de ejecución las políticas de adquisición de licencias
de películas, en caso de ser necesario. Proveer un servicio que le permita a la plataforma
determinar si una película resultará rentable o no.
 */

package ej5;

import ej5.criterios.CriterioActor;
import ej5.criterios.CriterioGenero;

public class Main {
    
    public static void main(String[] args) {
        
        PoliticaRentabilidad politicaArgentina = new PoliticaRentabilidad();
        
        CriterioActor c1 = new CriterioActor("Jansen");
        CriterioGenero c2 = new CriterioGenero("Terror");
        
        System.out.println(
        politicaArgentina.agregarCriterio(c1) + "\n" +
        politicaArgentina.agregarCriterio(c2)
        );
        Catalogo argentina = new Catalogo(politicaArgentina);

               // Películas de prueba
        Pelicula p1 = new Pelicula(
            "La luna sangrienta",
            "Terror en la luna llena",
            "Juan Perez",
            new String[]{"Terror", "Suspenso"},
            new String[]{"Jansen", "Maria Lopez"},
            2018,
            110,
            16
        );

        Pelicula p2 = new Pelicula(
            "Comedia en Marte",
            "Risas fuera de este mundo",
            "Ana Torres",
            new String[]{"Comedia", "Aventura"},
            new String[]{"Carlos Ruiz", "Sofia Gomez"},
            2020,
            95,
            13
        );

        Pelicula p3 = new Pelicula(
            "El misterio del bosque",
            "Un misterio sin resolver",
            "Pedro Gomez",
            new String[]{"Terror", "Drama"},
            new String[]{"Lucia Diaz", "Martin Castro"},
            2015,
            100,
            15
        );

        // Probar agregar películas al catálogo
        System.out.println(argentina.agregarPelicula(p1)); // No debería agregarse porque actúa Jansen
        System.out.println(argentina.agregarPelicula(p2)); // No debería agregarse porque no es de Terror
        System.out.println(argentina.agregarPelicula(p3)); // Debería agregarse (es de Terror y no actúa Jansen)
    }
    
}
