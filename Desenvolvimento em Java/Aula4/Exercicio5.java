import javax.swing.JOptionPane;

/*5- Faça um programa que leia três números inteiros e apresente o maior deles, sem
utilizar nenhuma estrutura condicional (if) ou função (max). A fórmula a seguir apresenta
o cálculo para verificar o maior entre dois números:*/

public class Exercicio5 {
    public static void main(String[] args) {
        //variaveis
        float num1, num2, num3, maior;

        //entrada de dados
        num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número:"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número:"));
        num3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o terceiro número:"));

        //processamento
        maior = (num1 + num2)/2 + Math.abs((num1 - num2)/2);
        maior = (maior + num3)/2 + Math.abs((maior - num3)/2);

        //saida de dados 
        JOptionPane.showMessageDialog(null,String.format("O maior número inteiro é %.0f",maior));
    }
}
