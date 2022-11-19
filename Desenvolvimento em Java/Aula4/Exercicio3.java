import javax.swing.JOptionPane;

/*3- Faça um programa que leia o nome de um vendedor, seu salário fixo e o total de
vendas efetuadas no mês (em reais). Sabendo que o vendedor recebe 5% de comissão
sobre as vendas efetuadas, o programa deve calcular e exibir o total a receber no final do
mês, com duas casas decimais.*/


public class Exercicio3 {
    public static void main(String[] args) {
        //variaveis
        double salario, totalVendas, totalSalario;
        String nomeVendedor;

        //entrada de dados
        nomeVendedor = JOptionPane.showInputDialog(null,"Digite o nome do vendedor:");
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salário do vendedor: "));
        totalVendas = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o total de vendas no mês: "));

        //processamento
        totalSalario = salario + (totalVendas*5/100);

        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("%s deve receber %.2f", nomeVendedor, totalSalario));
    }
}
