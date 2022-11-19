import javax.swing.JOptionPane;

/*5- Escreva um algoritmo que leia um grupo de valores (não sabemos quantos são) para
calcular e visualizar a média desses valores e, também, determinar e visualizar o maior
deles. Utilize uma estrutura de repetição ENQUANTO ou REPITA*/

public class Exercicio5 {
    public static void main(String[] args) {
        //entrada de dados
        double num, media, soma = 0;
        char resp = 's';       
        int info = 0;
        //processamento
        while(resp == 's' || resp == 'S'){           
            num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número:"));
            soma = soma + num;
            info++;
                       
            resp = JOptionPane.showInputDialog(null, "Digite s para continuar:").charAt(0);
        } 
        media = soma/info;
        //saida de dados
        JOptionPane.showMessageDialog(null, "A média dos números digitados é de: " + media);
    }
}



