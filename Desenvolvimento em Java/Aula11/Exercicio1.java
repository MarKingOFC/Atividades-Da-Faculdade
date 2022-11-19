import javax.swing.JOptionPane;


public class Exercicio1 {
    public static void main(String[] args) {
            double media=0 ,salario ,decimoTerceiro ,ferias;
            int i, qtd=0;
            for (i=1; i<=12; i++){
                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário salário: "));
                media += salario;
                qtd++;
            }
    
            decimoTerceiro = media/qtd;
            ferias = decimoTerceiro * 1/3;


            JOptionPane.showMessageDialog(null,"Décimo Terceiro salário: "+decimoTerceiro+"\nFérias: "+ferias);

    }
}

/*
Marco Aurelio Santos RGM:25762141
Bruno Silva Matos RGM:26484200
*/