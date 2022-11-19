import javax.swing.JOptionPane;

/*5- Elabore um algoritmo para calcular a velocidade de três objetos diferentes (com
velocidade constante). Conhecemos (são dados digitados pelo usuário), para cada
objeto, a distância percorrida e o tempo que necessitou para percorrer essa distância.
Utilize um método geral que calcule e retorne a velocidade de um objeto, fornecidos
como parâmetros os dados de distância e tempo.*/

public class Exercicio5 {
    public static void main(String[] args) {
        //variaveis
        float d1, t1, d2, t2, d3, t3, v1, v2, v3;
        //entrada de dados
        d1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a distância percorrida pelo objeto 1 em Km: "));
        t1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o tempo percorrido pelo objeto 1 em horas:"));
        d2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a distância percorrida pelo objeto 2 em Km: "));
        t2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o tempo percorrido pelo objeto 2 em horas:"));
        d3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a distância percorrida pelo objeto 3 em Km: "));
        t3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o tempo percorrido pelo objeto 3 em horas:"));
        //processamento
        v1 = velocidade1(d1, t1);
        v2 = velocidade2(d2, t2);
        v3 = velocidade3(d3, t3);
        //saida de dados
        JOptionPane.showMessageDialog(null,"Velocidade do objeto 1: "+v1+"Km/h");
        JOptionPane.showMessageDialog(null,"Velocidade do objeto 2: "+v2+"Km/h");
        JOptionPane.showMessageDialog(null,"Velocidade do objeto 3: "+v3+"Km/h");
    }

    public static float velocidade1(float d1, float t1) {
        return d1/t1;
    }

    public static float velocidade2(float d2, float t2) {
        return d2/t2;
    }
    
    public static float velocidade3(float d3, float t3) {
        return d3/t3;
    }
}
