import javax.swing.JOptionPane;

/*6- Faça um programa que leia valor inteiro em reais, calcule e apresente na tela o menor
número de notas (cédulas) possíveis nos quais o valor pode ser decomposto. Considere
as notas de: R$ 100, 50, 20, 10, 5, 2, 1*/

public class Exercicio6 {
    public static void main(String[] args) {
        //variaveis
        int valor, cem, cinq, vinte, dez, cinco, dois, um;

        //entrada de dados
        valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor inteiro: "));

        //processamento
        cem = valor/100;
        cinq = (valor % 100)/50;
        vinte = (valor % 50)/20;
        dez = (valor % 50 % 20)/10;
        cinco = (valor % 10)/5;
        dois = (valor % 5)/2;
        um = (valor % 5 % 2);

        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("%d notas de R$ 100 \n%d notas de R$ 50 \n", cem, cinq));
        JOptionPane.showMessageDialog(null,String.format("%d notas de R$ 20 \n%d notas de R$ 10 \n", vinte, dez));
        JOptionPane.showMessageDialog(null,String.format("%d notas de R$ 5 \n%d notas de R$ 2 \n", cinco, dois));
        JOptionPane.showMessageDialog(null,String.format("%d notas de R$ 1 \n", um));
    }
}
