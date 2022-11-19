/*1- Faça um algoritmo que imprima os números pares entre 0 e 100.*/

public class Exercicio1 {
    public static void main(String[] args) {
        //variaveis
        int i;
        //processamento e saida de dados
        for(i=0; i<=100;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
