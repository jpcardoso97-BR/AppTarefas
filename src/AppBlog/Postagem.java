package AppBlog;

public class Postagem {
    private Usuario nome;
    private String titulo;
    private String texto;
    private String data;

    public Postagem(Usuario nome, String titulo, String texto, String data) {
        this.nome = nome;
        this.titulo = titulo;
        this.texto = texto;
        this.data = data;
    }
    @Override
    public String toString() {
        return "[" +
                "Usuário = " + '\'' + nome+ '\''+ ", "+
                "Titulo = "+'\''+titulo+ '\''+", "+
                "Texto = "+'\''+texto+ '\''+", "+
                "Data = "+'\''+data+ '\''+
                ']';
    }
}
