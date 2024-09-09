package desafio3;

// 3)  Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1;
// enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

public class Main {
    public static void main(String[] args) {
        int indice = 12, soma = 0, k = 1;

        while(k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println("O valor da variável SOMA é: "+ soma);
    }
}
