package exerciciosFucturaCasa;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("Este numero � positivo");
		}
		
		else if (numero == 0) {
			System.out.println("este numero � neutro");
			
		}
		
		else {
				System.out.println("este numero � negativo");
				
		}
	}

}
