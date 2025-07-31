/*  Peça ao usuário para digitar seu nome e sobrenome e, em seguida, exiba o nome completo na tela. */
import java.util.Scanner;

public class ex_002{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        String nome, sobrenome;

        System.out.print("Digite seu nome: ");
        nome = leia.nextLine();
        
        System.out.print("Digite seu sobrenome: ");
        sobrenome = leia.nextLine();
        
        System.out.print("Bem-vindo, "+nome+" "+sobrenome);
        leia.close();
    }
}