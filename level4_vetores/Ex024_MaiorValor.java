/* Maior Valor: Crie um vetor de 10 posições, preencha-o com números aleatórios (ou digitados) e encontre o maior valor dentro dele. */
package level4_vetores;
import java.util.Scanner;
public class Ex024_MaiorValor {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int[] vetor = new int[10];
        int i = 0, maior = 0;

        System.out.println("\n============== Maior valor ==============");
        System.out.println("Digite 10 números inteiros e mostrarei qual deles é o maior\n");
        
        while (i <= 9){
            System.out.print("Digite o "+(i+1)+"º número: ");
            vetor[i] = recebe.nextInt();
            i++; // Me senti até mais inteligente depois de fazer esse while :)
        }
        recebe.close();

        for (i = 0; i <= 9; i++){
            if (i == 0){
                maior = vetor[i];
            }
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
        System.out.print("O maior valor digitado foi: "+maior);
    }
}
