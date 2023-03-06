package br.dio.collectionsjava.list;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class MetodosMap {
     public static void main(String[] args) {
        //Utilizando o Map:
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){
            {
                //"put" é oq adiciona ao inves do "add" na utilização do Map:
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);

            }
        };
        //printando a lista:
        System.out.println(carrosPopulares.toString());
        
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        //aqui vai verificar se a palavra "tcson" q é o modelo do carro, estará no meu dicionario:
        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));
        //aqui ele irá pegar o consumo atribuido ao carro uno atraves do get():
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os Modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println();
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        //vai retornar o menor consumo dentre os carros ou o valor de consumo do carro mais economico:
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries= carrosPopulares.entrySet();
        String modeloMaisEficiente = " ";

        for (Map.Entry<String,Double> entry : entries) {

            if(entry.getValue().equals(consumoMaisEficiente))
                //aqui estou pegando qual o nome do carro mais eficiente:
                modeloMaisEficiente = entry.getKey();          
        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
        
        System.out.println("Mostre o modelo menos econômico e seu consumo: ");
        //aqui irá pegar o menor valor da lista de consumos:
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficente = "";
        // foreach para cheacar o carro menos eficiente(menos economico):        
        for (Map.Entry<String,Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                //aqui estou pegando qual o nome do carro menos eficiente:
                modeloMenosEficente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficente + " - " + consumoMenosEficiente);
            }
        }
        System.out.println("Mostre a Soma dos Consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        double soma  = 0d;
        while(iterator.hasNext()){
            // o next vai pegar sempre o proximo dentro da lista: 
            soma+=iterator.next();
        }
        System.out.println("Soma dos consumos: " + soma);

        // o size() pega a quantidade da lista:
        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));
        System.out.println("Remova os modelos com consumo igual há 15.6 km/l: ");
        System.out.println("\nAntes da Remoção:" + carrosPopulares.values());
        Iterator<Double> remocao = carrosPopulares.values().iterator();
        while(remocao.hasNext()){
            // o next vai pegar sempre o proximo dentro da lista:
            //aqui também irá remover os valores 15.6:
            if(remocao.next().equals(15.6)){
                remocao.remove();
            }           
        }
        System.out.println("\nDepois da Remoção: "+ carrosPopulares.values()+ "\n");

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        //utilizando o LinjedHashMap:
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            //"put" é oq adiciona ao inves do "add" na utilização do Map:
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);            
        }};
        System.out.println(carrosPopulares.toString() + "\n");

        System.out.println("Mostre o dicionário ordenado pelo modelo: ");
        //utilizando o TreeMap:
        //lembrando q vc pode utilizar a Lista anterior "carrosPopulares1" sem colocar todos
        // os valores denovo ex:"put(uno, 23.5), conforme abaixo:"
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apagando o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("Conferindo se o dicionário está vazio: ");
        carrosPopulares.isEmpty();
     }
    
}
