import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    /* DESAFIO 11 
     * Emcontre a soma dos quadrados de todos os números da lista e exiba no console
    */
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

            int[] soma = {0};

            numeros.stream().distinct().forEach(numero -> {
                int quadrado = numero * numero;
                soma[0] += quadrado;
                System.out.println("Quadrado de " + numero + " é " + quadrado);
            });

            System.out.println("Soma dos quadrados: " + soma[0]);
    }
}
