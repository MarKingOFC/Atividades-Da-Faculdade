import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
        //variaveis
        float horas, minutos;

        //entrada de dados
        horas = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite as horas: "));
        minutos = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite os minutos: "));
;
        //processamento
        minutos = horas * 60 + minutos;

        //saida de dados
        JOptionPane.showMessageDialog(null,"Já se passaram" + minutos + "minutos" );
    }
}
