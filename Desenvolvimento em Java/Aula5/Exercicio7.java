import javax.swing.JOptionPane;

/*7- A loja de pregos Pregão comercializa dois tipos de pregos, o telheiro e o quadrado.
Cada telheiro custa R$ 1,05 e o quadrado custa R$ 0,51. Ao final do dia, o gerente quer
saber quanto arrecadou com a venda dos pregos do tipo telheiro e quadrado (juntos), e
quanto deve separar de comissão (10% do total arrecadado).
Faça um programa para obter as quantidades de pregos do tipo telheiro e quadrado que
foram vendidos, calcule e mostre o valor arrecadado com as vendas e o valor da
comissão.*/

public class Exercicio7 {
    public static void main(String[] args) {
        //variaveis
        double qtdT, qtdQ, valorVendas, valorComissao;
        //entrada de dados
        qtdT = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite as quantidades de pregos tipo telheiro vendidos: "));
        qtdQ = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite as quantidades de pregos tipo quadrado vendidos: "));
        //processamento
        valorVendas = valorVendas(qtdQ, qtdT);
        valorComissao = valorComissao(valorVendas);
        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("O valor das vendas será de: R$ %.2f ",valorVendas));
        JOptionPane.showMessageDialog(null,String.format("O valor da comissão será de: R$ %.2f",valorComissao));
    }

    public static double valorVendas(double qtdQ, double qtdT) {
        double total;
        total = (qtdT*1.05)+(qtdQ*0.51);
        return total;
    }

    public static double valorComissao(double valorVendas) {
        double comissao;
        comissao = valorVendas*0.10;
        return comissao;
    }
}
