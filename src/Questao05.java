import java.util.Arrays;
import java.util.Scanner;

public class Questao05 {
    /*
     * 5. Escreva um programa que vai ler a idade de 5 pessoas,
     * o sistema vai mostrar quantas são maior ou iguais a 18
     * e quantas são de menor.
     */
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
    
        int[] arrayInt = {0,1,2,3,4};
        for(int i = 0; i <5; i++){
            if(i == 0){
            System.out.println("Digite uma idade");
            }
            else{
                System.out.println("Digite outra idade");
            }
            arrayInt[i] = ler.nextInt();
        }
        ler.close();
        Arrays.sort(arrayInt);
        int[] maiorIgual18 = Arrays.stream(arrayInt).filter(x -> x >= 18).toArray();
        int[] menor18 = Arrays.stream(arrayInt).filter(x -> x < 18).toArray();
        System.out.println("Quantidae de idades maior ou igual a 18 anos:");
        System.out.println(maiorIgual18.length + " idade(s) encontrada(s)");
        System.out.println("Indades maior ou igual a 18 anos:");
        for(int i = 0; i < maiorIgual18.length; i++){
            System.out.println( maiorIgual18[i] + " ano(s)");
        }
        System.out.println("Quantidae de idades menors de 18 anos:");
        System.out.println(menor18.length + " idade(s) encontrada(s)");
        System.out.println("Indades menores 18 anos:");
        for(int i = 0; i < menor18.length; i++){
            System.out.println( menor18[i] + " ano(s)");
        }
    }

}
