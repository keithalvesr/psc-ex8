import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
    //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
    //Calcule e mostre o total do seu salário no referido mês.
    double valorhora;
    double horasMes;
    double salarioTotalMes;
    System.out.println("Bem vindo ao programa de calculo de Salaraio Mensal!");
    //Ação do usuário: Informar quanto ganha por hora e o número de horas trabalhadas no mês:
    Scanner teclado = new Scanner (System.in);
    System.out.println("Informe quando você ganha por hora: ");
    valorhora = teclado.nextDouble();
    System.out.println();
    System.out.println("Infome o número de horas trabalhadas por mês: ");
    horasMes = teclado.nextDouble();
    teclado.close();

    //Ação do programa: Calculas e mostrar o total do salario no mês:
    salarioTotalMes = valorhora * horasMes;

    //Resposta programa: Mostrar total salario no referido mes:
    System.out.println("O total do seu salario no referido mês é:  " + salarioTotalMes);
    

    }
    
}
