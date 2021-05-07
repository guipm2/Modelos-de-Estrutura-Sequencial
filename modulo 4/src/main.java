import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4;
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nInsira suas 4 notas do bimestre: ");
        nota1 = myObj.nextFloat();
        nota2 = myObj.nextFloat();
        nota3 = myObj.nextFloat();
        nota4 = myObj.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4) / 4.0F;
        System.out.println("\nSua média no bimestre foi " + media);
    }
}
