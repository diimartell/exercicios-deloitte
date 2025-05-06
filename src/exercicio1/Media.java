package exercicio1;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        //Calcular a média de 3 notas e determinar se o aluno foi aprovado ou reprovado, considerando a média de aprovação como maior ou igual a 7.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é: " + media);

        if (media >= 7) {
            System.out.println("Você foi aprovado, parabéns!");
        }
        else {
            System.out.println("Que pena, você foi reprovado!");
        }
    }
}
