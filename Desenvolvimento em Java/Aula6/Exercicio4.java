import javax.swing.JOptionPane;

/*4- Escreva um programa que solicite ao usuário os valores de três contas de consumo
(p.ex. água, luz e telefone) e o valor de seu salário. Verifique se o salário é suficiente para
pagar as três contas, caso não seja apresente a mensagem “Salário insuficiente!”. Caso
seja, apresente o valor que restou do salário após pagar as contas.*/


public class Exercicio4 {
    public static void main(String[] args) {
        //variaveis
        double agua, luz, telefone, salario, soma, salarioRestante;
        //entrada de dados
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o seu salário: "));
        agua = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da conta de água: "));
        luz = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da conta de luz: "));
        telefone = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da conta de telefone: "));
        //processamento e saida de dados
        soma = agua+luz+telefone;
        if (salario>soma){
            salarioRestante = salario - soma;
            JOptionPane.showMessageDialog(null,String.format("O valor que restou do salário após pagar as contas é de : R$ %.2f", salarioRestante));
        }
        else {
            JOptionPane.showMessageDialog(null,"Salário insuficiente!");
        }
    }
}
