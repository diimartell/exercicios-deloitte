package exercicio1;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        //Leitura de um número para determinar se o mesmo é par ou ímpar.

        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if(numero % 2 == 0) {
            System.out.println("O número digitado é par.");
        }
        else {
            System.out.println("O número digitado é ímpar.");
        }
    }
}
