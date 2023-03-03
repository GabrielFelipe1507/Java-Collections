package br.dio.collectionsjava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        
        //Outro exemplo de como utilizar chaves dentro de um ArrayList:
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jefher", 5, "cinza"));
            add(new Gato("Jefher", 10, "verde"));
            add(new Gato("Sebastiao", 9, "malhado"));
            add(new Gato("Jefher", 5, "preto"));
        }};

        System.out.println("Ordem de Inserção:\n");
        System.out.println(meusGatos);

        System.out.println("Ordem Aleatória:\n");
        //o "shuffle" serve para imprimir em ordem aleatória:
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Natural:\n");
        //Os elementos da minha lista "meusGatos" é organizado de acordo com o tipo comparable:
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem de Idade dos Gatos:\n");
    //  Utilizando o ComparatorIdade:  
    //  Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println("Comparação por Cor:\n");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
    //  Utilizando o comparatorCor:
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
    //  Comparando Todos - Nome/Cor/Idade:
        System.out.println("\nComparação por: Nome/Cor/Idade:\n");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato() {

    }

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    
}
// aqui nessa classe será comparado a idade:
class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }

}
// aqui nessa classe será comparado a cor:
class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }

}
// Ele está Ordenando aqui por Nome/Cor/Idade:
class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if(nome !=0) return nome;

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }

}
