import javax.swing.JOptionPane;

/*7- Criar um algoritmo que leia a idade de uma pessoa e informe sua classe eleitoral:
• não-eleitor (abaixo de 16 anos)
• eleitor obrigatório (entre 18 e 65 anos)
• eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)*/

public class Exercicio7 {
    public static void main(String[] args) {
        //variaveis
        int idade;
        //entrada de dados
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua idade: "));
        //processamento e saida de dados
        if (idade<16){
            JOptionPane.showMessageDialog(null,"Não-Eleitor");
        }
        else if (idade>=18 && idade<=65){
            JOptionPane.showMessageDialog(null,"Eleitor Obrigatório");
        }
        else if (idade>=16 || idade<18 || idade>65){
            JOptionPane.showMessageDialog(null,"Eleitor Facultativo");
        }
    }
}
