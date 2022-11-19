import javax.swing.JOptionPane;

/*2- Escreva um programa em Java que solicite ao usuário o salário atual e
 mostre o salário acrescido de 5% de comissão.*/

public class Exercicio2 {
    public static void main(String[] args) {
        //variaveis
        double salario, novoSalario;

        //entrada de dados
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salário atual: "));

        //processamento
        novoSalario = (salario+(salario*0.05));

        //saida de dados
        JOptionPane.showMessageDialog(null,"Seu salário acrescido de comissão é de : "+novoSalario);

        
        /*esse codigo não funcionou
        JOptionPane.showMessageDialog(null,String.format("O seu salário com 5% de comissão é de: %.2f ",novoSalario));*/
    }
}
