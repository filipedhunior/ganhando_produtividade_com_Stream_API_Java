

import java.util.Arrays;
import java.util.List;
// import java.util.function.BinaryOperator;
// import java.util.function.Function;
// import java.util.function.Predicate;
// import java.util.stream.Collectors;

public class Desafio5 {
    /*
     * Desafio 05:
     * Calcule a média dos números maiores que 5 e exiba no console.
     * 
     * CONCEITO DE MEDIA: A soma dos valores de um conjunto divido pela quantidade de valores do conjunto
    */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Função para determinar se o valor é maior que cinco
        //Predicate<Integer> éMaiorQueCinco = numero -> numero > 5;

        // Função para calcular os valores que são maiores que cinco
        //BinaryOperator<Integer> calcularMaioresQue5 = Integer::sum;

        // Função para dividir valor pela quantidade de argumentos passados
        // int dividirArgumento = numero -> numero/numeros.lenght;

        // Stream
        double media = numeros.stream()
            .filter(numero -> numero > 5) // Filtra os números maiores que 5
            .mapToInt(Integer::intValue) // Converte para int para facilitar a soma
            .distinct()
            .average() // Calcula a média
            .orElse(0.0); // Se não houver números, retorna 0.0

        // Exibindo a média no console
        System.out.println("A média dos números maiores que 5 é: " + media);
    }
}
