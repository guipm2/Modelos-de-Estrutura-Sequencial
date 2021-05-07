import java.util.Scanner;

//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nPor favor insira o valor do raio do circulo: ");
        float raioCirculo = myObj.nextFloat();
        float pi = 3.14f;
        float areaCirculo = pi * (raioCirculo * raioCirculo);
        System.out.println("O valor da area desse circulo é: " + areaCirculo);

    }
}
