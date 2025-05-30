package tp7;

import tp7.condiciones.*;
import java.util.ArrayList;

public class Noticia implements ContenidoSitio{
    private String titulo, introduccion, texto, autor, link;
    private ArrayList<String> pClave;
    
    public Noticia(String titulo, String introduccion, String texto, String autor, String link, ArrayList<String> pClave) {
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        this.pClave = pClave;
    }



    @Override
    public ArrayList<Noticia> buscar(CondicionBusqueda condicion){
        ArrayList<Noticia> aux = new ArrayList<>();
        if(condicion.cumple(this)) {
            aux.add(this);
        };
        return aux;
    }

    @Override
    public ContenidoSitio filtrar(CondicionBusqueda condicion) {
        if(condicion.cumple(this)) {
            return this;
        }
        return null;
    }

    @Override
    public ArrayList<String> getPath(String pathBase) {
        ArrayList<String> ss = new ArrayList<>();
        ss.add( pathBase + "\\" + this.getLink());
        return ss;
    }

    @Override
    public int contarNoticias() {
        return 1;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<String> getpClave() {
        return pClave;
    }

    public void setpClave(ArrayList<String> pClave) {
        this.pClave = pClave;
    }

    
}
