import java.util.Arrays;
import java.util.Scanner;
public class Questao06 {
    /*
     * 6. Escreva um programa que vai ler 5 números o sistema 
     * vai mostrar o maior o menor a soma e a média dos números digitados.
     */
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
    
        int[] arrayInt = {0,1,2,3,4};
        for(int i = 0; i <5; i++){
            if(i == 0){
            System.out.println("Digite um número");
            }
            else{
                System.out.println("Digite outro número");
            }
            arrayInt[i] = ler.nextInt();
        }
        ler.close();
        Arrays.sort(arrayInt);
        System.out.println("O maior número digitado é:");
        System.out.println(arrayInt[0]);
        System.out.println("O menor número digitado é:");
        System.out.println(arrayInt[arrayInt.length-1]);
        int soma = 0;
        for(int i = 0; i < arrayInt.length; i++){
            soma = soma + arrayInt[i];
        }
        float media = soma / arrayInt.length;
        System.out.println("A soma dos números digitados é:");
        System.out.println(soma);
        System.out.println("A média dos números digitados é:");
        System.out.println(media);


    }
}
