package stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio1 {
    
    /* Desafio 01:
        Mostre a lista na ordem numerica
        A lista precisa retornar = 1,2,3,4,5,6,7,8,9,10
    */
    public static void main(String[] args) {
        // Criação da lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // 
        numeros.stream().sorted().toList().forEach(System.out::println);
    }
}
