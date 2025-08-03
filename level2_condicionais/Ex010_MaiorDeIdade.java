/* Maior de Idade: Peça a idade do usuário e informe se ele é maior de idade (>= 18 anos). */
package level2_condicionais;
import java.util.Scanner;
public class Ex010_MaiorDeIdade {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int idade;

        System.out.print("Digite sua idade: ");
        idade = recebe.nextInt();

        System.out.print("Você é ");
        
        if (idade>=18) System.out.print("maior");
        else System.out.print("menor");

        System.out.print(" de idade");
        recebe.close();
    }
}
