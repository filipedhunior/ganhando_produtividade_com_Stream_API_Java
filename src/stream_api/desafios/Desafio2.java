package stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Desafio2 {
    /* Desafio 2: Imprimir a soma dos números pares:
     * Utilizando a Stream API, 
     * realize a soma dos números pares da lista e 
     * exiba o resultado no console.
    */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Criar função para verificar valores pares
        Predicate<Integer> imprimirNumeroPar = numero -> numero % 2 == 0;
            
        // Criar função para somar valores
        BinaryOperator <Integer> someValores = (a, b) -> a + b;
        
        // Criar o stream
        int somaPares = numeros.stream()
            .filter(imprimirNumeroPar)
            .reduce(0, someValores);

        System.out.println(somaPares);
        }
}
