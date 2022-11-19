import javax.swing.JOptionPane;

/*5- Faça um algoritmo que a partir do preço à vista de um determinado produto e a
quantidade desejada de parcelas, calcule o preço total a pagar e o valor da prestação
mensal, referentes ao pagamento parcelado. Se o pagamento for parcelado em 2 ou 3
vezes (menor ou igual que 3 parcelas) deverá ser dado um acréscimo de 10% no total a
ser pago. Se for parcelado em 4 ou mais vezes, o acréscimo será de 20%.*/

public class Exercicio5 {
    public static void main(String[] args) {
        //variaveis
        double preco, qtdPrestacao, precoTotal, valorPrestacao;
        //entrada de dados
        preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço à vista do produto: "));
        qtdPrestacao = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade desejada de parcelas: "));
        //processamento
        precoTotal = prestacoes(preco, qtdPrestacao);
        valorPrestacao = precoTotal/qtdPrestacao; 
        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("Valor Total: %.2f",precoTotal));
        JOptionPane.showMessageDialog(null,String.format("Valor das prestações mensais: %.2f",valorPrestacao));
    }

    public static double prestacoes(double preco, double qtdPrestacao) {
        double prestacao;
        if (qtdPrestacao<=3) {
            prestacao = preco+(preco*0.10);
            return prestacao;
        }
        else {
            prestacao = preco+(preco*0.20);
            return prestacao;
        }
    }
}
