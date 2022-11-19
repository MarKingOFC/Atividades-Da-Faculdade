import javax.swing.JOptionPane;

/*4- Escreva um programa em Java que calcule as duas raízes de uma equação de 2º grau ax²+bx+c,
 conhecendo os valores dos coeficientes da mesma (a, b, c). Suponha que as raízes são reais.
  Lembre-se que para calcular as duas raízes:*/

public class Exercicio4 {
    public static void main(String[] args) {
        //variaveis
        double a, b, c, delta, x1, x2;

        //entrada de dados
        a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o coeficiente A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o coeficiente B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o coeficiente C: "));

        //processamento
        delta = Math.pow(b,2)-(4*a*c);
        x1 = -b + Math.sqrt(delta)/(2*a);
        x2 = -b - Math.sqrt(delta)/(2*a);

        //saida de dados
        JOptionPane.showMessageDialog(null,"Raiz 1 : "+x1+" e a Raiz 2 : "+x2);
    }
}
