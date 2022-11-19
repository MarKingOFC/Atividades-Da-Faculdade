import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        double valorC, valorV, taxaE, total;
               
        valorC = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra: "));      
        if (valorC<=100){
            taxaE = 10;
            valorV = valorC * 1.15 ;
            total = valorV + taxaE;
            JOptionPane.showMessageDialog(null, String.format("O preço do produto incluindo a entrega é de: R$%.2f ", total));
            
        }
        else if (valorC>=100.01 && valorC<=250){
            taxaE = 17;
            valorV = valorC * 1.15 ;
            total = valorV + taxaE;
            JOptionPane.showMessageDialog(null, String.format("O preço do produto incluindo a entrega é de: R$%.2f ", total));
        }
        else if (valorC>=250.01 && valorC<=950){
            taxaE = 20;
            valorV = valorC * 1.15 ;
            total = valorV + taxaE;
            JOptionPane.showMessageDialog(null, String.format("O preço do produto incluindo a entrega é de: R$%.2f ", total));
        }
        else if (valorC>950){
            taxaE = 25;
            valorV = valorC * 1.15 ;
            total = valorV + taxaE;
            JOptionPane.showMessageDialog(null, String.format("O preço do produto incluindo a entrega é de: R$%.2f ", total));
        }   
   

        
        
    }
}

/*
Marco Aurelio Santos RGM:25762141
Bruno Silva Matos RGM:26484200
*/