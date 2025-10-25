package tp7;
import java.util.ArrayList;
import tp7.condiciones.*;

public class Contenedor implements ContenidoSitio{
    private String nombre, foto;
    private ArrayList<ContenidoSitio> hijos;

    public Contenedor(String nombre, String foto) {
        this(nombre, foto, new ArrayList<>());
    }

    public Contenedor(String nombre, String foto, ArrayList<ContenidoSitio> hijos) {
        this.nombre = nombre;
        this.foto = foto;
        this.hijos = hijos;
    }

    @Override
    public int contarNoticias() {
        int suma = 0;
        for (ContenidoSitio hijo : this.hijos) {
            suma += hijo.contarNoticias();
        }
        return suma;
    }

    @Override
    public ArrayList<Noticia> buscar(CondicionBusqueda condicion) {
        ArrayList<Noticia> aux = new ArrayList<>();
        for (ContenidoSitio hijos : this.hijos) {
            aux.addAll(hijos.buscar(condicion));
        }
        return aux;
    }

    @Override
    public ArrayList<String> getPath(String pathBase) {
        String pathAct = new String(pathBase);
        pathAct += "\\" + this.getNombre();

        ArrayList<String> paths = new ArrayList<>();
        paths.add(pathAct);

        for (ContenidoSitio hijo : hijos) {
            paths.addAll(hijo.getPath(pathAct));
        }
        return paths;
    }

    @Override
    public ContenidoSitio filtrar(CondicionBusqueda condicion) {
        Contenedor copia = new Contenedor(this.nombre , this.foto);

        for (ContenidoSitio hijo : this.hijos) {
            ContenidoSitio filtrado = hijo.filtrar(condicion);

            if (filtrado != null) {
                copia.agregarContenido(filtrado);
            }
        }
        if (!copia.getSub().isEmpty()) {
            return copia;
        }
        return null;

    }

    public void agregarContenido(ContenidoSitio cont) {
        hijos.add(cont);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public ArrayList<ContenidoSitio> getSub() {
        return this.hijos;
    }

    public void setSub(ArrayList<ContenidoSitio> hijos) {
        this.hijos = hijos;
    }
    
    
}
