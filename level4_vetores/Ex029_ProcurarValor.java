/* Buscar Elemento: Crie um vetor com 10 nomes. Peça ao usuário para digitar um nome e verifique se ele existe no vetor. */
package level4_vetores;
import java.util.Scanner;
public class Ex029_ProcurarValor {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        String[] nomes = {
            "Geraldo",
            "Bruno",
            "Carlos",
            "José",
            "Yasmin",
            "Amanda",
            "Helena",
            "Emilly",
            "Isaque",
            "Renato"
        };
        String nome;
        int i;
        boolean existe = false;

        System.out.println("\n============== Será que tem? ==============");
        System.out.println("Digite um nome e eu direi se está ou não no vetor\n");

        System.out.print("Digite um nome: ");
        nome = recebe.nextLine();
        recebe.close();

        for (i = 0; i <= 9; i++){
            if (nomes[i].contains(nome)) {
                existe = true;
                break;
            }
        }
        if (!existe) System.out.print("Não existe");
        else System.out.print("Existe sim");
    }
}
