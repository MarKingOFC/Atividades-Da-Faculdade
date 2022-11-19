import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args){
        //variaveis
        float n1, n2, n3, media;

        //entrada de dados
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o terceiro número: "));

        //processamento de dados
        media = (n1*1 + n2*2 + n3*4)/7;
        
        //saida de dados
        JOptionPane.showMessageDialog(null,String.format ("A média é %.2f:" , media));
    }
}