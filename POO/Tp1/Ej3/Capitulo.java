/*Una Serie está formada por un conjunto de temporadas, cada una de las cuales tiene una
cantidad de episodios. Cada episodio posee un título, una descripción, un flag indicando
si el usuario ya vio el episodio y una calificación dada por el usuario (con valores de 1 a
5). Si el usuario no vio un episodio particular, la calificación dada será un valor
negativo.
Las series poseen como atributos (además de los episodios correspondientes) un título,
una descripción, un creador y un género.
Implementar en Java las clases involucradas, determinar qué clase es responsable de
responder los siguientes servicios e implementarlos en Java.
●X Ingresar la calificación de un episodio. Si el valor ingresado como calificación
no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.
● Obtener el total de episodios vistos de una temporada particular.
● Obtener el total de episodios vistos de una serie.
● Obtener el promedio de las calificaciones dadas por el usuario para una
temporada particular.
● Obtener el promedio de las calificaciones dadas por el usuario para una serie.
● Determinar si el usuario ya vio todos los episodios de la serie.
Nota. Para calcular los promedios, tener sólo en cuenta los episodios vistos por el
usuario. */




public class Capitulo {

    private String titulo, descripcion;

    boolean flag;

    int calificacion;



    public Capitulo(){
        this.titulo = "Sin titulo";
        this.descripcion = "Sin descripcion";
        this.flag = false;
        this.calificacion = -1;
    }
    public Capitulo(String titulo){
        this.titulo = titulo;
        this.descripcion = "Sin descripcion";
        this.flag = false;
        this.calificacion = -1;
    }

    public Capitulo(String titulo, String descripcion, boolean flag, int calificacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = flag;
        this.calificacion = calificacion;
    }


    public boolean setCalificacion(int calificacion) {
        if(calificacion >= 1 && calificacion <= 5){
            this.calificacion = calificacion;
            this.flag = true;
            return true;
        }
        return false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    
    



}
