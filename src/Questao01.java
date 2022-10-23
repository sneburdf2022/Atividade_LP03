import java.util.Scanner;
public class Questao01 {
/* 1. Escreva um programa que vai ler um número, 
    o sistema vai escrever na tela a tabuada de 
    1 até 10 do número digitado.
*/
public static void main(String[] args) throws Exception {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um número inteiro");
    int n1 = ler.nextInt();
    ler.close();
    for(int i = 1; i<=10; i++){
        System.out.println( ANSI_RED  + i + ANSI_RESET +" x "+  n1 +  " = " + ANSI_VERDE + (i * n1) +  ANSI_RED );
    }
    
    
}
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m"; 
    public static final String ANSI_VERDE = "\u001B[32m";
}
