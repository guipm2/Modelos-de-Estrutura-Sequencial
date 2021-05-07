import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nInsira um valor em metros a ser convertido em centimetros: ");
        float valorM = myObj.nextFloat();
        float valorCm = valorM * 100f;
        System.out.println("O valor convertido para centimetros é: " + valorCm);

    }
}
