package stream_api.desafios;

import java.util.List;
import java.util.Arrays;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDivisiveis = numeros.stream()
                .distinct()
                .filter(n -> n % 3 ==0 && n % 5==0)
                .mapToInt(Integer::intValue).sum(); // o resultado foi zero pois nenhum valor que corresponda a condição de filter foi encontrado

        System.out.println("O resultado foi " + somaDivisiveis);
    }
}
