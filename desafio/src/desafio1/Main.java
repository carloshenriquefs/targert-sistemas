package desafio1;

// 1) Dado a sequencia de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma
// dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa
// na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e
// retorne uma mensagem avisando se o número informado pertence ou não a sequência.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] fibonacci = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int soma = 0;
        int proximoElemento = 0;
        int segundoElemento = 0;

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 0; i < fibonacci.length; i++) {
            if (numero == 0) {
                return;
            }
            if (fibonacci[i] == numero) {
                soma = fibonacci[i - 1] + fibonacci[i];
                proximoElemento = soma + fibonacci[i];
                segundoElemento = proximoElemento + fibonacci[i + 1];
            }
        }

        if (soma == 0) {
            System.out.println("O número informado não pertence a sequência de Fibonacci");
        } else {
            System.out.println("O número digitado: ['" + numero + "'] pertence a sequência de Fibonnaci");
            System.out.println(soma + ", " + proximoElemento + ", " + segundoElemento);
        }

        sc.close();
    }
}
