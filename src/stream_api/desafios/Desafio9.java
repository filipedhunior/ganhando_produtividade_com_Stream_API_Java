
import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    /* DESAFIO 09
    Verificar quais numeros são distintos
    */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosDistintos = numeros.stream().distinct().count() == numeros.size();

        System.err.println("Todos os numeros são distintos? " + numerosDistintos);
    }
}
