package Exercicios;
import java.util.Scanner;
public class Exercicios_9 {

	public static void main(String[] args) {
/*
Faça um programa em Java que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$5,45. (ou cotação
atual)
*/
		Scanner in = new Scanner(System.in);
		System.out.println("Quantos dinheiro voce possui na carteira (Em R$)? ");
		float carteira = in.nextFloat();
		int converter = (int) (carteira /3.45);
		System.out.println("Valor convertido: US$ " + converter);




		
	}

}
