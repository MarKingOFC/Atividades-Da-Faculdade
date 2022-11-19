import javax.swing.JOptionPane;

/*4- Elabore um algoritmo para calcular as raízes de uma equação de segundo grau
ax²+bx+c, conhecidos os coeficientes a, b, c.
Lembre que as raízes x1
e x2
são calculadas pela fórmula
Elabore métodos separados, funções, getDelta(a,b,c), getX1(a,b,c) e getX2(a,b,c). Também,
elabore o método principal para efetuar a leitura de dados e chamar às restantes funções.*/

public class Exercicio4 {
    public static void main(String[] args) {
        //variaveis
        double a, b, c, x1, x2 ;
        //entrada de dados
        a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o coeficiente A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o coeficiente B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o coeficiente C: "));
        //processamento
        x1 = getX1(a, b, c);
        x2 = getX2(a, b, c);
        //saida de dados
        JOptionPane.showMessageDialog(null,"Raiz 1 : "+x1+" e a Raiz 2 : "+x2);
    }

    public static double getDelta(double a,double b,double c) {
        double getDelta;
        getDelta = Math.pow(b,2)-(4*a*c);
        return getDelta;
    }

    public static double getX1(double a, double b, double c) {
        double x;
        x = -b + Math.sqrt(getDelta(a, b, c))/(2*a);
        return x;
    }

    public static double getX2(double a, double b, double c) {
        double x;
        x = -b - Math.sqrt(getDelta(a, b, c))/(2*a);
        return x;
    }
}
