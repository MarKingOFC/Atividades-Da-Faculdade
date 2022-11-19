import javax.swing.JOptionPane;

/*5- Elabore um programa em Java que leia a placa de um veículo no formato LL-NNNN e
exiba o dia do rodízio desse veículo. O programa deverá possibilitar a consulta de mais de
uma placa, a critério do usuário e fazer o tratamento de exceção.*/

public class Exercicio5 {
    public static void main(String[] args) {
        //variaveis
        String placa;
        char res = 's';
        int ultimo;
        //entrada , processamento e saida de dados
        while(res == 's'){
            placa = JOptionPane.showInputDialog(null,"Digite a placa do veiculo, padrão (LL-NNNN): ");

            if(placa.length() == 7) {
                ultimo = Integer.parseInt(placa.substring(placa.length() -1));

                switch(ultimo){
                    case 1:
                    case 2:
                    JOptionPane.showMessageDialog(null,"Rodízio na segunda-feira no Centro Expandido");
                        break;
                    case 3:
                    case 4:
                    JOptionPane.showMessageDialog(null,"Rodízio na terça-feira no Centro Expandido");
                        break;
                    case 5:
                    case 6:
                    JOptionPane.showMessageDialog(null,"Rodízio na quarta-feira no Centro Expandido");
                        break;
                    case 7:
                    case 8:
                    JOptionPane.showMessageDialog(null,"Rodízio na quinta-feira no Centro Expandido");
                        break;
                    case 9:
                    case 0:
                    JOptionPane.showMessageDialog(null,"Rodízio na sexta-feira no Centro Expandido");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null,"Placa inválida");
            }
            res = JOptionPane.showInputDialog(null,"Deseja continuar? S/N: ").charAt(0);
        }
    }
}
