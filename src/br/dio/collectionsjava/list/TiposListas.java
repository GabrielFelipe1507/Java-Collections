package br.dio.collectionsjava.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TiposListas {
    public static void main(String[] args) {
        //System.out.println("Tipos de Listas:");

        //sintaxe de um ArrayList Generico
        //ArrayList<Double> notas = new ArrayList<>();
        //sintaxe de um ArrayList com elementos:
        /*List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.8, 2.2, 4.5, 7.4));
        notas.add(10d);
        System.out.println(notas);
        */
        //Outra forma de List:
        //Esta forma de List é válida porem é limitada pois,
        // vc nao poderá retirar mais elementos dela e nem colocar:
        //List<Double> notas = Arrays.asList(7d, 8.5, 9.8, 2.2, 4.5, 7.4);
        //Se eu tentar descomentar o "notas.add(20d);" já ocorrerá um erro pois,
        //estaria tentando adicionar mais um elemento dentro dela:
        //notas.add(20d);
        //System.out.println(notas);

        System.out.println("Exercicio 1: Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(7.5);
        notas.add(8.0);
        notas.add(8.5);
        notas.add(9.0);
        notas.add(9.5);
        notas.add(10.0);
        System.out.println(notas.toString());
        System.out.println();
        System.out.println("Exercicio 2: Exiba a posição da nota 7: ");
        System.out.println("Posição da Nota 7 na Lista: " + notas.indexOf(7d));
        System.out.println();
        System.out.println("Exercicio 3: Adicione na lista a nota 8.0 na posição 4 da Lista: ");
        notas.add(4,8.0);
        System.out.println(notas);
        System.out.println();
        System.out.println("Exercicio 4: Substitua a nota 10.0 pela nota 6.0 na Lista: ");
        notas.set(notas.indexOf(10d), 6.0);
        System.out.println(notas);
        System.out.println();
        System.out.println("Exercicio 5: Confira se a nota 7 está na lista: " + notas.contains(7d));
        System.out.println();
        System.out.println("Exercicio 6: Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota: notas){
            System.out.println(nota);
        }
        System.out.println("Exercicio 7: Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exercicio 8: Exiba a menor nota e maior nota: ");
        int i = 0;
        double menornota=0;
        double maiornota=0;

        for ( Double nota: notas) {
            if(i==0){
                menornota=nota;
            }else{
                if(nota<=menornota){
                    menornota= nota;
                }else{
                    maiornota=nota;
                }
            }
             i=i+1;
        }
        System.out.println("Menor Nota: " + menornota);
        System.out.println("Maior Nota: " + maiornota);
        //ou posso resolver este problema desta maneira:
        System.out.println("Exercicio 8: Exiba a menor nota:\n" + Collections.min(notas));
        System.out.println("Exercicio 8: Exiba a maior nota:\n" + Collections.max(notas));
        System.out.println();
        System.out.println("Exercicio 9: Mostre a Soma dos Valores: ");
        // através do método iterator consigo integrar todas as minhas notas da minha lista
        // e acabar somando elas, posso utilizar também o while nessa ajuda:
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        // este while irá somar até que não haja mais valores a serem somados:
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma = soma + next;
        }
        System.out.println("Soma Exibida: " + soma);
        System.out.println();
        // o size vai retornar um inteiro que nada mais é que a quantidade de elementos
        // que eu tenho na minha lista notas no caso:
        System.out.println("Exercicio 10: Média das Notas: " + (soma/notas.size()));
        System.out.println();
        System.out.println("Exercicio 11: Remova a Nota 0: ");
        //aqui será removido o valor da posição requerida(dentro do parenteses do remove()):
        notas.remove(0);
        System.out.println(notas);
        System.out.println("Exercicio 12: Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        // este while irá somar até que não haja mais valores a serem somados:
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        //código para apagar toda a lista:
        /*
            System.out.println("Apague toda a lista");
            notas.clear();
            System.out.println(notas);
         */
        System.out.println("Conferindo se a Lista Está Vazia: " + notas.isEmpty());

    }
}