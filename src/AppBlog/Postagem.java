package AppBlog;

import java.util.ArrayList;
import java.util.List;

public class Postagem {
    private Usuario nome;
    private String titulo;
    private String texto;
    private String data;

    List<Comentario> listaDeComentarios = new ArrayList<>();

    public Postagem(Usuario nome, String titulo, String texto, String data, List listaDeComentarios) {
        this.nome = nome;
        this.titulo = titulo;
        this.texto = texto;
        this.data = data;
        this.listaDeComentarios = listaDeComentarios;
    }

    public Postagem(Usuario usuario, String data, String texto) {
    }

    public void addComentario(Comentario comentario){
        listaDeComentarios.add(comentario);
    }

    @Override
    public String toString() {
        return "Autor = "+nome+"[" +
                "Titulo = "+titulo+']'+
                "["+"Texto = "+texto+']'+
                "["+"Data = "+'\''+data+']'+
                ']';
    }
}
