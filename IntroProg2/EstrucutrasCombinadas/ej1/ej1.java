package ej1;
public class ej1 {

    public static void main(String args[]){
        ArbolEquipos arbol = new ArbolEquipos();
        
        System.out.println(arbol.insertarEquipo(new NodoEquipo("Boca", 3)));
        System.out.println(arbol.insertarEquipo(new NodoEquipo("River", 13)));
        System.out.println(arbol.insertarEquipo(new NodoEquipo("Estudiantes", 7)));
        System.out.println(arbol.insertarEquipo(new NodoEquipo("Newells", 5)));
        System.out.println(arbol.insertarEquipo(new NodoEquipo("Banfield", 6)));

        arbol.imprimirInOrder();
        arbol.imprimirLista();
    }
}
