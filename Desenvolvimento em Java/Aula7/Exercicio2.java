import javax.swing.JOptionPane;

/*2- Na cidade de São Paulo a circulação de veículos é restrita a determinados horários no
chamado “Centro Expandido”. Com base no digito final da placa, o motorista sabe se deve
ou não circular no horário proibido.
Faça um algoritmo que receba o digito final da
placa de um automóvel e imprima qual o dia
da semana o veículo não pode circular no
“Centro Expandido”. Utilize um método que
recebe o digito da placa e retorne o dia da
semana conforme a tabela ao lado.*/

public class Exercicio2 {
    public static void main(String[] args) {
        //variaveis
        int digito;
        //entrada de dados
        digito = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o digito final da placa do automóvel: "));
        //processamento e saida de dados
        if (digito == 1 || digito == 2){
            JOptionPane.showMessageDialog(null,"Rodízio na segunda-feira");
        }
        else if (digito == 3 || digito == 4){
            JOptionPane.showMessageDialog(null,"Rodízio na terça-feira");
        }
        else if (digito == 5 || digito == 6){
            JOptionPane.showMessageDialog(null,"Rodízio na quarta-feira");
        }
        else if (digito == 7 || digito == 8){
            JOptionPane.showMessageDialog(null,"Rodízio na quinta-feira");
        }
        else if (digito == 9 || digito == 0){
            JOptionPane.showMessageDialog(null,"Rodízio na sexta-feira");
        }
    }
}

