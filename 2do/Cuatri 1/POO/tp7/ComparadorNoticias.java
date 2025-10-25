package tp7;
public class ComparadorNoticias implements Comparator<Noticia>{
    

    public int comparar(Noticia n1, Noticia n2) {
        int cmp = n1.getTitulo().compareTo(n2.getTitulo());

        if (cmp == 0) {
            return n2.getTexto().length() - n1.getTexto().length();
        }
        return cmp;
    }
}
