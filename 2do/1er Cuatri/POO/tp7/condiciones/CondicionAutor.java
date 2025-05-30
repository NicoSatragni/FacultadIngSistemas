package tp7.condiciones;

import tp7.Noticia;

public class CondicionAutor implements CondicionBusqueda{
    private String palabra;

    public CondicionAutor(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple (Noticia n) {
        return n.getAutor().equalsIgnoreCase(this.palabra);
    }
}
