/* Calculadora com Menu: Crie uma calculadora que ofereça as opções: 1-Somar, 2-Subtrair, 3-Multiplicar, 4-Dividir. O usuário escolhe a operação e digita dois números. Use switch-case. */
package level2_condicionais;
import java.util.Scanner;
public class Ex013_Calculadora {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int escolha;
        double num1, num2;
        
        System.out.print("[1] Somar\n[2] Subtrair\n[3] Multiplicar\n[4] Dividir\nDigite o número escolhido: ");
        escolha = recebe.nextInt();

        System.out.print("Digite o primeiro número: ");
        num1 = recebe.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = recebe.nextDouble();

        switch (escolha){
            case 1:
                System.out.print(num1+" + "+num2+" = "+(num1+num2));
                break;
            case 2:
                System.out.print(num1+" - "+num2+" = "+(num1-num2));
                break;
            case 3:
                System.out.print(num1+" * "+num2+" = "+(num1*num2));
                break;
            case 4:
                System.out.print(num1+" / "+num2+" = "+(num1/num2));
                break;
        }

        recebe.close();
    }
}
