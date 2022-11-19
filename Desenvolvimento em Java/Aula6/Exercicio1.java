import javax.swing.JOptionPane;

/*1- Faça um programa em Java que obtenha o valor de uma compra, calcular e mostrar o
valor da compra considerando o desconto, conforme descrito abaixo:
▪ para compras acima de R$ 200 a loja dá um desconto de 20%
▪ para as abaixo disso não tem desconto.*/


public class Exercicio1 {
    public static void main(String[] args) {
        //variaveis
        double valor;
        //entrada de dados
        valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da compra: "));
        //processamento e saida de dados
        if (valor>200) {
            valor = valor-(valor*0.20);
            JOptionPane.showMessageDialog(null,String.format("O valor da compra com desconto é de: R$ %.2f",valor));
        }
        else {
            JOptionPane.showMessageDialog(null,"Sua compra não possui desconto!");
        }
    }
}
