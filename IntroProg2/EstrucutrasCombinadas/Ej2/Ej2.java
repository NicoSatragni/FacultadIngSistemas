public class Ej2 {
    public static void main(String[] args) {
        ArbolAlumnos alumnos = new ArbolAlumnos();
        
        alumnos.agregarNota(123, 1, 3);
        alumnos.agregarNota(123, 1, 1);
        alumnos.agregarNota(123, 1, 4);
        alumnos.agregarNota(123, 2, 7);
        alumnos.agregarNota(456, 4, 3);
        alumnos.agregarNota(456, 5, 6);
        alumnos.agregarNota(456, 1, 2);
        alumnos.agregarNota(789, 1, 2);

        alumnos.imprimirInOrder();
        //alumnos.imprimirLista();
    }
}
