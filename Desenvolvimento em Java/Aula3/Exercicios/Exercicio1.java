import javax.swing.JOptionPane;

/*1- Desenvolva um programa em Java que solicite ao usuário os valores dos lados de um retângulo e
 calcule e mostre seu perímetro e sua área.*/

public class Exercicio1 {
    public static void main(String[] args) {
        //variaveis
        float base, altura , perimetro, area;

        //entrada de dados
        base = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a base do retângulo: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a altura do retângulo: "));

        //procesasmento
        perimetro = 2*(base+altura);
        area = base*altura;

        //saida de dados
        JOptionPane.showMessageDialog(null,"A área do retângulo é: "+area+" e o Perímetro é de: "+perimetro);
    }
}
