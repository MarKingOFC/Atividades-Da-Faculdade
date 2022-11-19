import javax.swing.JOptionPane;

/*1- Faça um algoritmo que receba o código correspondente ao cargo de um funcionário e
seu salário atual e mostre o cargo, o valor do aumento e seu novo salário. Os cargos
estão na tabela a seguir, utilize a estrutura escolha...caso*/

public class Exercicio1 {
    public static void main(String[] args) {
        //variaveis
        int codigo;
        double salario, novoSalario;
        //entrada de dados
        codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do cargo: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o seu salário atual: "));
        //processamento e saida de dados
        switch (codigo){
            case 1:
                String cargo = "Escriturário";
                novoSalario = salario+(salario*0.5);
                JOptionPane.showMessageDialog(null,"Seu cargo é: "+cargo+" e seu novo salário é de: R$"+novoSalario);
            break;
            case 2:
                String cargo2 = "Secretário";
                novoSalario = salario+(salario*0.35);
                JOptionPane.showMessageDialog(null,"Seu cargo é: "+cargo2+" e seu novo salário é de: R$"+novoSalario);
            break;
            case 3:
                String cargo3 = "Caixa";
                novoSalario = salario+(salario*0.2);
                JOptionPane.showMessageDialog(null,"Seu cargo é: "+cargo3+" e seu novo salário é de: R$"+novoSalario);
            break;
            case 4:
                String cargo4 = "Gerente";
                novoSalario = salario+(salario*0.1);
                JOptionPane.showMessageDialog(null,"Seu cargo é: "+cargo4+" e seu novo salário é de: R$"+novoSalario);
            break;
            case 5:
                String cargo5 = "Diretor";
                JOptionPane.showMessageDialog(null,"Seu cargo é: "+cargo5+" e seu novo salário é de: R$"+salario);
            break;
            default:
                JOptionPane.showMessageDialog(null,"Digite um código válido !!");
        }
    }
}
