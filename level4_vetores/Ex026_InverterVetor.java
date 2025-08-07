/* Ordem Inversa: Peça para o usuário preencher um vetor de 6 posições e, em seguida, exiba os valores na ordem inversa em que foram digitados. */
package level4_vetores;
import java.util.Scanner;
public class Ex026_InverterVetor {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int[] vetor = new int[6];
        int i = 0;
        System.out.println("\n============== Inversor de valores ==============");
        System.out.println("Digite 6 números inteiros e os mostrarei na ordem reversa\n");
        while (i <= 5){
            System.out.print("Digite o "+(i+1)+"º número: ");
            vetor[i] = recebe.nextInt();
            i++;
        }
        recebe.close();
        for (i = 5; i >= 0; i--){
            if (i != 0)
                System.out.print(vetor[i]+" - ");
            else
                System.out.print(vetor[i]);
        }
    }
}
