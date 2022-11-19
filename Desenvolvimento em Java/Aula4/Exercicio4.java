import javax.swing.JOptionPane;

/*4- Faça um programa que leia quatro números reais correspondentes às coordenadas x e
y de dois pontos no plano cartesiano, p1(x1, y1) e p2(x2, y2), calcule e mostre a distância
entre eles, com quatro casas decimais, segundo a fórmula:
𝑑𝑖𝑠𝑡𝑎𝑛𝑐𝑖𝑎 = 𝑥1 − 𝑥2 2 + (𝑦1 − 𝑦2)²*/

public class Exercicio4 {
    public static void main(String[] args) {
        //variaveis
        float x1, x2, y1, y2, distancia;

        //entrada de dados
        x1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Coordenada x do ponto 1:"));
        x2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Coordenada x do ponto 2:"));
        y1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Coordenada y do ponto 1:"));
        y2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Coordenada y do ponto 2:"));

        //processamento
        distancia = (float) Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));

        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("A distância entre os pontos é %.4f", distancia));
    }
}
