import javax.swing.JOptionPane;

/*3- Escreva um programa para calcular o valor de uma prestação em atraso (prestacao).
 Para isso, obtenha o valor da prestação (valorPrestacao), a porcentagem de multa pelo
atraso (multa) e a quantidade de dias de atraso (qtdeDias). Calcular e mostrar o valor
da prestação atualizado, 
sabendo que: prestação = valorPrestacao+(valorPrestacao*(multa/100)*qtdeDias)*/

public class Exercicio3 {
    public static void main(String[] args) {
        //variaveis
        float prestacao, valorPrestacao, multa, qtdeDias;

        //entrada de dados
        valorPrestacao = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da prestação: "));
        multa = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a porcentagem da multa pelo atraso: "));
        qtdeDias = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a quantidade de dias de atraso: "));

        //processamento
        prestacao = valorPrestacao+(valorPrestacao*(multa/100)*qtdeDias);

        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("O Valor da prestação em atraso é de R$ %.2f",prestacao));
    }
}
