package desafio2;

//2) Escreva um programa que verifique, em uma string, a existência da letra 'a',
// seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letra = 'a';

        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();

        Long quantidade = palavra.toLowerCase()
                .chars()
                .filter(l -> l == Character.toLowerCase(letra))
                .count();

        System.out.println("\nA quantidade de letras ['a'] na palavra " + palavra + " é de: " + quantidade);

        sc.close();
    }
}
