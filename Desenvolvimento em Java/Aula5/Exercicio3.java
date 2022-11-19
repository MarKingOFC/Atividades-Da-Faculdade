import javax.swing.JOptionPane;

/*3- Construir um método que receba como parâmetros o valor de uma compra e a
quantidade de parcelas e calcula e retorna o valor da parcela, sabendo que a loja
acrescenta 5% de juros para as compras parceladas.
No algoritmo principal, solicite para o usuário o valor de uma compra e a quantidade de
parcelas e utilizando o método descrito acima, mostre o valor da parcela.*/

public class Exercicio3 {
    public static void main(String[] args) {
        //variaveis
        double valor, qtdParcelas, parcelas;
        //entrada de dados
        valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da compra: "));
        qtdParcelas = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de parcelas: "));
        //processamento
        parcelas = calculoParcelas(valor, qtdParcelas);
        //saida de dados
        JOptionPane.showMessageDialog(null,"Os valores das parcelas serão de: R$" + parcelas);
    }

    public static double calculoParcelas(double valor, double qtdParcelas) {
        double juros;
        juros = valor/qtdParcelas;
        juros = juros+(juros*0.05);
        return juros;
    }
}
