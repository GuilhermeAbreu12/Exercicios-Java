/* Maior de Dois Números: Peça dois números e indique qual deles é o maior. */
package level2_condicionais;
import java.util.Scanner;
public class Ex011_MaiorNumero {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        double num1, num2;
        boolean maior;

        System.out.print("Digite um número: ");
        num1 = recebe.nextDouble();
        System.out.print("Digite outro número: ");
        num2 = recebe.nextDouble();
        
        maior = num1 != num2;

        if (maior){
            System.out.print("O maior número é o ");
            
            if (num1 > num2) System.out.print(num1);
            else System.out.print(num2);
        }
        else System.out.print("Os números são iguais");
            
        recebe.close();
    }
}
