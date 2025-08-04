/* Dia da Semana: Peça um número de 1 a 7 e imprima o dia da semana correspondente (1-Domingo, 2-Segunda, etc.). Se o número for inválido, informe o usuário. */

package level2_condicionais;
import java.util.Scanner;
public class Ex015_DiaDaSemana {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int numero;
        String dia = "Erro :(";

        System.out.println("\n============== Dia da Semana ==============");
        System.out.println("Digite um valor e veja qual é o dia da semana correspondente\n");
        System.out.print("Digite um número: ");
        numero = recebe.nextInt();
        
        while ((numero < 1) || (numero > 7)){
            System.out.println(">> Você digitou um número inválido, digite um número inteiro entre 1 e 7");
            System.out.print("Digite um número: ");
            numero = recebe.nextInt();
        }
        
        switch(numero){
            case 1:
                dia = "o Domingo";
                break;
            case 2:
                dia = "a Segunda-feira";
                break;
            case 3:
                dia = "a Terça-feira";
                break; 
            case 4:
                dia = "a Quarta-feira";
                break;
            case 5:
                dia = "a Quinta-feira";
                break;
            case 6:
                dia = "a Sexta-feira";
                break;
            case 7:
                dia = "o Sábado";
                break;
        }
        System.out.print(">> O dia da semana correspondente ao número "+numero+" é "+dia); 

        recebe.close();
    }
}
