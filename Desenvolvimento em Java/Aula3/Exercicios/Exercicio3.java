import javax.swing.JOptionPane;

/*3- Escreva um programa em Java que solicite ao usuário a distância entre duas cidades 
e o tempo de viagem. O programa deverá calcular e exibir a velocidade média de um carro
 que vai de uma cidade para outra. Utilize a fórmula:
 VM=distancia/tempo*/

public class Exercicio3 {
    public static void main(String[] args) {
        //variaveis
        float distancia, tempo, velocidadeMedia;

        //entrada de dados
        distancia = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a distância entre as cidades: "));
        tempo = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o tempo de viagem: "));

        //processamento
        velocidadeMedia = distancia/tempo;

        //saida de dados
        JOptionPane.showMessageDialog(null,"A velocidade média do carro será de: "+velocidadeMedia+"Km/h");
    }
}
