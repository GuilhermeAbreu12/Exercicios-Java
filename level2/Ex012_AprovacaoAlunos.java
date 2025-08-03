/* Aprovação do Aluno: 
- Peça duas notas de um aluno, 
- calcule a média
- informe se ele foi 
    - aprovado (média >= 7.0), 
    - está de recuperação (média >= 5.0 e < 7.0) 
    - ou foi reprovado (média < 5.0). */
package level2;
import java.util.Scanner;
public class Ex012_AprovacaoAlunos {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        Double nota1, nota2, media;

        System.out.print("Digite uma nota (0-10): ");
        nota1 = recebe.nextDouble();
        while((nota1 < 0) || (nota1 > 10)){
            System.out.print(">> Você digitou uma nota inválida (maior do que 10 ou menor do que 0) \nDigite uma nota (0-10):");
            nota1 = recebe.nextDouble();
        };

        System.out.print("Digite outra nota (0-10): ");
        nota2 = recebe.nextDouble();
        while((nota2 < 0) || (nota2 > 10)){
            System.out.print(">> Você digitou uma nota inválida (maior do que 10 ou menor do que 0) \nDigite outra nota (0-10):");
            nota2 = recebe.nextDouble();
        };

        media = (nota1 + nota2) / 2;
        
        System.out.print("\nSua média é "+media);
        recebe.close();
    }
}
