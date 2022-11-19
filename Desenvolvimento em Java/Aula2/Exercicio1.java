import javax.swing.JOptionPane;

/*1- Crie um programa que solicite ao usuário a sua idade expressa em anos,
meses e dias (variáveis separadas). Calcule e mostre a idade expressa apenas em dias.
 Para isso considere 1 ano = 365 dias e 1 mês = 30 dias.*/

public class Exercicio1 {
    public static void main(String[] args) {
        //variaveis
        int anos, meses , dias , diasVividos;

        //entrada de dados
        anos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os anos vividos: "));
        meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os meses vividos: "));
        dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os dias vividos:"));

        //processamento
        diasVividos = ((anos*365) + (meses*30)+ dias);

        //saida de dados
        JOptionPane.showMessageDialog(null,"Você viveu " + diasVividos + " Dias de Vida");
    }
}