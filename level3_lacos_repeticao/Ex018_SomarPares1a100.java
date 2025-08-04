/* Soma dos Pares: Use um laço while para calcular e mostrar a soma dos números pares de 1 a 100. */
package level3_lacos_repeticao;
import java.util.Scanner;
public class Ex018_SomarPares1a100 {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int i = 0, soma = 0;
        System.out.println("\n============== Soma dos números pares ==============");
        System.out.println("Vou te mostrar a soma de todos os números pares de 1 a 100\n");
        while(i <= 100){
            if (i % 2 == 0){
                soma+=i;
            }
            i++;
        }
        System.out.print("A soma de todos os números pares de 1 a 100 é: "+soma);
        recebe.close();
    }
}
