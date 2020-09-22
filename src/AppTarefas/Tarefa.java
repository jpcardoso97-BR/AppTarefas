package AppTarefas;

import LojaLivro.Livro;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    private String descricao;
    private String dataConclusao;

    private List<Tarefa> listaDeTarefas = new ArrayList();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Tarefa() {}

    public void setListaDeTarefas(List<Tarefa> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    public Tarefa(String descricao, String dataConclusao, List listaDeTarefas) {
        this.descricao = descricao;
        this.dataConclusao = dataConclusao;
        this.listaDeTarefas = listaDeTarefas;
    }

    public Tarefa(String descricao, String dataConclusao) {
        this.descricao = descricao;
        this.dataConclusao = dataConclusao;
    }

    public Tarefa(List<Tarefa> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    public void adicionarTarefa(Tarefa descricao){
        listaDeTarefas.add(descricao);
    }

    public void imprimirDados(){
        System.out.println("===================(Lista de Tarefas)======================");
        System.out.println(listaDeTarefas);
    }

    @Override
    public String toString() {
        return "{" +
                "Descrição = " + '\'' + descricao+ '\''+ ", "+
                "Data de Conclusão = "+'\''+dataConclusao+ '\''+
                '}';
    }
}
