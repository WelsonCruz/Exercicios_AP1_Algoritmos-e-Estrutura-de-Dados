package Cigarro_TempoPerdido;
import java.util.Scanner;


public class Cigarro_TempoPerdido {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantos cigarros voce fuma por dia?");
		int cigarro = in.nextInt();
		System.out.println("Quantos anos voce fuma?");
		int anos = in.nextInt();
		
		int cigarro_minutos = cigarro * 10;
		int cigarro_anos = cigarro_minutos * anos *365;
		
		int Tempo_Perdido = ((cigarro_anos / 60) / 24);
		
		System.out.println(Tempo_Perdido);
		


	}

}
