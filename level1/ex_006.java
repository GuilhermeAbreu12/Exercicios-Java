/* Crie um programa que calcule a área de um retângulo. Peça ao usuário a base e a altura. */
import java.util.Scanner;
public class ex_006 {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        double area, base, altura;

        System.out.print("\nDigite o valor da base em cm: ");
        base = recebe.nextDouble();
        System.out.print("Digite o valor da altura em cm: ");
        altura = recebe.nextDouble();
        
        area = base*altura;

        System.out.println("\nA área do retângulo é de "+area+"cm\n");
        recebe.close();
    }
}
