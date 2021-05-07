import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int numero1, numero2, soma;
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nInsira o primeiro número: ");
        numero1 = myObj.nextInt();
        System.out.println("\nInsira o segundo número: ");
        numero2 = myObj.nextInt();
        soma = numero1 + numero2;
        System.out.println("\nA soma dos dois números informados é: " + soma);

    }
}
