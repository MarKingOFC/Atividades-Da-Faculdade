package Excercicios.ExAl10;

import javax.swing.JOptionPane;

/*1- Uma empresa comercializa um produto e deseja fazer uma estatística do último ano de
suas vendas
Exemplo:
Desenvolver um algoritmo que seja capaz de:
a) Encontrar o menor e maior quantidade vendida.
b) Encontrar a média vendida neste período.
c) Determinar quantos dias a média vendida foi superada.
OBS: Inicialize o vetor na sua declaração com valores a sua escolha, não precisa fazer a
leitura
*/

public class Exercicio1 {
    public static void main(String[] args) {
        //declaração e inicialização do vetor
        int vp[] = new int [4]; 
        //variáveis
        int maior=0, menor, diasMedSup=0, qtde=0, i;
        double media, acumu=0;
        //
        for(i=0; i<4; i++){
            vp[i] = i+2;
            acumu += vp[i];
            qtde++;
        }
        media = acumu/qtde;
        
        for(i=0; i<4; i++){
            if (vp[i] > maior)
                maior = vp[i];
        }
        menor = vp[0];
        for(i=0; i<4; i++){
            if (vp[i] < menor)
                menor = vp[i];
        }
        for(i=0; i<4; i++){
            if (vp[i] > media)
                diasMedSup ++;
        }
        JOptionPane.showMessageDialog(null, "Menor quantidade vendida: " + menor + "\nMaior quantidade vendida: "
 + maior + "\nMédia vendida no período: " + media + "\nQuantidade de dias que a media foi superada " + diasMedSup);
    }
}
