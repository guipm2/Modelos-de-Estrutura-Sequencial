import java.util.Scanner;

//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.


public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nInsira a temperatura em Fahrenheit que deseja converter para Celsius: ");
        float tempFahrenheit = myObj.nextFloat();
        float tempCelsius = 5 * ((tempFahrenheit - 32) / 9);
        System.out.println("A temperatura convertida em Celsius é: " + tempCelsius);

    }
}
