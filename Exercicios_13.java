package Exercicios;
import java.util.Scanner;

public class Exercicios_13 {

	public static void main(String[] args) {
		/*
Faça um programa em Java que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.
		*/
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o seu salário ");
		float salario = in.nextFloat();
		float novosalario = (float) (salario*1.15);
		System.out.println("Seu novo salário é de R$ " +novosalario);
		
		


	}

}
