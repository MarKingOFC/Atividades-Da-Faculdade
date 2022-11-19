import javax.swing.JOptionPane;

/*5- Faça um programa que receba o salário base de um funcionário, 
calcule e mostre o salário a receber, sabendo-se que o funcionário tem gratificação
 de 5% sobre o salário base e paga imposto de 7% também sobre o salário base.*/

public class Exercicio5 {
    public static void main(String[] args) {
        //variaveis
        double salarioBase,imposto,gratificacao, salarioReceber;

        //entrada de dados
        salarioBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salario base: "));

        //processamento
        gratificacao = salarioBase*0.05;
        imposto = salarioBase*0.07 ;
        salarioReceber = salarioBase + gratificacao - imposto;

        //saida de dados
        JOptionPane.showMessageDialog(null,String.format ("Seu salario a receber será de %.2f: ", salarioReceber));
    }
}