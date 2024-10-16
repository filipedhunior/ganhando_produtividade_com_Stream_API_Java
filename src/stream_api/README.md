# Stream API Java - Principais Métodos

Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!<br>
Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar suas habilidades e criatividade.

Para todos os desafios, utilizem a lista de números inteiros fornecida:

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
```

- Desafio 1 - Mostre a lista na ordem numérica:

Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.

- Desafio 2 - Imprima a soma dos números pares da lista:

Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

- Desafio 3 - Verifique se todos os números da lista são positivos:

Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

- Desafio 4 - Remova todos os valores ímpares:

Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

- Desafio 5 - Calcule a média dos números maiores que 5:

Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

- Desafio 6 - Verificar se a lista contém algum número maior que 10:

Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

- Desafio 7 - Encontrar o segundo número maior da lista:

Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

- Desafio 8 - Somar os dígitos de todos os números da lista:

Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

- Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):

Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

- Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:

Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

- Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:

Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

- Desafio 12 - Encontre o produto de todos os números da lista:

Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

- Desafio 13 - Filtrar os números que estão dentro de um intervalo:

Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

- Desafio 14 - Encontre o maior número primo da lista:

Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

- Desafio 15 - Verifique se a lista contém pelo menos um número negativo:

Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

- Desafio 16 - Agrupe os números em pares e ímpares:

Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
```java
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
```
- Desafio 17 - Filtrar os números primos da lista:

Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
````java
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
````
- Desafio 18 - Verifique se todos os números da lista são iguais:
````java
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
````
Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

- Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:

Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.

````java
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
````
### Instruções:
- Cada desafio deverá ser implementado em classes separadas neste mesmo pacote.
- Os desafios podem ser executados individualmente a partir dos métodos main de cada classe.
- Utilize a Stream API para implementar as operações solicitadas em cada desafio.

Divirta-se resolvendo os desafios da Stream API do Java!<br>
Dúvidas: https://github.com/cami-la/ganhando_produtividade_com_Stream_API_Java/issues

---

### Referências

[1] "Principais métodos do Stream API - camila". Disponível em: https://github.com/cami-la/ganhando_produtividade_com_Stream_API_Java/blob/master/README.md

[2] "Java Collections API Examples - cami-la." GitHub. Disponível em: https://github.com/cami-la/curso-dio-intro-collections.
