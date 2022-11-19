import javax.swing.JOptionPane;

/*2- Faça um algoritmo que leia um vetor de 10 posições de números inteiros e divida
todos os seus elementos pelo maior valor do vetor e armazene o resultado no mesmo
vetor. Mostre o vetor após os cálculos.*/

public class Exercicio2 {
    public static void main(String[] args) {
        //declaração do vetor
        int num[] = new int[10], i, maior=0;
        //entrada, proceesamento e saida de dados
        for(i=0; i<10; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro: "));
        }
        for(i=0; i<10; i++){
            if(num[i] > maior)
                maior = num[i];
        }
        for(i=0; i<10; i++){
            if (num[i] == maior){
                num[i] = 10/maior;
                JOptionPane.showMessageDialog(null,num[i]);
            }
        }

    }
}
