package ej1;
/*1 Se tienen cargados en el archivo Equipos.ser los datos referidos a equipos participantes de un torneo deportivo.
El archivo no se encuentra ordenado bajo ningún criterio. Cada registro del archivo contiene: nombre (de tipo string), puntaje (integer).
Se pide que implemente las clases y métodos necesarios para generar un árbol ARB_EQUIPOS en memoria 
principal con todos los datos del archivo teniendo en cuenta lo siguiente:
El árbol debe estar ordenado alfabéticamente por nombre del equipo.
Si ingresa un equipo con un nombre que ya fue incorporado al árbol, no debe incorporarse.
Los nodos del árbol deben tener un atributo adicional de tal manera que los equipos puedan ser listados ascendentemente por puntaje mediante ese vínculo
(armando una lista simple). Ese nuevo orden es accedido por un atributo inicial ORDEN_PUNTAJE.

NOTAS: 
El árbol debe estar ordenado en todo momento por nombre de equipo.
La lista que forman los nodos del árbol a partir de ORDEN_PUNTAJE y por el vínculo adicional también debe estar ordenada
correctamente por puntaje en todo momento (ante cada nuevo equipo  que se agrega). 
No puede usar estructuras auxiliares.  
Debe definir: clases, constantes, atributos y métodos.
Asuma que el archivo ya existe y está cargado.
Tampoco debe imprimir el resultado. */


class NodoEquipo {
    private String nombre;
    private int puntaje;
    private NodoEquipo mayores, menores, siguientePuntaje;


    public NodoEquipo(String nombre, int puntaje){
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.mayores = null;
        this.menores = null;
        this.siguientePuntaje = null;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getPuntaje() {
        return puntaje;
    }


    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }


    public NodoEquipo getMayores() {
        return mayores;
    }


    public void setMayores(NodoEquipo mayores) {
        this.mayores = mayores;
    }


    public NodoEquipo getMenores() {
        return menores;
    }


    public void setMenores(NodoEquipo menores) {
        this.menores = menores;
    }


    public NodoEquipo getSiguientePuntaje() {
        return siguientePuntaje;
    }


    public void setSiguientePuntaje(NodoEquipo siguientePuntaje) {
        this.siguientePuntaje = siguientePuntaje;
    }

    

}