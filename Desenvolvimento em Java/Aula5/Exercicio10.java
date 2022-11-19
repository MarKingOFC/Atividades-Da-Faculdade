import javax.swing.JOptionPane;

/*10- Escreva um método chamado converteDolar que recebe dois parâmetros reais, um é o
valor total em reais (R$) e o segundo a cotação do dólar. O método deve calcular e
retornar o valor em Dólar ($).
Faça um algoritmo principal que solicite ao usuário o valor que o mesmo deseja converter
e a cotação do dólar e usando o método definido acima, mostre o valor em dólar.*/

public class Exercicio10 {
    public static void main(String[] args) {
        //variaveis
        double real, cotacao, dolar;
        //entrada de dados
        real = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor em reais a ser convertido: "));
        cotacao = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a cotação do dólar: "));
        //processamento
        dolar = converteDolar(real, cotacao);
        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("O valor em dólares será de: %.2f", dolar));
    }

    public static double converteDolar(double real, double cotacao) {
        double converteDolar;
        converteDolar = real/cotacao;
        return converteDolar;
    }
}
