/* Média do Vetor: Preencha um vetor com 5 notas e calcule a média das notas armazenadas no vetor. */
package level4_vetores;
import java.util.Scanner;
public class Ex028_MediaNotas {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int[] vetor = new int[5];
        int i = 0, media = 0;
        
        System.out.println("\n============== Média das notas ==============");
        System.out.println("Digite 5 notas (0-10) e mostrarei a média delas\n");
        
        while (i <= 4){
            System.out.print("Digite a "+(i+1)+"º nota: ");
            vetor[i] = recebe.nextInt();
            while ((vetor[i] < 0) || (vetor[i] > 10)){
                System.out.println("Valor inválido, digite uma nota entre 0 e 10");
                System.out.print("Digite a "+(i+1)+"º nota: ");
                vetor[i] = recebe.nextInt();
            }
            media += vetor[i];
            i++;
        }
        media /= 5;
        System.out.print("A média dessas cinco notas é "+media);
        recebe.close();
    }
}
