package Exercicios;

import java.util.Scanner;
public class Exercicios_6 {

	public static void main(String[] args) {
/*
Faça um programa em Java que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
*/
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = in.nextInt();
		int anterior = numero - 1;
		int proximo = numero + 1;
		System.out.println("O antecessor de " + numero + " é "+ anterior );
		System.out.println("O sucessor de " + numero + " é " + proximo);
		

	}

}
