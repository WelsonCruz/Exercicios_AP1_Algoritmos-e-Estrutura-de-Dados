package Arranjo_Exercicio;
import java.util.Scanner;
public class Arranjo {

	public static void main(String[] args) {
		int [] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		int quantidade = 0;
		int menor = a[0];
		int maior = 0;
		int soma = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Qual número voce deseja saber a quantidade de vezes que ocorre a repetição?");
		int procura = in.nextInt();
		
		//length é usada nesse caso pra verificar o tamanho da lista/arranjo
		//For em java precisa do inicio, condição e atualização.
		for(int x= 0; x < a.length; x++ ) {
			
			soma = soma + a[x];
			
			if(a[x]< menor ) {
				menor = a[x];
			}
			if(a[x]>maior) {
				maior = a[x];
			}
			if (procura == a[x]) {
				quantidade +=1;
			}

		}
		System.out.println("O menor valor do arranjo é "+ menor);
		System.out.println("O maior valor do arranjo é "+ maior);
		System.out.println("A soma do arranjo é "+ soma);
		if(quantidade > 0) {
		 System.out.println("O número " + procura + " aparece no arranjo " + quantidade + " vezes");
		}else {
		 System.out.println("O número digitado não está presente na lista");
		
			
		}
	}

}
