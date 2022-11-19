import javax.swing.JOptionPane;

/*9- Faça um algoritmo que solicite um código referente ao tipo da diária de hospedagem e
também a quantidade de diárias desejada por um cliente. Calcule e mostre, usando
estrutura condicional aninhada, o valor total a pagar pelo cliente, conforme a tabela abaixo:
Caso seja digitado um código diferente dos apresentados na tabela acima deve ser
mostrada a mensagem “Tipo de diária inválido”.*/

public class Exercicio9 {
    public static void main(String[] args) {
        //variaveis
        char tipo;
        int diaria;
        //entrada de dados
        tipo = JOptionPane.showInputDialog(null,"Digite o tipo de hospedagem: \nS para Simples\nD para Duplo\nT para Triplo").charAt(0);
        diaria = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite as quantidades diárias desejadas: "));
        //processamento e saida de dados
        if (tipo == 'S' || tipo =='s'){
            JOptionPane.showMessageDialog(null,"Valor total a pagar : R$"+(diaria*255.50));
        }
        else if (tipo == 'D' || tipo =='d'){
            JOptionPane.showMessageDialog(null,"Valor total a pagar : R$"+(diaria*305.50));
        }
        else if (tipo == 'T' || tipo =='t'){
            JOptionPane.showMessageDialog(null,"Valor total a pagar : R$"+(diaria*360.50));
        }
        else{
            JOptionPane.showMessageDialog(null,"Tipo de diária inválido");
        }
    }
}
