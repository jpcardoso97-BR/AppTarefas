package AppBlog;

import java.util.ArrayList;
import java.util.List;

public class TestaBlog {
    public static void main(String[] args) {
        List<Comentario> listaDeComentarios = new ArrayList<>();
        Usuario usuario = new Usuario("Jão", 23);
        Usuario usuario1 = new Usuario("Jooj", 22);
        Usuario usuario2 = new Usuario("Jooje", 21);
        Usuario usuario3 = new Usuario("Jorje", 20);
        Usuario usuario4 = new Usuario("Joojin", 10);
        Usuario usuario5 = new Usuario("Joojinilson", 55);

        Postagem postagem = new Postagem(usuario,"Top 10 Animes battles", "(texto)", "22/09/2020", listaDeComentarios);

        Comentario comentario = new Comentario(usuario1, "22/09/2020", "daora as lutas");
        Comentario comentario2 = new Comentario(usuario2, "22/09/2020", "já tinha visto");
        Comentario comentario3 = new Comentario(usuario3, "22/09/2020", "épico demais");
        Comentario comentario4 = new Comentario(usuario4, "22/09/2020", "mim ajudem achegar nós 10 incritos - youtube.com/jojinbr");
        Comentario comentario5 = new Comentario(usuario5, "04/12/2020", "Não entendi a língua que eles estão falando.");

        listaDeComentarios.add(comentario);
        listaDeComentarios.add(comentario2);
        listaDeComentarios.add(comentario3);
        listaDeComentarios.add(comentario4);
        listaDeComentarios.add(comentario5);

        System.out.println("===========(Postagem)============");
        System.out.println(postagem);
        System.out.println("===========(Comentários)=====================");
        for (Object lista:listaDeComentarios
             ) {
            System.out.println(lista);
        }
    }
}
