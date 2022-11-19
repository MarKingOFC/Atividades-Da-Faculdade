import javax.swing.JOptionPane;

/*8- Elaborar um algoritmo que leia um conjunto de valores reais, correspondentes a 80
notas dos alunos de uma turma, notas estas que variam de 0 a 10. Calcule e mostre:
a) A quantidade de alunos aprovados (nota >= 6.0)
b) a média das notas da turma
*/

public class Exercicio8 {
    public static void main(String[] args) {
        //variaveis
        double nota, media, soma, notaAcima;
        int alunos;
        char resp;
        //entrada de dados
        soma = 0;
        alunos = 0;
        resp = 's';
        notaAcima = 0;
        //processamento
        while (resp == 's') {
            nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota do aluno:"));
            soma = soma + nota;
            alunos++;
            resp = JOptionPane.showInputDialog(null, "Deseja continuar para o proximo aluno? s/n").toLowerCase()
                    .charAt(0); 
            if (nota >= 6)
                notaAcima++;

            if (alunos > 80) {
                System.out.println("acabou a quantidade de alunos");
                break;

            }
        }
        media = soma / alunos;
        //saida de dados
        JOptionPane.showMessageDialog(null, "A media da sala é: " + media);
        JOptionPane.showMessageDialog(null, "A quantidade de alunos aprovados foram de " + notaAcima);

    }
}

/*
 * import javax.swing.JOptionPane;
 * 
 * public class Ex05_mediaIndeterminada_while { public static void main(String[]
 * args) { double nota, media, soma; char resp; resp = 's'; // inicializa aqui
 * 
 * soma = 0; int alunos = 0; while (resp == 's') { // condiciona aqui nota =
 * Double.parseDouble(JOptionPane.showInputDialog(null,
 * "Digite a media do aluno:")); soma = soma + nota; alunos++; resp =
 * JOptionPane.showInputDialog(null,
 * "Deseja conjtinuar? s/n").toLowerCase().charAt(0); // ATUALIZA } media = soma
 * / alunos; JOptionPane.showMessageDialog(null, "E media da disciplina é: " +
 * media); } }
 */