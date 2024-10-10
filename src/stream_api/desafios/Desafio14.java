import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class Desafio14 {
    /* DESAFIO 14 
    * Encontre o maior numero primo da lista e exiba no console
    */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> ehPrimo = numero -> {
            if (numero <= 1) {
                return false; // Números menores ou iguais a 1 não são primos
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) { // Checar até a raiz quadrada do número
                if (numero % i == 0) {
                    return false; // Se divisível por qualquer número, não é primo
                }
            }
            return true; // Se passar todas as verificações, é primo
        };

        // Encontra o maior número primo
        OptionalInt maiorPrimo = numeros.stream()
            .filter(ehPrimo) // Filtra os números primos
            .mapToInt(Integer::intValue) // Converte os números para int
            .max(); // Encontra o máximo

        // Exibe o resultado
        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo é: " + maiorPrimo.getAsInt());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }
}

