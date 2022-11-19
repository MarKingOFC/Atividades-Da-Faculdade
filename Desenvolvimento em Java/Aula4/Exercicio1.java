/*1- Faça um programa que leia dois números inteiros e, a seguir, calcule o produto entre
eles, atribuindo essa operação à variável produto. No final, deverá ser exibido a variável
produto com a mensagem correspondente.*/

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        //variaveis
        float n1, n2 ,produto ;

        //entrada de dados
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo número: "));

        //processamento

        produto = n1*n2;

        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("O resultado do produto dos números é: %.1f", produto));


    }
}
