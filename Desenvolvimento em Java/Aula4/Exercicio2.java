/*2- Faça um programa que leia quatro números inteiros e, a seguir, calcule e mostre a
diferença do produto de A e B pelo produto de C e D, segundo a fórmula:
DIFERENÇA = (A*B – C*D)*/

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        //variaveis
        int a, b, c, d, diferenca;

        //entrada de dados
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número: "));
        c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o terceiro número: "));
        d = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o quarto número: "));

        //processamento
        diferenca = (a*b - c*d);

        //saida de dados
        JOptionPane.showMessageDialog(null, "Diferença = "+diferenca);
    }
}
