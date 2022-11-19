import javax.swing.JOptionPane;

/*7- Temos um grupo de pessoas. Escreva um algoritmo que leia o sexo e a altura de cada
pessoa, calcule e mostre a altura média das mulheres e dos homens separadamente.
Utilize o comando de repetição que desejar.*/

public class Exercicio7 {
    public static void main(String[] args) {
        //variaveis
        double alturaH, alturaM, h, m, mediaH, mediaM;
        char sexo;
        //entrada de dados
        h = 0;
        m = 0;
        sexo = 'm';
        alturaH = 0;
        alturaM = 0;
        //processamento
        while (sexo == 'h' || sexo == 'm') {
            sexo = JOptionPane.showInputDialog(null, "Digite seu sexo com H ou M: ").toLowerCase().charAt(0);
            if (sexo == 'h') {
                h++;
                alturaH = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua altura: "));
                alturaH++;
            } else if (sexo == 'm') {
                m++;
                alturaM = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua altura: "));
                alturaM++;
            }
        }
        mediaH = alturaH / h;
        mediaM = alturaM / m;
        //saida de dados
        JOptionPane.showMessageDialog(null, "A média de altura dos homens é de : " + mediaH + "m");
        JOptionPane.showMessageDialog(null, "A média de altura das mulheres é de : " + mediaM + "m");

        
    }

}