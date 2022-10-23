import java.util.Scanner;

public class Questao03 {
    /*
     * 3. Escreva um programa que vai ler 2 números,
     * o sistema vai escrever na tela todos os número
     * entre os 2 digitados.
     */
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_VERDE = "\u001B[32m";

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n1 = ler.nextInt();
        System.out.println("Digite outro numero");
        int n2 = ler.nextInt();
        String msg = "";
        ler.close();
        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                if(i == n1){
                    msg += i;
                }
                else{
                    msg += ", " + i;
                }

            }
        }
        else{
            for (int i = n2; i <= n1; i++) {
                if(i == n2){
                    msg += i;
                }
                else{
                    msg += ", " + i;
                }
            }
        }
        System.out.println(msg);
    }
}
