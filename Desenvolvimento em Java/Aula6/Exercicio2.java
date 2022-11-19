import javax.swing.JOptionPane;

/*2- Escreva um programa que solicite um número ao usuário. Caso seja digitado um valor
entre 0 e 9, mostre: “valor correto”, caso contrário mostre: “valor incorreto”.*/

public class Exercicio2 {
    public static void main(String[] args) {
        //variaveis
        int num;
        //entrada de dados
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: "));
        //processamento e saida de dados
        if (num <=9) {
            JOptionPane.showMessageDialog(null,"Valor Correto");
        }
        else{
            JOptionPane.showMessageDialog(null,"Valor Incorreto");
        }
    }
}
