package stream_api.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    public static boolean ehPrimo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n não é primo
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> primos = numeros.stream().distinct().filter(n -> ehPrimo(n)).toList();
        System.out.println(primos);
    }
}



