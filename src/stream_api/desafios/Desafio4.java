

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio4 {
    /* 
     * Desafio 04:
     * Utilize a Stream API para remover os valores ímpares da lista 
     * e imprima a lista resultante no console.
    */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Remover valores impares
        Predicate<Integer> removeImpares = numero -> numero %2==0;

        // Declarar outra lista, criar uma stream que filtra os valores pares e salvar como uma nova lista o resultado
        List<Integer> numerosPares = numeros.stream()
            .filter(removeImpares) // usa a expressão lambda removeImpares para filtar os valores pares
            .distinct() // remove os valores repetidos
            .collect(Collectors.toList()); // usar a interface Collectors para salvar numa nova lista

        numerosPares.forEach(System.out::println);
    }
}
