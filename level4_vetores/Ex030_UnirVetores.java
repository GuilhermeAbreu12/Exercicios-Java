/* Unir Vetores: Crie dois vetores de 5 posições cada. Preencha-os. Crie um terceiro vetor de 10 posições que contenha os elementos dos dois primeiros vetores (os 5 primeiros do primeiro vetor e os 5 últimos do segundo). */
package level4_vetores;
import java.util.Arrays;
public class Ex030_UnirVetores {
    public static void main(String[] args){
        String[] Vingadores = {"Homem de ferro", "Capitão América", "Thor", "Doutor Estranho", "Homem aranha"};
        String[] GuardioesDaGalaxia = {"Senhor das Estrelas", "Gamora", "Mantis", "Drax", "Groot"};
        String[] Ultimato = new String[10];
        int i;
        for (i = 0; i <=4; i++){
            Ultimato[i] = Vingadores[i];
        }
        for (i = 5; i <=9; i++){
            Ultimato[i] = GuardioesDaGalaxia[i-5];
        }
        System.out.println("\n============== Vingadores em Ultimato ==============");
        System.out.println("\nO time dos Vingadores em Ultimato contava com: \n"+Arrays.toString(Ultimato));
    }
}
