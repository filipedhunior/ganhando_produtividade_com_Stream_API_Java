

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
* Desafio 3 - Verifique se todos os números da lista são positivos:
* Com a ajuda da Stream API, 
* passo 1: verifique se todos os números da lista são positivos 
* passo 2: e exiba o resultado no console. 
*/

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // passo 01: comparar com zero
        // Definição de numero positivo: Qualquer número que, 
        // ao ser comparado com zero, for maior que zero é positivo.
        Predicate<Integer> ePositivo = numero -> numero > 0;

        // passo 02: exibir o resultado no console
        numeros.stream().filter(ePositivo).distinct().forEach(System.out::println);
    }
}
