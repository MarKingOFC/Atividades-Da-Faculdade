import javax.swing.JOptionPane;

//2- Faça um programa que receba três notas, calcule e mostre a média aritmética.

public class Exercicio2 {
    public static void main(String[] args) {
        //variaveis
        float n1, n2, n3, media;

        //entrada de dados
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua primeira nota: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua segunda nota: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua terceira nota: "));

        //processamento de dados
        media = (n1 + n2 + n3)/3;
        
        //saida de dados
        JOptionPane.showMessageDialog(null,String.format ("A média é %.2f" , media));
    }
}
