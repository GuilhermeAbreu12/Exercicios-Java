/* Peça um número e exiba o seu dobro e o seu triplo. */
import java.util.Scanner;
public class ex_008 {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        double num;

        System.out.print("Digite um número: ");
        num = recebe.nextInt();

        System.out.print("\nNúmero: "+num+"\nDobro: "+(num*2)+"\nTriplo: "+(num*3));
        recebe.close();
    }
}
