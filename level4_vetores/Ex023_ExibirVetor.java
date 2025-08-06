/* Exibir Vetor: Usando o vetor do exercício anterior, crie um laço for para exibir todos os valores armazenados. */
package level4_vetores;
import java.util.Scanner;
public class Ex023_ExibirVetor{
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int[] numeros = new int[5];
        int i;

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

        recebe.close();
        for (i = 0; i <=numeros.length -1; i++){
            if (i == numeros.length - 1){
                System.out.print(numeros[i]+". ");
            } else{
                System.out.print(numeros[i]+", ");
            }
        }
    }
}