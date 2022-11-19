import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
        //variaveis
        double ang, sen, cos, tan;

        //entrada de dados
        ang = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um ângulo: "));

        //processamento
        sen = Math.sin(ang);
        cos = Math.cos(ang);
        tan = Math.tan(ang);

        //saida de dados
        JOptionPane.showMessageDialog(null,String.format("Seno = %.2f \nCosseno = %.2f \nTangente = %.2f " ,sen,cos,tan));
    }
}
