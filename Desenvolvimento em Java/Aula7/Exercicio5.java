import javax.swing.JOptionPane;

/*5- Faça um programa em Java que obtenha o preço atual de um produto e a sua venda
média mensal, calcule e mostre o novo preço (pode ser aumentado ou diminuído). Para
isso, utilize a tabela abaixo:*/


public class Exercicio5 {
    public static void main(String[] args) {
        //variaveis
        double precoAtual, novoPreco;
        int vendaMedia;
        //entrada de dados
        precoAtual = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço atual do produto: "));
        vendaMedia = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a venda média mensal do produto: "));
        //processamento e saida de dados
        if (precoAtual<30 && vendaMedia<500){
            novoPreco = precoAtual+(precoAtual*0.10);
            JOptionPane.showMessageDialog(null,"O novo preço do produto é de : R$"+novoPreco);
        }
        else if (precoAtual>=30 && precoAtual<80 && vendaMedia>=500 && vendaMedia<1200){
            novoPreco = precoAtual+(precoAtual*0.15);
            JOptionPane.showMessageDialog(null,"O novo preço do produto é de : R$"+novoPreco);
        }
        else if (precoAtual>=80 && vendaMedia>=1200){
            novoPreco = precoAtual-(precoAtual*0.20);
            JOptionPane.showMessageDialog(null,"O novo preço do produto é de : R$"+novoPreco);
        }
    }
}
