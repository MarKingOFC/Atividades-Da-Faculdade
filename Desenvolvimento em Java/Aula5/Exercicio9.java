import javax.swing.JOptionPane;

/*9- Faça um procedimento que recebe como parâmetros o peso e a altura de uma pessoa,
calcula e mostra o valor de seu IMC (índice de massa corporal). Sabendo que:
IMC = peso /altura2
.
Faça um algoritmo que solicite o peso e altura de uma pessoa, em seguida calcule e
mostre o IMC utilizando o procedimento criado.*/

public class Exercicio9 {
    public static void main(String[] args) {
        //variaveis
        double peso, altura, imc;
        //entrada de dados
        peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua altura: "));
        //processamento
        imc = valorImc(peso, altura);
        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("O seu IMC é de: %.1f",imc));
    }

    public static double valorImc(double peso, double altura) {
        double imc;
        imc = peso/Math.pow(altura,2);
        return imc;
    }
}
