import javax.swing.JOptionPane;

/*4- Escreva um algoritmo que leia a quantidade de valores que serão processados, depois
leia os valores e calcule a média dos mesmos. Utilize a estrutura de repetição PARA.*/

public class Exercicio4 {
    public static void main(String[] args) {
        //variaveis
        double num, media, soma = 0;
        int i,qtd;
        //entrada de dados
        qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de valores que serão processados: "));  
        
        //processamento
        for(i=1; i<=qtd; i++){  
            
                   
            num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: "));
            soma = soma + num;
            
        } 
        media = soma/qtd;
        //saida de dados
        JOptionPane.showMessageDialog(null, "A média dos números digitados é de: " + media);
    }
}