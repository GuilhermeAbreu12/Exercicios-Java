/* Verificação de Triângulo: Peça três valores e verifique se eles podem formar um triângulo (a soma de dois lados deve ser sempre maior que o terceiro lado). */
package level2_condicionais;
import java.util.Scanner;
public class Ex014_DaTriangulo {
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        double lado1, lado2, lado3;
        boolean condicao1, condicao2, condicao3;

        System.out.println("\n============== Verificador de Triângulos ==============");
        System.out.println("Digite três valores e veja se é possível formar um triângulo\n");
        System.out.print("Digite o valor do primeiro lado: ");
        lado1 = recebe.nextDouble();
        System.out.print("Digite o valor do segundo lado: ");
        lado2 = recebe.nextDouble();
        System.out.print("Digite o valor do terceiro lado: ");
        lado3 = recebe.nextDouble();

        condicao1 = lado1 + lado2 > lado3; 
        condicao2 = lado2 + lado3 > lado1; 
        condicao3 = lado3 + lado1 > lado2; 

        if ((condicao1) && (condicao2) && (condicao3))
            System.out.print("Dá ");
        else System.out.print("Não dá ");
       
        System.out.print("para formar um triângulo com lados medindo "+lado1+"; "+lado2+"; "+lado3+".");
        
        recebe.close();
    }
}
