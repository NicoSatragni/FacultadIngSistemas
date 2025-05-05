/*2) Se tiene ya cargada en memoria una estructura con toda la información de los números de legajo [integer] de
los alumnos de Ingeniería de sistemas con los códigos de materias [integer] y notas de finales [real].
 Dicha estructura es un árbol con los números de legajo ordenados ascendentemente y cada nodo posee además un puntero adicional 
 a una lista simple en la que cada nodo posee código de materia y nota. Esta lista estará siempre ordenada ascendentemente por 
 código de materia. Están almacenadas todas las notas de finales, aprobados o no, por lo tanto la lista posee códigos de materia 
 repetidos cuando un alumno intentó dar más de una vez la materia.
Dada esta estructura (árbol con listas) y un archivo con las notas de la última fecha de finales (que aún no están incorporadas 
en la estructura) en el que cada registro posee: legajo, codigo de materia y nota, debe agregar todos los registros del archivo
 en la estructura teniendo en cuenta que puede haber legajos que aún no están en el árbol y que la nota se debe agregar como
  última de ese código de materia (si ya tiene desaprobados) o como única nota de ese código, incorporando el nodo y manteniendo 
  el orden con los otros códigos existentes.
Realice el código del programa completo, con todas las clases que considere, definiciones de constantes, atributos y métodos.
Notas: a) No tiene que implementar la generación/carga de la estructura ni del archivo ni imprimir ningún resultado. b) No puede 
utilizar estructuras auxiliares. c) Debe mantener el orden del árbol y de la lista en todo momento.
Ejemplo de estructura en memoria: En este ejemplo el alumno con número de legajo 4 rindió primero la materia 7 sacando un 2
 y luego sacó un 4, también rindió la materia con código 81 y sacó un 8. */

 public class ArbolAlumnos {

    private NodoAlumnos raiz;

    public ArbolAlumnos(){
        this.raiz = null;
    }

    public String agregarNota(int nLegajo, int cMateria, double nota){
        NodoAlumnos alumno = buscarOinsertarAlumnos(nLegajo);
        alumno.getMaterias().insertarMateria(new NodoMaterias(cMateria, nota));
        return "Nota guardada con exito!";
    }


    public NodoAlumnos buscarOinsertarAlumnos(int nLegajo){
        NodoAlumnos actual = this.raiz;
        this.raiz = buscarOinsertarAlumnoRec(actual, nLegajo);
        return buscarOinsertarAlumnoRec(actual, nLegajo);

    }
    public NodoAlumnos buscarOinsertarAlumnoRec(NodoAlumnos actual, int nLegajo){
        if (actual == null) {
            return new NodoAlumnos(nLegajo);
        }else if (actual.getnLegajo() == nLegajo) {
            return actual;
        } else if(actual.getnLegajo() > nLegajo){
            actual.setMenores(buscarOinsertarAlumnoRec(actual.getMenores(), nLegajo));
        } else {
            actual.setMayores(buscarOinsertarAlumnoRec(actual.getMayores(), nLegajo));
        }
        return actual;
    }




    public void imprimirInOrder(){
        NodoAlumnos actual = this.raiz;
        imprimirInOrderRec(actual);
    }
    
    public void imprimirInOrderRec(NodoAlumnos actual){
        if(actual != null){
            System.out.println("Alumno: " + actual.getnLegajo() + " Materias: ");
            imprimirLista(actual);

            imprimirInOrderRec(actual.getMenores());
            imprimirInOrderRec(actual.getMayores());
        }
    }

    public void imprimirLista(NodoAlumnos alumno){
        NodoMaterias actual = alumno.getMaterias().getPrimero();
        while (actual != null) {
            System.out.println("Alumno: " + alumno.getnLegajo() + "Materia: " + actual.getCMateria() + " Nota: " + actual.getNFinales());
            //System.out.println("ACAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA " + actual.getSiguientePuntaje().getNombre());
            actual = actual.getSiguiente();
        }
    }
}

