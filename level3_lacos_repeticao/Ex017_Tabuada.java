/* Tabuada: Peça um número ao usuário e use um laço for para imprimir a tabuada desse número (de 1 a 10). */
package level3_lacos_repeticao;
import java.util.Scanner;
public class Ex017_Tabuada {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int numero, i;

        System.out.println("\n============== Tabuada de um número ==============");
        System.out.println("Digite um número para ver sua tabuada\n");
        System.out.print("Digite um número: ");
        numero = recebe.nextInt();
        recebe.close();

        for (i = 1; i <=10; i++) 
            System.out.println(numero+" * "+i+" = "+numero*i);
    }
}
