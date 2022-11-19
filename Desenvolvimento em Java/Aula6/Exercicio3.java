import javax.swing.JOptionPane;

/*3- Crie um programa que solicite ao usuário o seu turno de trabalho e a quantidade de
horas trabalhadas, calcule e mostre o valor do salário. Considere os valores de horas a
seguir, de acordo com o turno de trabalho. Caso o turno seja igual a ‘N’ (utilize um
caractere para representar) o valor da hora trabalhada é R$ 45,00, caso contrário é R$
37,50*/

public class Exercicio3 {
    public static void main(String[] args) {
        //variaveis
        double salario;
        int qtdehoras;
        char turno;
        //entrada
        qtdehoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de horas trabalhadas: "));
        turno = JOptionPane.showInputDialog(null, "Informe o turno de trabalho:\n[N]oturno\n[D]iurno").charAt(0);
        //processamento
        if ( turno == 'N' || turno == 'n' ){
            salario = qtdehoras * 45.00;
        }
        else{
            salario = qtdehoras * 37.5;
        }
        //saida
        JOptionPane.showMessageDialog(null, ("O valor do salário é " + salario));
    }
}
