package AppTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InseriDados {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Aprender o básico de JavaScript", "01/10/2020");
        Tarefa tarefa2 = new Tarefa("Aprender NodeJS", "15/10/2020");
        Tarefa tarefa3 = new Tarefa("Aprender ReactJS", "01/11/2020");
        Tarefa tarefa4 = new Tarefa("Aprender HTML5", "15/11/2020");
        Tarefa tarefa5 = new Tarefa("Aprender CSS", "01/12/2020");

        Scanner leitor = new Scanner(System.in);
        List<Tarefa> lista = new ArrayList<>();
        lista.add(tarefa1);

        while (true) {
            System.out.println("Digite 1 para ver as tarefas");
            System.out.println("Digite 2 para adicionar uma tarefa");
            System.out.println("Digite 3 para remover uma tarefa");
            System.out.println("Digite 4 para alterar uma tarefa");
            System.out.println("Digite 0 para fechar o app");
            String escolha = leitor.next();

            if (escolha.equals("1")) {
                System.out.println("============(Lista de Tarefas)===============");
                for (Object listaDeTarefas : lista
                )
                    System.out.println(listaDeTarefas);
                System.out.println("===============================================");

            }if (escolha.equals("2")) {
                System.out.println("Insira a descrição.");
                String descricao = leitor.next();

                System.out.println("Insira a data. ex:(00/00/0000");
                String data = leitor.next();

                lista.add(new Tarefa(descricao, data));

            }if (escolha.equals("3")){
                System.out.println("============(Lista de Tarefas)===============");
                for (Object listaDeTarefas : lista
                )
                    System.out.println(listaDeTarefas);

                System.out.println("Digite a posição que irá ser deletada");
                int deletar = leitor.nextInt();
                lista.remove(deletar);

            }if (escolha.equals("4")){
                System.out.println("Digite a posição da tarefa a ser alterada");
                int posicaoLista = leitor.nextInt();

                System.out.println("Digite 1 para DESCRIÇÃO ou 2 para DATA");
                String altera = leitor.next();

                if(altera.equals("1")) {
                    System.out.println("Insira a descrição");
                    String descricao = leitor.next();
                    lista.get(posicaoLista).setDescricao(descricao);

                }if(altera.equals("2")){
                    System.out.println("Insira a data. ex:(00/00/0000");
                    String data = leitor.next();
                    lista.get(posicaoLista).setDataConclusao(data);
                }
            }if(escolha.equals("0")){
                System.out.println("============(Lista de Tarefas)===============");
                for (Object listaDeTarefas : lista
                )
                    System.out.println(listaDeTarefas);
                break;

            }else{
                System.out.println("Por favor, insira um número que esteja nas opções");
            }
        }
    }
}
