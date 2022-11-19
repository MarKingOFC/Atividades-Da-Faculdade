import javax.swing.JOptionPane;

/*6- Elabore um algoritmo para calcular as raízes de uma equação de segundo grau, mas
verifique nesta versão que delta deverá ser um valor positivo, para poder calcular e
visualizar as raízes reais da equação. Caso contrário, visualize uma mensagem explicando
que não serão calculadas as raízes*/

public class Exercicio6 {
    public static void main(String[] args) {
        //variaveis
        double a, b, c, x1, x2, delta;
        //entrada de dados
        a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o coeficiente A : "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o coeficiente B : "));
        c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o coeficiente C : "));
        //processamento e saida de dados
        delta = Math.pow(b,2)-(4*a*c);
        if (delta<0){
            JOptionPane.showMessageDialog(null,"As raizes não poderam ser calculadas");
        }
        else {
            x1 = -b + Math.sqrt(delta)/2*a;
            x2 = -b - Math.sqrt(delta)/2*a;
            JOptionPane.showMessageDialog(null,"Raiz 1 : "+x1+"\nRaiz 2: "+x2);
        }
    }
}
