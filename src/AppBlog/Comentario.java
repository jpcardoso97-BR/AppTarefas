package AppBlog;

public class Comentario{
    private Usuario nome;
    private String data;
    private String texto;

    public Comentario(Usuario nome, String data, String texto) {
        this.nome = nome;
        this.data = data;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "{" +
                "Usuário = " + '\'' + nome+ '\''+ ", "+
                "Texto = "+'\''+texto+'\''+" "+
                "Data = "+'\''+data+'\''+
                '}';
    }
}
