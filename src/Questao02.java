import java.util.Scanner;
public class Questao02 {
    /* 2. Escreva um programa que vai ler 
        uma mensagem e um número, o sistema vai repetir 
        a mensagem digitada x vezes o número digitado.
     */
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m"; 
    public static final String ANSI_VERDE = "\u001B[32m";
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um mensagem");
        String msg = ler.nextLine();
        System.out.println("Digite o numero de repetições");
        int n1 = ler.nextInt();
        ler.close();
        for(int i = 1; i<=n1; i++){
            System.out.println(i + " - " +msg);
        }       
    }
}
