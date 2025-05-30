package tp7.condiciones;
import tp7.Noticia;
public class CondicionPClave implements CondicionBusqueda{
    private String palabra;


    

    public CondicionPClave(String palabra) {
        this.palabra = palabra;
    }




    @Override
    public boolean cumple(Noticia n) {
        return n.getpClave().contains(palabra);
    }
    
}
