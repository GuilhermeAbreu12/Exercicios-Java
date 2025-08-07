/* Soma dos Elementos: Crie um vetor de 8 posições, preencha-o e calcule a soma de todos os seus elementos. */
package level4_vetores;
import java.util.Scanner;
public class Ex025_SomarVetores {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int[] vetor = new int[8];
        int i = 0, soma = 0;
        
        System.out.println("\n============== Somador de valores ==============");
        System.out.println("Digite 8 números inteiros e mostrarei a soma deles\n");

        while (i <= 7){
            System.out.print("Digite o "+(i+1)+"º número: ");
            vetor[i] = recebe.nextInt();
            i++;
        }
        recebe.close();
        for (i = 0; i<= 7; i++){
            soma+= vetor[i];
        }
        System.out.print("A soma dos oito números digitados é "+soma);
    }
}
