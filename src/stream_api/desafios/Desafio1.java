package stream_api.desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Desafio1 {
    
    /* Desafio 01:
        Mostre a lista na ordem numerica
        A lista precisa retornar = 1,2,3,4,5,6,7,8,9,10
    */
    public static void main(String[] args) {
        // Criação da lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Criar uma lista para armazenar os valores unicos da lista original
        HashSet<Integer> numerosUnicos = new HashSet<>();
 
        // Criação do stream para ordenar e imprmir os valores
       numeros.stream().sorted()
                .filter(numero -> numerosUnicos.add(numero)) // filtra os valores unicos
                .toList() // transforma em lista
                .forEach(System.out::println); //imprime a medida que parsear pelos valores
    }
}
