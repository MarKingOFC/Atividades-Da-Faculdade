import javax.swing.JOptionPane;

/*-Faça um programa em Java que solicite ao usuário a quantidade de quilômetros que um carro
percorreu em 15 dias e armazene em um vetor (cada posição do vetor corresponde a um dia). Após fazer a leitura dos dados,
calcule e mostre a quantidade média de quilômetros percorridos nesses 15 dias e quantos dias a quantidade de quilômetros
percorridos estão acima da média (ou seja, quantos valores armazenados no vetor estão acima da média).
Obs.: É obrigatório o uso de estrutura de repetição e vetor e formatação da média com duas casas decimais. */

//Marco Aurelio Santos RGM:25762141

public class Exercicio3 {
    public static void main(String[] args) {
        //variaveis
        double[] qtdKm = new double[15];
        double qtdMedia, soma = 0;
        int i, dias = 0;

        for (i = 0; i < 15; i++) {
            qtdKm[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a quantidade de quilômetros rodados: "));
            soma = soma + qtdKm[i];
        }
        qtdMedia = soma / 15;
        JOptionPane.showMessageDialog(null, "A média dos quilômetros rodados é de " + qtdMedia);

        for (i = 0; i < 15; i++) {
            if (qtdKm[i] > qtdMedia)
            dias++;
        }
        JOptionPane.showMessageDialog(null,String.format("A média de kilômetros rodados foram de: %.2f",qtdMedia));
        JOptionPane.showMessageDialog(null,"Os dias que a quilômetragem ficou acima da média foram de: " + dias);
    }
}
