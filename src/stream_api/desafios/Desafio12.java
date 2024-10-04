import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    /* DESAFIO 12
     * Encontre o produto de todos os números da lista e exiba o resultado
    */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Double produto = numeros.stream()
            .distinct()
            .mapToDouble(Integer::doubleValue)
            .reduce(1.0, (a,b) -> a * b);
        System.out.println(produto);
    }
}
