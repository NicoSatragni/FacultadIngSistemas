package tp7;
import java.util.ArrayList;
import tp7.condiciones.*;

public interface ContenidoSitio {
    int contarNoticias();
    ArrayList<Noticia> buscar(CondicionBusqueda condicion);
    ContenidoSitio filtrar(CondicionBusqueda condicion);
    ArrayList<String> getPath(String path);
}
