import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string que deseja inverter: ");
        String strOriginal = scanner.nextLine();
        scanner.close();
        //Convertendo a String para um array
        char[] caracteres = strOriginal.toCharArray();

        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }

        String strInvertida = new String(caracteres);

        System.out.println("String original: " + strOriginal);
        System.out.println("String invertida: " + strInvertida);
    }
}
