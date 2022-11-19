import javax.swing.JOptionPane;

/*3- Faça um algoritmo que leia um valor n, inteiro e positivo, calcule e mostre a seguinte
soma:
S = 1 + 1/2 + 1/3 + 1/4 +...+ 1/n*/

public class Exercicio3 {
    public static void main(String[] args) {
        //variaveis
        int n, i, num=0;
        //entrada de dados
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número positivo e inteiro: "));
        //processamento e saida de dados
        for(i=0;i<n;i++){
            num = 1 + (1/n);
        }
        JOptionPane.showMessageDialog(null,"A Soma dos números é de: "+num);
    }
}
