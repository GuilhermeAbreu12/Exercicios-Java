/* Fatorial: Peça um número e calcule o seu fatorial. Ex: 5! = 5 * 4 * 3 * 2 * 1. */
package level3_lacos_repeticao;
import java.util.Scanner;
public class Ex020_Fatorial {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int numero, i, fatorial = 1;
        System.out.println("\n============== Calculadora de Fatorial ==============");
        System.out.println("Digite um número inteiro maior do que 1 para saber o fatorial\n");
        System.out.print("\nDigite um número: ");
        numero = recebe.nextInt();
        
        while (numero <= 1){
            System.out.println("Você digitou um número inválido, "+numero+" é menor do que 1");
            System.out.print("Digite um número inteiro maior do que 1: ");
            numero = recebe.nextInt();
        }
        recebe.close();

        for (i = numero; i>=1; i--){
            fatorial *= i;
        }
        System.out.print("O fatorial de "+numero+" é "+fatorial);
    }
}
