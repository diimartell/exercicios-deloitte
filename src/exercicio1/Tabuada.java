package exercicio1;

public class Tabuada {
    public static void main(String[] args) {
        //Exibindo no terminal a tabuada de 5.

        int valor = 5;

        for(int i = 1; i <= 10; i++) {
            System.out.println(valor + "X" + i + "=" + (valor * i));
        }
    }
}
