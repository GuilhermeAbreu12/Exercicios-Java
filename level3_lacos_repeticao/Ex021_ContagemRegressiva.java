/* Contagem Regressiva: Faça um programa que realize uma contagem regressiva de 10 a 0, mostrando a palavra "FOGO!" no final. */
package level3_lacos_repeticao;
public class Ex021_ContagemRegressiva {
    public static void main(String[] args){
        int i;  
        System.out.println("\n============== Contagem regressiva ==============");
        System.out.println("De 10 a 0, um de cada vez\n");
        for (i = 10; i >= 0; i--)
            System.out.println(i);  
        System.out.println("FOGO!");
    }
}
