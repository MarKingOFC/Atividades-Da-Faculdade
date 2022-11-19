import javax.swing.JOptionPane;

/*2- Faça um programa em Java para criptografar uma frase dada pelo usuário, ou seja, a
criptografia deverá inverter a frase. Exemplo:
▪ Frase: EU ESTOU NA ESCOLA
▪ Saída: ALOCSE AN UOTSE UE*/

public class Exercicio2 {
    public static void main(String[] args) {
        //variaveis
        String frase;
        int i;
        //entrada de dados
        frase = JOptionPane.showInputDialog(null,"Digite uma frase: ");
        //processamento e saida de dados
        for(i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
    }
}
