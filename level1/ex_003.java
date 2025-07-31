/* Peça ao usuário para digitar dois números inteiros e imprima a soma deles. */
import java.util.Scanner;
public class ex_003 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite um número: ");
        num1 = leia.nextInt();

        System.out.print("Digite outro número: ");
        num2 = leia.nextInt();

        System.out.print("Soma: "+(num1+num2));
        leia.close();
    }
}
