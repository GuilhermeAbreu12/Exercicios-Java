/* Validação de Senha: Peça ao usuário para digitar uma senha. Continue pedindo até que ele digite a senha correta ("1234"). */
package level3_lacos_repeticao;
import java.util.Scanner;
public class Ex019_ValidarSenha {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        String senha = "PythonMelhorQueJava", userSenha;

        System.out.println("============== Bem-vindo de volta ==============");
        System.out.println("Estamos satisfeitos em te ver novamente, Abreu, para entrar:\n");
        System.out.print("Digite sua senha: ");
        userSenha = recebe.nextLine();
        while (!userSenha.equals(senha)){
            System.out.println("hum... sei não, essa é a senha do seu melhor amigo");
            System.out.print("Digite a SUA senha: ");
            userSenha = recebe.nextLine();
        }
        System.out.println("Senha correta, bem-vindo!");
        recebe.close();
    }
}
