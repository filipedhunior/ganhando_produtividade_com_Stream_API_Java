package stream_api.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    /*DESAFIO 16
    * Agrupe os numeros em duas listas contendo pares e impares
    */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> pares = numeros.stream().distinct().filter(numero -> numero % 2 ==0).toList();
        List<Integer> impares = numeros.stream().distinct().filter(numero -> numero % 2 ==1).toList();

        System.out.println("Os numeros da lista " + numeros + " podem ser agrupados em: ");
        System.out.println("impares " + impares + " e pares " + pares);
    }
}
