package AppBlog;

public class Usuario{
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return
                "Nome = " + '\'' + nome+ '\''+ ", "+
                "Idade = "+'\''+idade+ '\'';
    }
}
