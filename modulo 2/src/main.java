import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("\nDigite um número: ");
        int numero;
        Scanner myObj = new Scanner(System.in);
        numero = myObj.nextInt();
        System.out.println("O número informado foi " + numero);
    }
}
