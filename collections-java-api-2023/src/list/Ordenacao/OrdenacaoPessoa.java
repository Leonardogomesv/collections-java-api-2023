package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Nome1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Nome2", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome3", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("Nome4", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoas.pessoaList);

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}