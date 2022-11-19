import javax.swing.JOptionPane;

/*6- Escreva um programa que obtenha o valor de um produto e, utilizando um método,
aplique nesse valor um desconto de 9% e mostre o novo valor.*/


public class Exercicio6 {
    public static void main(String[] args) {
        //variaveis
        double valor, novoValor;
        //entrada de dados
        valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do produto: "));
        //processamento
        novoValor = nValor(valor);
        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("O novo valor com desconto será de : R$ %.2f", novoValor));
    }

    public static double nValor(double valor) {
        double nvalor;
        nvalor = valor - (valor*0.09);
        return nvalor;
    }
}
