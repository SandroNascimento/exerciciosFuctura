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
		System.out.println("Voc� passou direto");
		
	}
	else if(nota < x && nota >=y) { 
		System.out.println("vOC� TEM DIREITO A FAZDEER UMA PROVA DE RECUPERA��O");
		
	}	
	else  { System.out.println("reprovado direto");
		
	}
	
	sc.close();
	

	}

}
