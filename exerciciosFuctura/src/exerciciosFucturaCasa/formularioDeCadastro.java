package exerciciosFucturaCasa;

import java.util.Scanner;

public class formularioDeCadastro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ol� como � o seu nome ?");
		String nome = sc.nextLine();
		
		System.out.println("Agora digite o numero do seu CPF:");
		String cpf = sc.nextLine();
		
		System.out.println("Qual a sua idade ?");
	    String idade = sc.nextLine();
		
		System.out.println("Qual a sua altura ? ");
		String altura = sc.nextLine();
		
		System.out.println("Ol� " + nome + ", Voc� � portador do cpf " + cpf + " Tem " + idade + " e " + altura + " de altura");
		
		
				sc.close();

	}

}
