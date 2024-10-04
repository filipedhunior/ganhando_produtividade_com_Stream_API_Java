import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio10 {
    /*DESAFIO 10
     * Agrupe os valores ímpares 
     * múliplos de 3 ou 5 e 
     * exiba o resultado no console
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosImpares = numeros.stream()
            .distinct()
            .filter(numero -> numero % 2 != 0)
            .filter(numero -> numero % 3 == 0 || numero % 5 ==0)
            .collect(Collectors.toList());
        
        System.out.println("Impares multiplos de 3 e 5: " + numerosImpares);
        }
}
