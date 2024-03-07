import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definindo o número limite da sequência de Fibonacci
        int limite = 100;

        int a = 0;
        int b = 1;
        int c = 0;
        String sequencia = "0, 1";
        while (c <= limite) {
            c = a + b;
            sequencia += ", " + c;
            a = b;
            b = c;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (sequencia.contains(Integer.toString(numero))) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
