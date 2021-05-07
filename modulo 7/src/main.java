import java.util.Scanner;

//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nInsira um valor para ser o lado do quadrado: ");
        float ladoQuadrado = myObj.nextFloat();
        float areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("O valor do dobro da area desse quadrado é: " + (2 * areaQuadrado));
        
    }
}
