/* Criar e Preencher: Crie um vetor de 5 posições de números inteiros e preencha-o com valores digitados pelo usuário. */
package level4_vetores;
import java.util.Scanner;
import java.util.Arrays;
public class Ex022_CriarVetores{
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("\n============== Criar e Preencher vetores ==============");
        System.out.println("Digite 5 números inteiros e mostrarei eles dentro de um vetor\n");
        System.out.print("Digite o primeiro número: ");
        numeros[0] = recebe.nextInt();
        System.out.print("Digite o segundo número: ");
        numeros[1] = recebe.nextInt();
        System.out.print("Digite o terceiro número: ");
        numeros[2] = recebe.nextInt();
        System.out.print("Digite o quarto número: ");
        numeros[3] = recebe.nextInt();
        System.out.print("Digite o quinto número: ");
        numeros[4] = recebe.nextInt();

        System.out.print(Arrays.toString(numeros));
        recebe.close();
    }
}