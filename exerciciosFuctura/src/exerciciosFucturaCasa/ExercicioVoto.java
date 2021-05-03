package exerciciosFucturaCasa;

import java.util.Scanner;

public class ExercicioVoto {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Qual a sua idade ?");
	int idade = sc.nextInt();
	
	if (idade < 16) {
		System.out.println("Você não pode votar");
		
	}
	else if ((idade == 18) || (idade > 18) && (idade < 70)) {
		System.out.println("O voto é obrigatorio");
		
	}
	else if (idade < 18) { 
		System.out.println("Seu voto é opcional");
		
		
	}
	else if ((idade > 70) || (idade == 70))
	{System.out.println("Seu voto é opcional");
		
	}
	}
	

}
