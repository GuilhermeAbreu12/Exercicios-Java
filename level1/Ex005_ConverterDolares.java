/* Crie um programa que converta um valor em Reais (R$) para Dólares (US$). Peça ao usuário o valor em Reais e a cotação do dólar. */
import java.util.Scanner;
public class Ex005_ConverterDolares {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        double reais, cotacao, dolares;

        System.out.print("Digite o valor em Reais: R$ ");
        reais = recebe.nextDouble();

        System.out.print("Digite a cotação do Dólar: R$ ");
        cotacao = recebe.nextDouble();
        dolares = (reais*cotacao);

        System.out.print("R$ "+reais+"\nUS$ "+dolares);
        recebe.close();
    }
}
