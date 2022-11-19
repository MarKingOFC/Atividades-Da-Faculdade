import javax.swing.JOptionPane;

/*3- Faça um programa algoritmo que solicite ao usuário, enquanto o mesmo desejar,
números e armazene-os em um vetor. Após a entrada de dados, somar os valores do
vetor, calcular e mostrar a média. Calcule e mostre quantos números armazenados no
vetor estão acima da média*/

public class Exercicio3 {
    public static void main(String[] args) {
        //variaveis e declaração de vator
        double numeros[] = new double[1000];
        double soma=0, media;
        int q=0, maior=0, i;
        String resp;
        //processamento, entrada e saida de dados
        do{
            numeros[q] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número"));
            soma += numeros[q];
            q++;
            resp = JOptionPane.showInputDialog(null, "Deseja informar outro número? Sim/Não");
        }while(resp.equalsIgnoreCase("sim"));
        media = soma/q;
        for (i=0; i<q; i++){
                if (numeros[i] > media)
                       maior ++;
            }
            JOptionPane.showMessageDialog(null, String.format("Média dos números informados: %.2f Números acima da média: %.d" ,media ,maior));
    }
}
