/* Peça ao usuário para digitar três notas de um aluno e calcule e exiba a média aritmética. */
import java.util.Scanner;
public class ex_004 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int nota1, nota2, nota3;
        double media, soma;

        System.out.print("Digite a 1ª nota: ");
        nota1 = leia.nextInt();
        System.out.print("Digite a 2ª nota: ");
        nota2 = leia.nextInt();
        System.out.print("Digite a 3ª nota: ");
        nota3 = leia.nextInt();
        
        soma = nota1+nota2+nota3;
        media = soma/3;
        System.out.print("Soma: "+soma+" \nMédia: "+media);
        leia.close();
    }
}
