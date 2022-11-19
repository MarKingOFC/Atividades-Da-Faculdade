import javax.swing.JOptionPane;

/*3- Elabore um algoritmo que implemente uma calculadora com as funções de somar,
subtrair, multiplicar e dividir. O programa deverá solicitar ao usuário os dois valores, e
perguntar qual a operação pretendida (‘+’, ‘-‘,‘*’ ou ‘/’ ) e a seguir calcular e mostrar o
resultado. Obs: Obrigatório utilizar a estrutura escolha...caso.*/

public class Exercicio3 {
    public static void main(String[] args) {
        //variaveis
        double valor1, valor2;
        String operacao;
        //entrada de dados
        valor1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o primeiro valor:"));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o segundo valor:"));
        operacao = JOptionPane.showInputDialog(null,"Digite a operação pretendida: ");
        //processamento e saida de dados
        switch (operacao){
            case "+":
                JOptionPane.showMessageDialog(null,"A soma dos dois valores é de: "+(valor1+valor2));
            break;
            case "-":
                JOptionPane.showMessageDialog(null,"A subtração dos dois valores é de: "+(valor1-valor2));
            break;
            case "*":
                JOptionPane.showMessageDialog(null,"A nultiplicação dos dois valores é de: "+(valor1*valor2));
            break;
            case "/":
                JOptionPane.showMessageDialog(null,"A divisão dos dois valores é de: "+(valor1/valor2));
            break;
            default:
                JOptionPane.showMessageDialog(null,"Digite o simbolo da operação para continuar");
        }
    }
}
