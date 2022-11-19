/*2- Faça um algoritmo que imprima os números de 1 a 50 de 1 em 1 e de 52 a 100 de 2
em 2.*/


public class Exercicio2 {
    public static void main(String[] args) {
        //variaveis
        int i;
        //processamento e saida de dados
        for(i=0; i<=50;i++){
            System.out.println(i);
        }
        for(i=52; i<=100;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
