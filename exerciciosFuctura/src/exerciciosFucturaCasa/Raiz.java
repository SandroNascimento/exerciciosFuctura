package exerciciosFucturaCasa;

import java.util.Scanner;

public class Raiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = sc.nextInt();
		
		int raiz = (int) Math.sqrt(numero);
		System.out.println(raiz);
	}

}
