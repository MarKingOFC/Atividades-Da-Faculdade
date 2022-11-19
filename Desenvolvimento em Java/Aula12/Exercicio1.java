import java.util.Scanner;

/*- Faça um programa em Java que solicite ao usuário 10 números inteiros, calcule e mostre a quantidade
de números digitados que são pares e maiores do que 10. É obrigatório o uso de estrutura condicional e estrutura de
repetição, não é permitida a utilização de vetor.
Obs.: Utilizar a entrada e saída de dados pelo terminal (Scanner e System.out). */

//Marco Aurelio Santos RGM:25762141

public class Exercicio1 {
    public static void main(String[] args) {
        int n, qtd = 1, i = 0;

        while (qtd <= 10) {
            Scanner numero = new Scanner(System.in);
            System.out.println("Digite um número inteiro positivo: ");
            n = numero.nextInt();
            if (n % 2 == 0 && n > 10) {
                i++;
            }
            qtd++;
        }

        System.out.println("Quantidade de números pares e maiores que 10: " + i);
    }
}
