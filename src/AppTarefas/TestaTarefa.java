package AppTarefas;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TestaTarefa {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Aprender o básico de JavaScript", "01/10/2020");
        Tarefa tarefa2 = new Tarefa("Aprender NodeJS", "15/10/2020");
        Tarefa tarefa3 = new Tarefa("Aprender ReactJS", "01/11/2020");
        Tarefa tarefa4 = new Tarefa("Aprender HTML5", "15/11/2020");
        Tarefa tarefa5 = new Tarefa("Aprender CSS", "01/12/2020");

        List<Tarefa> lista = new ArrayList<>();

        lista.add(tarefa1);
        lista.add(tarefa2);
        lista.add(tarefa3);
        lista.add(tarefa4);
        lista.add(tarefa5);

        System.out.println("============(Lista de Tarefas)===============");
        for (Object listaDeTarefas:lista
             )
            System.out.println(listaDeTarefas);{
        }

        //Modificando um valor do objeto.
        System.out.println(lista.get(1));
        tarefa2.setDataConclusao("20/10/2020");
        System.out.println(lista.get(1));

        lista.remove(0);
        System.out.println("============(Lista de Tarefas)===============");
        for (Object listaDeTarefas:lista
             )
            System.out.println(listaDeTarefas);
    }
}
