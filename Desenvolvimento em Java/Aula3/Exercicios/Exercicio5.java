import javax.swing.JOptionPane;

/*5- Escreva um programa em Java que obtenha uma temperatura em graus Celsius,
 calcule e mostre a respectiva temperatura nas escalas Fahrenheit e Kelvin.
  Utilize as fórmulas abaixo:
tF = 1,8*tC+32
tK = tC+273*/

public class Exercicio5 {
    public static void main(String[] args) {
        //variaveis
        double tC, tF, tK;

        //entrada de dados
        tC = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a temperatura em graus Celsius: "));

        //processamento
        tF = 1.8*tC+32;
        tK = tC+273;

        //saida de dados
        JOptionPane.showMessageDialog(null,"A temperatura em Celsius corresponde a "+tF+" graus em Fahrenheit e "+tK+" graus em Kelvin");
    }
}
