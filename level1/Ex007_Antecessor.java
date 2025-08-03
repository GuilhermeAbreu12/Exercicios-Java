/* Peça um número inteiro e mostre na tela o seu antecessor e o seu sucessor. */
import java.util.Scanner;
public class Ex007_Antecessor {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int num, antecessor, sucessor;

        System.out.print("Digite um número: ");
        num = recebe.nextInt();

        sucessor = num + 1;
        antecessor = num - 1;
        System.out.print("\nNúmero: "+num+"\nAntecessor: "+antecessor+"\nSucessor: "+sucessor);

        recebe.close();
    }
}
