package exercicio1;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        //Leitura de dois números, calculando e exibindo a soma de ambos.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma dos números é: " + soma);
    }
}
