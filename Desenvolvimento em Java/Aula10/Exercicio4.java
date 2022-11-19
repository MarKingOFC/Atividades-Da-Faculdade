import javax.swing.JOptionPane;

/*4- Faça um programa em Java que obtenha os salários de 10 funcionários em 6 meses e
armazene-os em uma matriz, obtenha também um vetor contendo os nomes de cada um,
calcule e mostre a média salarial semestral de cada funcionário, juntamente com o seu
nome*/

public class Exercicio4 {
    public static void main(String[] args) {
        //variaveis e declaração de vetor
        double salario[][] = new double [10][6];
        String nomes[] = new String[10];
        double media[] = new double [10];
        double acumu=0;
        int i,j;
        //processamento, entrada e saida de dados
        for(i=0; i<10; i++){
            nomes[i] = JOptionPane.showInputDialog(null, "Informe o nome  do " + (i+1) +"º funcinário");
        }
                                
        for(i=0; i<10; i++){        
            acumu = 0;                  
            for(j=0; j<6; j++){             
                salario[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário referente ao " + (j+1) + "º mês do funcionário " + nomes[i]));
                acumu += salario[i][j];         
            }
           
            media[i] = acumu/6;
        }
        
        for(i=0; i<10; i++){
            JOptionPane.showMessageDialog(null, String.format("Funcionário: %s \nMédia salarial semestral: %.2f" , nomes[i] , media[i]));
        }
    
    }
}
