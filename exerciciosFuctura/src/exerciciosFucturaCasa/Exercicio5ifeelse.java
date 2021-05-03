package exerciciosFucturaCasa;

import java.util.Scanner;

public class Exercicio5ifeelse {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite sua nota");
	int nota = sc.nextInt();
	int x = 7;
	int y = 5;
	
	if (nota >= x) {
		System.out.println("Você passou direto");
		
	}
	else if(nota < x && nota >=y) { 
		System.out.println("vOCÊ TEM DIREITO A FAZDEER UMA PROVA DE RECUPERAÇÃO");
		
	}	
	else  { System.out.println("reprovado direto");
		
	}
	
	sc.close();
	

	}

}
