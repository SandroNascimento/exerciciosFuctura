package exerciciosFucturaCasa;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um numero");
	int mes = sc.nextInt();
	
	switch (mes) {
	case 1:
		System.out.println("janeiro");
		
		break;
	case 2:
		System.out.println("fevereiro");
		
		break;
		case 3:
			System.out.println("março");
			
			break;

	default:
		System.out.println("ERRO Tente outro numero");
		break;
	}
		

	}

}
