import java.util.Scanner;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês.

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nDigite o quanto você ganha por hora:");
        float valorHora = myObj.nextFloat();
        System.out.println("Digite o número de horas trabalhadas no mês:");
        float numeroHoras = myObj.nextFloat();
        float salarioMes = valorHora * numeroHoras;
        System.out.println("O total do seu salário este mês será: " + salarioMes);

    }

}
