
import java.util.ArrayList;
import java.util.Comparator;
import Criterios.Criterio;

/*Se desea informatizar las evaluaciones virtuales de una academia de cursos online. Las evaluaciones tienen preguntas, la
cual tiene un enunciado, un puntaje, un tiempo estimado y una lista de conceptos que se evalúan. Las preguntas se
pueden organizar en unidades de evaluación, que al mismo tiempo pueden tener sub-unidades o preguntas. Las
unidades/sub-unidades de evaluación se dividen en dos tipos de unidades, las secuenciales y las optativas. En las
secuenciales el alumno debe responder todas las partes que la componen y por ende el puntaje se calcula como la suma
de los puntajes de sus partes, lo mismo para el tiempo estimado. En las unidades optativas el alumno puede optar por
responder solo una de las partes, con lo cual el puntaje se calcula como el mayor de los puntajes de sus elementos, y el
tiempo estimado es el mayor de los tiempos. En ambos tipos de unidades los conceptos abordados quedan
determinados como la unión sin repetidos de los conceptos de todas sus partes. A partir de lo anterior implementar los
siguientes servicios
● Obtener el puntaje de una pregunta/unidad/subunidad
● Obtener el tiempo estimado de una pregunta/unidad/subunidad
● Obtener el listado de conceptos de una
pregunta/unidad/subunidad
● Buscar todas las preguntas de una unidad que:
○ Tengan el concepto “polimorfismo”
○ Valgan más de 2 puntos
○ Tengan un tiempo estimado menor de 10 y un puntaje
mayor de 4
○ Combinaciones lógicas de las anteriores
Nota: En el caso de las unidades/subunidades secuenciales u optativas, las mismas no se incluyen en las
búsquedas, pero si las preguntas que posean y cumplan con lo solicitado (en cualquier nivel de profundidad). Las
búsquedas se devuelven ordenadas por diferentes formas por ejemplo por el enunciado de la pregunta y luego por el
puntaje, por el puntaje y luego por el tiempo, solo por el tiempo, entre otras posibles formas.
Se desea incorporar al sistema:  */


public abstract class ElementoEvaluacion {
    public abstract double getPuntaje();
    public abstract double getTiempoEst();
    public abstract ArrayList getConceptos();
    public abstract ArrayList getPreguntas(Criterio c, Comparator<Pregunta> comp);
}
