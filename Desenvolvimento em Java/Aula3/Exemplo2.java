import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args){
        //variaveis
        double salarioBase,imposto, salarioReceber;

        //entrada de dados
        salarioBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salario base: "));
        imposto = salarioBase*0.10 ;

        //processamento
        salarioReceber = salarioBase + 50 - imposto;

        //saida de dados
        JOptionPane.showMessageDialog(null,String.format ("Seu salario a receber será de %.2f: ", salarioReceber));

    }
}
