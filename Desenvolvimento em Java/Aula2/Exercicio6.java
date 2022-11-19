import javax.swing.JOptionPane;

/*6- Faça um programa que calcule e mostre a área de um triângulo a partir da
 leitura da base e altura (em cm). Sabe-se que: á rea = (base * altura)/2.*/

public class Exercicio6 {
    public static void main(String[] args) {
        //variaveis
        float base, altura, area;

        //entrada de dados
        base = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base do triângulo em cm: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do triângulo em cm: "));

        //processamento
        area = (base*altura)/2 ;

        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("A Área do triângulo é de %.1f cm",area));
    }
}
