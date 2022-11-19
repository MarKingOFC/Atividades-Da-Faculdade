import javax.swing.JOptionPane;

/*4- Faça um programa em Java que obtenha o valor de uma compra, calcule e mostre o
valor da compra considerando o desconto, conforme descrito abaixo:
▪ para compras acima de R$ 200 a loja dá um desconto de 20%
▪ para compras abaixo disso não há desconto.
OBS: neste problema, faça o tratamento de exceção para o valor da compra digitado.*/

public class Exercicio4 {
    public static void main(String[] args) {
        //variaveis
        double vCompra;
        //entrada de dados, processamento e saida
        try{
            vCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra: "));
            if(vCompra > 200) {
                vCompra = vCompra - vCompra * 0.2;
                JOptionPane.showMessageDialog(null, String.format("O valor da compra com 20% de desconto é %.2f R$", vCompra));
            } else {
                JOptionPane.showMessageDialog(null, "Você não receberá o desconto de 20% pois a sua compra não foi superior a 200 R$, ");   
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
    }
}
