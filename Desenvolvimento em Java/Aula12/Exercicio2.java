import javax.swing.JOptionPane;

/*- A escola “APRENDER” faz o pagamento de seus professores por hora de acordo com a categoria. Faça
um programa em Java que obtenha a categoria do professor e a quantidade de horas semanais por ele trabalhadas e utilizando
estrutura de decisão if encadeada ou estrutura switch...case, calcule e mostre o salário de professor. Sabe-se que o valor da
hora segue a tabela abaixo e que para o cálculo do salário mensal são consideradas 4,5 semanas:
Categoria Valor por hora
1 R$12,00
2 R$17,00
3 R$25,00
Caso seja digitada uma categoria diferente das apresentadas na tabela mostre a mensagem “Categoria inexistente”.*/

//Marco Aurelio Santos RGM:25762141

public class Exercicio2 {
    public static void main(String[] args) {
        //variaveis
        int categoria;
        double qtdHoras, valorHora, salarioMensal;
        //entrada de dados
        categoria = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua categoria: "));
        qtdHoras = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de horas semanais trabalhadas: "));
        //processamento e saida de dados
        switch(categoria){
            case 1:
                valorHora = 12;
                salarioMensal = (valorHora*qtdHoras)*4.5 ;
                System.out.println("Seu salário será de: R$"+salarioMensal);
                break;
            case 2:
                valorHora = 17;
                salarioMensal = (valorHora*qtdHoras)*4.5 ;
                System.out.println("Seu salário será de: R$"+salarioMensal);
                break;
            case 3:
                valorHora = 25;
                salarioMensal = (valorHora*qtdHoras)*4.5 ;
                System.out.println("Seu salário será de: R$"+salarioMensal);
                break;
            default:
                System.out.println("Categoria inexistente");
        }
    }
}
