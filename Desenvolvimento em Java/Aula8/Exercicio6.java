import javax.swing.JOptionPane;

/*6- Escreva um algoritmo que leia um grupo de valores reais e determine quantos valores
são positivos e quantos são negativos. Determine, também, qual é o menor desses
valores. Utilize o comando de repetição que desejar.*/

public class Exercicio6 {
    public static void main(String[] args) {
        //variaveis
        double num, positivo, negativo, menor;
        char resp;
        //entrada de dados
        resp = 's';
        num = 0;
        positivo = 0;
        negativo = 0;
        menor = 0;
        //processamento
        while (resp == 's') {

            num = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Digite alguns números variando entre positivo e negativo"));

            num++;
            resp = JOptionPane.showInputDialog(null, "Quer continuar? s / n ").toLowerCase().charAt(0);

            if (num >= 0) {
                positivo++;
            } else {
                negativo++;
            }

            if (num < menor) {
                menor = num - 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Foram digitados" + positivo + " números positivos e " + negativo + " números negativos");
        JOptionPane.showMessageDialog(null, "O menor numero foi : " + menor);
    }
}
