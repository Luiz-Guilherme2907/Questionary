public class Main {
    public static void main(String[] args) {

        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        // O resultado do código é a soma dos primeiros 13 números inteiros.
        System.out.println("A soma é: " + soma);
    }
}