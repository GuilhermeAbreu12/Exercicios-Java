/* Par ou Ímpar: Peça um número e verifique se ele é par ou ímpar. */
package level2;
import java.util.Scanner;
public class Ex009_ParOuImpar {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        double num;

        System.out.print("Digite um número: ");
        num = recebe.nextDouble();

        System.out.print("O número é ");
        if (num%2 == 0) System.out.print("par"); 
        else System.out.print("ímpar");
        recebe.close();
    }
}
