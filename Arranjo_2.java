package Arranjo_Exercicio;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;


public class Arranjo_2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Qual número voce deseja saber a quantidade de vezes que ocorre a repetição?");
		int procura = in.nextInt();		
		int quantidade = 0;
		
		int [] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		//Verifica o menor valor presente no arranjo.;
		int menor = Arrays.stream(a).min().getAsInt();
		
		//Verifica o maior valor presente no arranjo
		OptionalInt maior = Arrays.stream(a).max();
		
		if (maior.isPresent()) {
			System.out.println("O maior número no arranjo é: " + maior.getAsInt());	
		}else {
			System.out.println("O arranjo está vazio");
		}
		//Soma o arranjo
		int soma = Arrays.stream(a).sum();
		
		
	
		for(int x= 0; x < a.length; x++ ) {
			if (procura == a[x]) {
				quantidade +=1;
			}
		
		}
		System.out.println("O menor valor do arranjo é "+ menor);
		System.out.println("A soma do arranjo é "+ soma);
		
		if(quantidade > 0) {
		 System.out.println("O número " + procura + " aparece no arranjo " + quantidade + " vezes");
		} else {
		 System.out.println("O número digitado não está presente na lista");
		
			
		}
	}

}
