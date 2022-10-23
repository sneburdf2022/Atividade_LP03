import java.util.Scanner;
public class Questao04 {
/*
 * 4. Escreva um programa que vai ler uma palavra, 
 * se a palavra for diferente de "Java-2022" o retorno 
 * vai ser "Palavra Errada" se igual "Palavra Ok" a pessoa 
 * pode faze no máximo 5 tentativas de acertar a palavra.
 */
public static void main(String[] args) throws Exception {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um palavra");
    String msg = ler.nextLine();
    String frase = "Java-2022" ;    
    ler.close();
    if(msg.equals(frase)){
        System.out.println("Palavra Ok");

    }
    else{
        System.out.println("Palavra Errada");
    }
}
}
