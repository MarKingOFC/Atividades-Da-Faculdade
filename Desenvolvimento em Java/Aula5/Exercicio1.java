import javax.swing.JOptionPane;

/*1- Faça um método que receba como parâmetros o Km inicial, Km final, quantidade de
litros gastos e preço do litro. Calcule e mostre:
- Distância percorrida;
- Consumo médio;
- Valor gasto;
Faça um algoritmo principal que solicite para o usuário o valor da quilometragem inicial,
final, a quantidade de litros gastos e o preço do litro e mostre a distância percorrida, o
consumo médio e o valor gasto, para isso utilize o método definido acima.*/

public class Exercicio1 {
    public static void main(String[] args) {
        //variaveis
        float kmInicial, kmFinal, litros, preco, distanciaP, consumo, valor;
        //entrada
        kmInicial = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o KM Inicial:"));
        kmFinal = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o KM Final:"));
        litros = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a quantidade de litros gastos:"));
        preco = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o preço do litro:"));
        //processamento
        distanciaP = distancia(kmInicial, kmFinal);
        consumo = consumo(distanciaP, litros);
        valor = preco(litros, preco);
        //saida de dados
        JOptionPane.showMessageDialog(null,"Distância percorrida = " + distanciaP + "KM\nConsumo médio = " + consumo + "L\nValor Gasto = R$" + valor);
    }


    public static float distancia(float kmInicial, float kmFinal) {
        return kmFinal-kmInicial;
    }

    public static float consumo(float distanciaP, float litros ) {
        return distanciaP/litros;
    }

    public static float preco(float litros, float preco) {
        return litros*preco;
    }
}
