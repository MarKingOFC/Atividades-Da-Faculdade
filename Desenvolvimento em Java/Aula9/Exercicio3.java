import javax.swing.JOptionPane;

/*3- Faça um programa em Java que receba uma palavra e verifique se ela constitui um
palíndromo, ou seja, se a palavra escrita do fim para o começo fica igual à palavra escrita
do começo para o fim. Exemplos:
▪ ARARA
▪ ANA
▪ MIRIM*/

public class Exercicio3 {
    public static void main(String[] args) {
        //variaveis
        String frase, inversao = "";
        int i;
        //entrada de dados
        frase = JOptionPane.showInputDialog(null, "Digite um frase para verificar se é uma frase palíndromo: ");
        //processamento e saida de dados
        for(i = frase.length() - 1; i >= 0; i--){
            inversao += frase.charAt(i);
        }

        if(frase.equalsIgnoreCase(inversao)) {
            JOptionPane.showMessageDialog(null, "Essa é uma frase palíndromo");
        } else {
            JOptionPane.showMessageDialog(null, "Essa não é uma frase palíndromo");
        }

    }
}
