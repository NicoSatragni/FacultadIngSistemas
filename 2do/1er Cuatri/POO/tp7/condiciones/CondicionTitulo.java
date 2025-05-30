package tp7.condiciones;

public class CondicionTitulo implements CondicionBusqueda{
    
    private String tituloB;

    public CondicionTitulo(String tituloB) {
        this.tituloB = tituloB;
    }

    public boolean cumple(Noticia noticia) {
        return noticia.equalsIgnoreCase(tituloB);
    }
}
