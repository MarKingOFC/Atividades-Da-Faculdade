import java.util.Scanner;

/*9- Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de
idade, sexo (M/F) e salário. Faça um algoritmo que informe:
a) a média de idade do grupo;
b) a média de salários dos homens;
c) quantidade de mulheres com salário abaixo de R$600,00.
Encerre a entrada de dados quando for digitada uma idade negativa (os dados da idade
negativa não podem entrar nos cálculos dos itens solicitados acima).*/

public class Exercicio9 {
	public static void main(String[] args) {
		//variaveis
		int idade = 0 , maior = 0, menor = 9999, contM = 0, cont = 0;
		double salario = 0, media = 0;
		char sexo;
		Scanner input = new Scanner(System.in);
        //processamento
		do {
			System.out.println("Informe sua idade");
			idade = input.nextInt();
			if (idade < 0) {
				System.out.println("Idade nao permitida, programa encerrado.");
				break;
			}
			System.out.println("Informe o sexo [M] para homem, [F] para mulher");
			sexo = input.next().charAt(0);
			System.out.println("Informe o salario");
			salario = input.nextDouble();
			media = media + salario;
			if (idade > maior) {
				maior = idade;
			}
			if (idade < menor) {
				menor = idade;
			}
			if ((sexo == 'f' || sexo == 'F')) {
				if (salario < 600) {
					contM++;
				}
            
			}
			cont++;
		} while (idade > 0);
		//saida de dados
		System.out.println("A media do salario do grupo: "+media/cont);
		System.out.println("A maior idade do grupo é: "+maior);
		System.out.println("A menor idade do grupo é: "+menor);
		System.out.println("A quantidade de mulheres com salario ateh 600: "+contM);
        
        input.close();
	}
    
    
}

