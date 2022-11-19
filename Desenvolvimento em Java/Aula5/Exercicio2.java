import javax.swing.JOptionPane;

/*2- Escreva um método com retorno que receba como parâmetros os lados de um
retângulo, calcula e retorna o valor de sua área.
area = lado*lado
Faça um algoritmo principal que solicite os valores dos lados de um retângulo ao usuário,
e utilizando a função definida acima, calcule e mostre o valor de área.*/

public class Exercicio2 {
    public static void main(String[] args) {
        //variaveis
        float lado1, lado2, area;
        //entrada de dados
        lado1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um lado de um retângulo: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o outro lado do retângulo: "));
        //processamento
        area = calculoArea(lado1, lado2);
        //saida de dados
        JOptionPane.showMessageDialog(null,"A área desse retângulo é de = " + area);
    }

    private static float calculoArea(float lado1, float lado2) {
        return lado1*lado2;
    }
}
