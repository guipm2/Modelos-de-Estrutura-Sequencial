import java.util.Scanner;

//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.


public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nInsira a temperatura em Celsius que deseja converter para Fahrenheit: ");
        float tempCelsius = myObj.nextFloat();
        float tempFahrenheit = ((tempCelsius * 9) / 5) + 32;
        System.out.println("A temperatura convertida em Fahrenheit é: " + tempFahrenheit);

    }
}
