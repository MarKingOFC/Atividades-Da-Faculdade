import javax.swing.JOptionPane;

/*1- Faça um programa em Java que receba uma frase e uma palavra. Caso a frase
contenha a palavra ESCOLA, substitua-a pela palavra digitada. Exemplo:
▪ Frase: Eu moro perto de uma escola, mas essa escola não é a melhor.
▪ Palavra: padaria
▪ Saída: Eu moro perto de uma padaria, mas essa padaria não é a melhor.*/

public class Exercicio1 {
    public static void main(String[] args) {
        //variaveis
        String frase, palavra;
        //entrada de dados
        frase = JOptionPane.showInputDialog("Digite uma frase: ");
        palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
        //processamento e saida de dados
        if(frase.indexOf("escola") >= 0) {
            frase = frase.replace("escola", palavra);
            JOptionPane.showMessageDialog(null,frase);
        } else {
            JOptionPane.showMessageDialog(null,"A palavra escola não foi encontrada");
        }
    }
}