package AppBlog;

import java.util.List;

public class Comentario extends Postagem{
    private Usuario nome;
    private String data;
    private String texto;

    public Comentario(Usuario nome, String titulo, String texto, String data, List listaDeComentarios, Usuario nome1, String data1, String texto1) {
        super(nome, titulo, texto, data, listaDeComentarios);

    }

    public Comentario(Usuario nome, String data, String texto) {
        super(nome, data, texto);
        this.nome = nome;
        this.data = data;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "{" +
                "Usuário = " + "(" + this.nome+")"+ " "+
                "("+"Texto = "+this.texto+")"+" "+
                "("+"Data = "+this.data+")"+
                '}';
    }
}
