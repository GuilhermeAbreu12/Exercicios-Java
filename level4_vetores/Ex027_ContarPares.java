/* Contar Pares: Preencha um vetor com 10 números inteiros e conte quantos deles são pares. */
package level4_vetores;
import java.util.Scanner;
public class Ex027_ContarPares {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int[] vetor = new int[10];
        int pares = 0, i = 0;

        System.out.println("\n============== Contador de pares ==============");
        System.out.println("Digite 10 números inteiros e mostrarei quantos deles são pares\n");
        while (i <= 9){
            System.out.print("Digite o "+(i+1)+"º número: ");
            vetor[i] = recebe.nextInt();
            if (vetor[i] % 2 == 0) pares += 1;
            
            i++;
        }
        System.out.print("Dentre os 10 números digitados, "+pares+" são pares");
        recebe.close();
    }
}
