package Exercicios;
import java.util.Scanner;
public class Exercicio_2 {

	public static void main(String[] args) {
/*
Escreva um programa que mostre na tela a mensagem "Olá, Mundo!" 
 Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas para ela: 
Ex: 
Qual é o seu nome? João da Silva 
Olá João da Silva, é um prazer te conhecer! 
*/
		Scanner in = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		//next() lê só até o primeiro espaço (ex.: "Welson"),
		//enquanto nextLine() captura a linha inteira (ex.: "Welson Cruz").
		String nome = in.nextLine();
		System.out.println("Olá " + nome + ", é um prazer te conhecer!");


		

	}

}
