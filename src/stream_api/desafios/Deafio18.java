package stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Deafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> iguais = n -> n.equals(n);

        boolean saoIguais = numeros.stream().allMatch(n -> n.equals(numeros.get(0))); // a lista esta comparando se todos os elementos são iguais ao elemento do primeiro indice. pode ser melhorada avaliando todos os indices
        System.out.println("Os numeros são iguais? " + saoIguais);
    }
}
