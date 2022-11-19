import javax.swing.JOptionPane;

/*4- Faça um programa que receba o salário de um funcionário, calcule e mostre
 o novo salário, sabendo-se que este sofreu um aumento de 25%*/

public class Exercicio4 {
    public static void main(String[] args) {
        //variaveis
        double salario, novoSalario;

        //entrada de dados
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salário atual: "));

        //processamento
        novoSalario = (salario+(salario*0.25));

        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("O seu novo salário é de R$%.2f",novoSalario));
    }
}
