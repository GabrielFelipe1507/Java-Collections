package br.dio.collectionsjava.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        
        System.out.println("Imprima todos os elementos dessa lista de String: ");

        //aqui consigo fazer um "foreach" junto com stream:
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        });

        System.out.println("Pegue 6 Numeros e coloque dentro de um Set:");
        //aqui estou pegando os 6 primeiros numeors da minha lista:
        numerosAleatorios.stream().limit(6).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");
       /* 
       numerosAleatorios.stream().map(new Function<String,Integer>(){
            @Override
            public Integer apply(String s){
                //aqui estou transformando cada elemento da lista pra um Integer:
                return Integer.parseInt(s);
            }            
        });
        */
        //Utilizando o stream: nos retorna o Stream<String>
        numerosAleatorios.stream()
        //Utilizando o parsetInt: nos retorna um Integer pq ele transforma a String em Integer:
        .map(Integer::parseInt)
        //Utilizando o collect: aqui o collect vai pegar o stream junto com o parsetInt e 
        //colocar dentro da List<Integer> ou lista de inteiros: 
        .collect(Collectors.toList())
        //aqui irá mostrar todos os valores alterados através do "foreach()":
        .forEach(System.out::println);


    }
}
