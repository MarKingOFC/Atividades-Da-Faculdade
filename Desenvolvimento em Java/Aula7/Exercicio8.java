import javax.swing.JOptionPane;

/*8- Elabore um algoritmo que que leia o destino do passageiro partindo de São Paulo e se
a viagem inclui retorno (ida e volta). Ao final informar o preço da passagem conforme a
tabela dada a seguir.
Exercícios de aplicação
Destino Ida Ida e volta
1- Região Norte R$ 500,00 R$ 900,00
2- Região Nordeste R$ 350,00 R$ 650,00
3- Região Centro-Oeste R$ 350,00 R$ 600,00
4- Região Sul R$ 600,00 R$ 550,00
Observação: Considere elaborar um menu de opções com os destinos e implemente a
solução com a estrutura escolha... caso*/

public class Exercicio8 {
    public static void main(String[] args) {
        //variaveis
        int codigo;
        char idaEvolta;
        //entrada de dados
        codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 1 para Região Norte\nDigite 2 para Região Nordeste\nDigite 3 para Região Centro-Oeste\nDigite 4 para Região Sul"));
        idaEvolta = JOptionPane.showInputDialog(null,"A passagem inclui retorno?: \nS para Sim\nN para Não").charAt(0);
        //processamento e saida de dados
        switch(codigo){
            case 1 :
                if (idaEvolta == 'S' || idaEvolta == 's'){
                    JOptionPane.showMessageDialog(null,"Ida e volta: R$ 900,00");
                }
                else if (idaEvolta == 'N' || idaEvolta == 'n'){
                    JOptionPane.showMessageDialog(null,"Ida: R$ 500,00");
                }
                break;
            case 2 :
                if (idaEvolta == 'S' || idaEvolta == 's'){
                    JOptionPane.showMessageDialog(null,"Ida e volta: R$ 650,00");
                }
                else if (idaEvolta == 'N' || idaEvolta == 'n'){
                    JOptionPane.showMessageDialog(null,"Ida: R$ 350,00");
                }
                break;
            case 3 :
                if (idaEvolta == 'S' || idaEvolta == 's'){
                    JOptionPane.showMessageDialog(null,"Ida e volta: R$ 600,00");
                }
                else if (idaEvolta == 'N' || idaEvolta == 'n'){
                    JOptionPane.showMessageDialog(null,"Ida: R$ 350,00");
                }
                break;
            case 4 :
                if (idaEvolta == 'S' || idaEvolta == 's'){
                    JOptionPane.showMessageDialog(null,"Ida e volta: R$ 550,00");
                }
                else if (idaEvolta == 'N' || idaEvolta == 'n'){
                    JOptionPane.showMessageDialog(null,"Ida: R$ 600,00");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digite um código valido !!");
        }
    }
}
