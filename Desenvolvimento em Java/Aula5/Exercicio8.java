import javax.swing.JOptionPane;

/*8- Escreva um método chamado valorCofre que aceite três parâmetros inteiros chamados
vinteCinco, dez e cinco, que conterão a quantidade de moedas de 25, 10 e 5 centavos
respectivamente de um cofre. O método deve calcular e retornar o valor em reais (R$).
Faça um algoritmo principal que solicite ao usuário a quantidade de moedas de 25, 10 e 5
centavos e usando o método definido acima, mostre o valor em reais.*/

public class Exercicio8 {
    public static void main(String[] args) {
        //variaveis
        int vinteCinco, dez, cinco;
        double reais;
        //entrada de dados
        vinteCinco = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de moedas de 25 centavos: "));
        dez = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de moedas de 10 centavos: "));
        cinco = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de moedas de 5 centavos: "));
        //processamento
        reais = valorCofre(vinteCinco, dez, cinco);
        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("O valor das moedas em reais são de: R$ %.2f",reais));
    }

    public static double valorCofre(int vinteCinco, int dez, int cinco) {
        double total;
        total = (vinteCinco*0.25)+(dez*0.1)+(cinco*0.05);
        return total;
    }
}
