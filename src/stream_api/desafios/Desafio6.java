package stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio6 {
    /*
     * Desafio 06: Verificar se a lista contém algum número maior que 10:
     * Utilize a Stream API para verificar se a lista contém algum número maior que 10 
     * e exiba o resultado no console.
    */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        Predicate<Integer> eMaiorQue10 = numero -> numero > 10;

        // Verifique se há um numero maior que 10: é para exibir o valor maior que 10?
        numeros.stream()
            .filter(eMaiorQue10)
            .forEach(System.out::println);
    }
}
